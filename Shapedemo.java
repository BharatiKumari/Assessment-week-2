abstract class Shape {
    abstract void area();
}

class Circle extends Shape {
    double r = 5;
    void area() { System.out.println("Circle Area: " + (Math.PI * r * r)); }
}

class Rectangle extends Shape {
    int l = 10, b = 5;
    void area() { System.out.println("Rectangle Area: " + (l * b)); }
}

public class ShapeDemo {
    public static void main(String[] args) {
        new Circle().area();
        new Rectangle().area();
    }
}
