interface Flyable {
    void fly();

    default void land() {
        System.out.println("Landing safely");
    }
}