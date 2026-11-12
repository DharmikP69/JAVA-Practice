class Animal {
    String name = "Animal-field";
    void sound() { System.out.println("Some sound"); }
    void eat()   { System.out.println("Animal eats"); }
    static void info() { System.out.println("Animal static"); }
}

class Dog extends Animal {
    String name = "Dog-field";
    @Override void sound() { System.out.println("Bark"); }
    void fetch() { System.out.println("Dog fetches"); }
    static void info() { System.out.println("Dog static"); }
}

class Cat extends Animal {
    @Override void sound() { System.out.println("Meow"); }
}

public class J0131 {
    static void show(Animal a) { System.out.println("show Animal"); }
    static void show(Dog d)    { System.out.println("show Dog"); }

    public static void main(String[] args) {
        Animal a1 = new Dog();
        Animal a2 = new Cat();
        Animal a3 = new Animal();

        a1.sound();                        // P1 Bark
        a2.sound();                        // P2 Meow
        a3.sound();                        // P3 Some sound
        a1.eat();                          // P4 Animal eat
        System.out.println(a1.name);       // P5 Animal-field 
        Animal.info();                         // P6 Animal static but we should make it Animal.info / Dog,info() cause the compiler giving the warning
        show(a1);                          // P7 show Animal
        show(new Dog());                   // P8 show Dog

        Animal[] zoo = { a1, a2, a3 };
        for (Animal x : zoo) x.sound();    // P9 Bark (new line) Mewo (new line) Some sound

        ((Dog) a1).fetch();                // P10 Dog fetches
//line-41     //  Cat c = (Cat) a1;        // P11 Type casting from Dog to Cat. But it will give error. Cause Dog and Cat havew different properties
        System.out.println("done");        // P12 Nothing will print cause the program never reaches the P12 cause the line 41 has error.
    }
}
//Output:
// Bark
// Meow
// Some sound
// Animal eats
// Animal-field
// Animal static
// show Animal
// show Dog
// Bark
// Meow
// Some sound
// Dog fetches
// Exception in thread "main" java.lang.ClassCastException: class Dog cannot be cast to class Cat (Dog and Cat are in unnamed module of loader 'app')
//         at J0131.main(J0131.java:41)