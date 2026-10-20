import java.util.Scanner;
class Calculator{

    private double a,b;

    public
        //Use of Constructor to get value of a & b
        Calculator(double a, double b){
           this.a = a;
           this.b = b;
        }
        //add function
        double add(){
            return a+b;
        }
        //minus function
        double sub(){
            return a-b;
        }
        //mul function
        double mul(){
            return a*b;
        }
        //div function
        double div() {
            if (b == 0) {
                throw new ArithmeticException("Cannot divide by zero");
            }
        return a / b;
    }
    }
public class J50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

         System.out.print("Enter the value of the a : ");
            double a = sc.nextDouble();

            System.out.print("Enter the value of the b : ");
            double b = sc.nextDouble();

        Calculator cal = new Calculator(a,b);

        System.out.println();

        System.out.println("Addition : " + cal.add());
        System.out.println("Subtraction : " + cal.sub());
        System.out.println("Multiplication : " + cal.mul());
       
        try {
            System.out.println("Division       : " + cal.div());
        } catch (ArithmeticException e) {
            System.out.println("Division       : " + e.getMessage());
        }

        
        sc.close();
    }
}
//Output : 
// Enter the value of the a : 120 
// Enter the value of the b : 3

// Addition : 123.0
// Subtraction : 117.0
// Multipliction : 360.0
// Division : 40.0