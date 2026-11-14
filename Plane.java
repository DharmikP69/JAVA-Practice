class Plane implements Flyable {
    @Override
    public void fly() {
        System.out.println("Plane flies");
    }

    @Override
    public void land() {
        System.out.println("Plane lands on runway");
    }
}