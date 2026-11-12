/**
 * Calculator
 */
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