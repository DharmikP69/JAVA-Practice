class Penguin extends Bird {
    Penguin(String n) {
        super(n);
    }

    @Override
    void sound() {
        System.out.println("Squawk");
    }

    @Override
    void eat() {
        System.out.println(name + " eats fish");
    }
}