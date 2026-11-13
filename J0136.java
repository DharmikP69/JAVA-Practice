public class J0136 {
    public static void main(String[] args) {
        Payment p1 = new UpiPayment();
        Payment p2 = new CardPayment();

        p1.pay(500);
        p2.pay(500);

        Payment[] list = { new UpiPayment(), new CardPayment() };

        for(Payment p : list){
            p.pay(1000);
        }

        //Payment p = new Payment();
    }
}
//Output :
// Paid 500.0 using UPI.
// Paid 500.0 using Card.
// Paid 1000.0 using UPI.
// Paid 1000.0 using Card.

//Step 5 Breaking pay method inside class CardPayment: CardPayment is not abstract and does not override abstract method 
//                                                     pay(double) in Payment 

//Step 6 Try to instantiated Payment p = new PayMent();: Payment is abstract; cannot be instantiated