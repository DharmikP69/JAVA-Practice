import java.util.Scanner;
public class J03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        float a = sc.nextFloat();
        System.out.print("Enter second number : ");
        float b = sc.nextFloat();

        System.out.println("\nChoose an operation:");
        System.out.println("+ : for addition");
        System.out.println("- : for subtraction");
        System.out.println("* : for multiplication");
        System.out.println("/ : for division");
        System.out.println("! : for exit");

        char operator = sc.next().charAt(0);
        switch (operator){
            case '+' :
                System.out.println("Addition of " + a + " and " + b + " is " + (a+b));
                break;
            case '-' :
                System.out.println("Subtraction of " + a + " and " + b + " is " + (a-b));
                break;
            case '*' :
                System.out.println("Multipliaction of " + a + " and " + b + " is " + (a*b));
                break;
            case '/' :
                if (b == 0){
                    System.out.println("Invalid Operation. Any number can not be divide by 0.");
                    break;
                } else {
                    System.out.println("Division of " + a + " and " + b + " is " + (a/b));
                    break;
                }
            default:
                System.out.println("Invalid operator entered.");
        }
        sc.close ();
    }
}
