final class FinalClass { // Cannot be inherited
    final int SPEED_LIMIT = 90; // Constant
    final void display() { System.out.println("Final Method"); }
}

public class FinalDemo {
    public static void main(String[] args) {
        FinalClass obj = new FinalClass();
        System.out.println("Limit: " + obj.SPEED_LIMIT);
    }
}
