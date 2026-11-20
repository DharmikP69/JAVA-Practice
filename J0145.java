class Animal {
    String name = "Animal";

    void speak() {
        System.out.println("Animal speaks");
    }

    static void info() {
        System.out.println("Animal info");
    }

    void show(Animal a) {
        System.out.println("show Animal");
    }
}

class Dog extends Animal {
    //String name = "Dog";

    @Override
    void speak() {
        System.out.println("Dog barks");
    }

    static void info() {
        System.out.println("Dog info");
    }

    void show(Dog d) {
        System.out.println("show Dog");
    }

    void fetch() {
        System.out.println("Dog fetches");
    }
}

public class J0145 {
    public static void main(String[] args) {
        Animal a = new Dog();
        Dog d = new Dog();

        a.speak(); // P1 Animal speaks
        System.out.println(a.name); // P2 Animal
        Animal.info(); // P3 Animal info
        Dog.info();
        Animal.info();
        a.show(d); // P4 show animal
        d.show(a); // P5 show animal
        d.show(d); // P6 show dog
        // a.fetch(); // P7 Function is not ddefined in Animal class
        ((Dog) a).fetch(); // P8 Dog fetches 
        Animal b = new Animal();
        Dog x = (Dog) b; // P9 ClassCastexception
        System.out.println(x);
        System.out.println("done"); // P10 there will be a run time error in the line 52 so line 53 will not execute so nothing will print
    }
}
//Output :
// Dog barks
// Animal
// Animal info
// show Animal
// show Animal
// show Dog
// Dog fetches
// Exception in thread "main" java.lang.ClassCastException: class Animal cannot be cast to class Dog (Animal and Dog are in unnamed module of loader 'app')
//         at J0145.main(J0145.java:52)