public class J0141 {
    public static void main(String[] args) {
        Bird b1 = new Sparrow("Tweety");
        Bird b2 = new Penguin("Pingu");
        b1.sound(); // P1 chirp
        b2.sound(); // P2 Squawk
        b1.eat(); // P3 Tweety eats
        b2.eat(); // P4 Pingu eats fish
        Flyable f1 = new Sparrow("Jack");
        f1.fly(); // P5 Jack flies
        f1.land(); // P6 Landing safely
        Flyable f2 = new Plane();
        f2.land(); // P7 Plane lands on runway
        System.out.println(b2 instanceof Flyable); // P8 false
        System.out.println(f1 instanceof Bird); // P9 true
        // b1.fly(); // P10 Mthod is not defined in the Bird class 
        // Bird b3 = new Bird("X"); // P11 Cannot make objcet of abstract class
        // Flyable f3 = new Flyable(); // P12 Cannot make object of interface
        ((Flyable) b2).fly(); // P13 error Penguin class cannot be cast to the Flyable class
        //  so its give run time error called "ClassCastException"
        System.out.println("done"); //Nothing will be printed
    }
}
//Output :
// Chirp
// Squawk
// Tweety eats
// Pingu eats fish
// Jack flies
// Landing safely
// Plane lands on runway
// false
// true
// Exception in thread "main" java.lang.ClassCastException: class Penguin cannot be cast to class Flyable (Penguin and Flyable are in unnamed module of loader 'app')
//         at J0141.main(J0141.java:19)
// PS C:\Users\DHARMIK\OneDrive\Desktop\dsa\JAVA\Java-program> 