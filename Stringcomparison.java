public class StringComparison {
    public static void main(String[] args) {
        String s = "Hello"; // Immutable
        StringBuilder sb = new StringBuilder("Hello"); // Mutable, Fast
        StringBuffer sbf = new StringBuffer("Hello"); // Mutable, Thread-safe

        System.out.println("String: " + s);
        System.out.println("StringBuilder: " + sb.append(" World"));
        System.out.println("StringBuffer: " + sbf.append(" Safe World"));
    }
}
