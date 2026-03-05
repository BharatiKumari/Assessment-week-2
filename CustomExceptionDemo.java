class InvalidValueException extends Exception {
    InvalidValueException(String s) { super(s); }
}

public class CustomExceptionDemo {
    static void checkValue(int val) throws InvalidValueException {
        if (val < 0) throw new InvalidValueException("Negative value not allowed!");
    }

    public static void main(String[] args) {
        try { checkValue(-1); } 
        catch (Exception e) { System.out.println(e.getMessage()); }
    }
}
