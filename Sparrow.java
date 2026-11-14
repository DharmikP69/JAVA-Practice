class Sparrow extends Bird implements Flyable {
    Sparrow(String n) {
        super(n);
    }

    @Override
    void sound() {
        System.out.println("Chirp");
    }

    @Override
    public void fly() {
        System.out.println(name + " flies");
    }
}