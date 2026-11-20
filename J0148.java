interface Greeter {
    String name();

    default String greet() {
        return "Hello, " + name();
    }

    static String shout(String s) {
        return s.toUpperCase() + "!";
    }
}

class Casual implements Greeter {
    @Override 
    public String name() {
        return "Ravi";
    }
}

class Formal implements Greeter {
    @Override 
    public String name() {
        return "Sir";
    }

    @Override 
    public String greet() { //greet() in Formal cannot implement greet() 
    // in Greeter attempting to assign weaker access privileges; was public
        return "Good day, " + name();
    }
}

public class J0148 {
    public static void main(String[] args) {
        Greeter g1 = new Casual();
        Greeter g2 = new Formal();

        System.out.println(g1.greet()); // P1 Hello, Ravi
        System.out.println(g2.greet()); // P2 Good day, Sir
        System.out.println(Greeter.shout("hi")); // P3 HI!
        // System.out.println(g1.shout("hi")); // P4: interface method call the receiver qualify Greeter
        // Greeter g3 = new Greeter(); // P5: interface can not be instantiated as object
        //P6 greet() in Formal cannot implement greet() in Greeter
    }
}
//Output :
// Hello, Ravi
// Good day, Sir
// HI!