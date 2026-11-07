public class Vehicle {
    private String name;

    Vehicle(String name) {
        this.name = name;
    }

    void start() {
        System.out.println("Vehicle start");
    }

    final void showType() {
        System.out.println("Generic vehicle");
    }

    static void info() {
        System.out.println("Vehicle info");
    }

    String getName() {
        return name;
    }
}
