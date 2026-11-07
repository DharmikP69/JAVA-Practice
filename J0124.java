public class J0124 {
    public static void main(String[] args) {
        Vehicle v = new Car("Swift");
        v.start(); //Vehicle start /n Car start
        v.showType(); // Generic Vehicle
        Vehicle.info(); // Vehicle Info
        System.out.println(v.toString()); // DO not know
    }
}
//Output :
// Vehicle start
// Car start
// Generic vehicle
// Vehicle info
// Car[name=Swift]