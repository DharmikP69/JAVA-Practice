public class Car extends Vehicle {
    Car(String name) {
        super(name);
    }

    @Override
    void start() {
        super.start();
        System.out.println("Car start");
    }

    static void info() {
        System.out.println("Car Info");
    }

    @Override
    public String toString() {
        return "Car[name=" + getName() + "]";
    }

    // @Override
    // void showType() {  "Cannot override final data member(Variable) or methof(Functions)"
    //     System.out.println("Car type");
    // }

    
}
