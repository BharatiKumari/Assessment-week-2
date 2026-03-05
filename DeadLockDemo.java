public class DeadlockDemo {
    public static void main(String[] args) {
        final String R1 = "Lock1", R2 = "Lock2";
        
        new Thread(() -> {
            synchronized(R1) {
                System.out.println("T1 locked R1");
                try { Thread.sleep(100); } catch(Exception e) {}
                synchronized(R2) { System.out.println("T1 locked R2"); }
            }
        }).start();

        new Thread(() -> {
            synchronized(R2) {
                System.out.println("T2 locked R2");
                synchronized(R1) { System.out.println("T2 locked R1"); }
            }
        }).start();
    }
}
