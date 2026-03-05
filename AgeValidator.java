public class AgeValidator {
    public static void main(String[] args) {
        int age = 16;
        if (age < 18) {
            throw new ArithmeticException("Underage: Age must be 18+");
        } else {
            System.out.println("Access granted.");
        }
    }
}
