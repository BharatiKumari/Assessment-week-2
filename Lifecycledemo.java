public class LifeCycleDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(() -> {
            try { Thread.sleep(500); } catch(Exception e) {}
        });

        System.out.println("State 1: " + t.getState()); // NEW
        t.start();
        System.out.println("State 2: " + t.getState()); // RUNNABLE
        Thread.sleep(100);
        System.out.println("State 3: " + t.getState()); // TIMED_WAITING
    }
}
