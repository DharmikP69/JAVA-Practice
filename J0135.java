interface Shape {
    double area();
}

abstract class Base implements Shape {
    String name;

    Base(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name + " " + area();
    }
}

class Circle extends Base {
    double r;

    Circle(double r) {
        super("Circle");
        this.r = r;
    }

    @Override
    public double area() {
        return 3.0 * r * r;
    }
}

class Rect extends Base {
    double w, h;

    Rect(double w, double h) {
        super("Rect");
        this.w = w;
        this.h = h;
    }

    @Override
    public double area() {
        return w * h;
    }

    void diagonalNote() {
        System.out.println("Rect only");
    }
}

public class J0135 {
    public static void main(String[] args) {
        Shape[] shapes = { new Circle(2), new Rect(3, 4) };

        for (Shape s : shapes) {
            System.out.println(s); // P1 Circle 12 , P2 Rect 12
        }

        Shape s1 = shapes[1]; // s1 = Rect
        // s1.diagonalNote(); // P3: compile error cause no method name diagonalNote()
        // in Shape interface

        if (s1 instanceof Rect r) {
            r.diagonalNote();
        }

        Shape s0 = shapes[0];
        if (s0 instanceof Rect) {
            System.out.println("yes"); // P5 no type casting compiler will give error
        } else {
            System.out.println("no");
        }

        // Shape s2 = new Shape(); // P6: Not allowed because we can not instantiate
        // Base b = new Base("x"); // P7: Not allowed because we can not make objcet of
        // abstract class
    }
}
//Output :
// Circle 12.0
// Rect 12.0
// Rect only
// no