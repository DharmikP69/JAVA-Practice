class Calculator {
    float a, b;

    static int count = 0;

    Calculator() {
        a = 0;
        b = 0;
        count++;
    }

    Calculator(float a, float b) {
        this.a = a;
        this.b = b;
        count++;
    }

    float sum() {
        return a + b;
    }

    float diff() {
        return a - b;
    }

    float mul() {
        return a * b;
    }

    float div() {
        if (b == 0) {
            System.out.println("Can not divide by zero.");
            return 0;
        } else {
            return a / b;
        }
    }

    void show() {
        System.out.println("a=" + a + " b=" + b + " | add=" + sum() + " sub=" + diff()
                + " mul=" + mul() + " div=" + div());
    }

    static void printCount() {
        System.out.println("Number of calculators : " + count);
    }

}

public class J73 {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        Calculator c2 = new Calculator(10, 5);
        Calculator c3 = new Calculator(7.5f, 2.5f);

        c1.a = 8;
        c1.b = 2;

        c1.show();
        c2.show();
        c3.show();

        Calculator c4 = new Calculator();
        c4.show();

        Calculator.printCount();

    }
}
// a=8.0 b=2.0 | add=10.0 sub=6.0 mul=16.0 div=4.0
// a=10.0 b=5.0 | add=15.0 sub=5.0 mul=50.0 div=2.0
// a=7.5 b=2.5 | add=10.0 sub=5.0 mul=18.75 div=3.0
// Can not divide by zero.
// a=0.0 b=0.0 | add=0.0 sub=0.0 mul=0.0 div=0.0
// Number of calculators : 4