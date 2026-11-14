abstract class Bird {
    String name;

    Bird(String name) {
        this.name = name;
    }

    abstract void sound();

    void eat() {
        System.out.println(name + " eats");
    }
}