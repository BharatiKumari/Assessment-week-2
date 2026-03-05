public class StaticDemo {
    static int count = 0; // Shared across all objects
    
    static void showCount() {
        System.out.println("Static Count: " + count);
    }

    public static void main(String[] args) {
        StaticDemo.count = 5;
        StaticDemo.showCount();
    }
}
