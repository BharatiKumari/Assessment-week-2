public class GCDemo {
    @Override
    protected void finalize() {
        System.out.println("Garbage Collector called: Object destroyed.");
    }

    public static void main(String[] args) {
        GCDemo obj1 = new GCDemo();
        obj1 = null; // Eligible for GC
        System.gc(); // Requesting JVM for GC
    }
}
