public class DivisionHandler {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Caught Error: Cannot divide by zero.");
        } finally {
            System.out.println("Finally block: This always executes.");
        }
    }
}
