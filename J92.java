import java.util.*;

class Account {
    String name;
    int balance;
    int pin;
    int enteredPin;
    int withDrawAmount;

    Account(String name, int balance, int pin) {
        this.name = name;
        this.balance = balance;
        this.pin = pin;
    }

    void show(){
        System.out.println("Hello " + name + " how are you ?");
    }

    boolean checkPin() {
        return this.pin == enteredPin;
    }

    void viewBalance(Scanner sc) {
        System.out.print("Enter your pin to check balance : ");
        enteredPin = sc.nextInt();

        if (checkPin()) {
            System.out.println("Your balance is : " + balance);
        } else {
            System.out.println("Invalid pin.");
            return;
        }
    }

    void withDraw(Scanner sc) {
        System.out.print("Enter withdrawl amount : ");
        withDrawAmount = sc.nextInt();

        System.out.print("Enter the pin : ");
        enteredPin = sc.nextInt();

        if (checkPin()) {
            System.out.println("Your Transaction is being processed. Kindly wait.");

            if (balance >= withDrawAmount) {
                System.out.println("Please collect your cash from the cash box.");
            } else {
                System.out.println("The amount you want to withdraw is not in the you account.");
                return;
            }

            balance = balance - withDrawAmount;

            System.out.println("After this withdrawl your current balance is : " + balance);

        } else {
            System.out.println("Invalid pin.");
            return;
        }
    }
}

public class J92 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name : ");
        String name = sc.next();

        System.out.print("Enter your balance : ");
        int balance = sc.nextInt();

        System.out.print("Enter your pin : ");
        int pin = sc.nextInt();


        Account a1 = new Account(name,balance,pin);

        a1.show();
        a1.viewBalance(sc);
        a1.withDraw(sc);
    
        sc.close();

    }
}
//Output : 
// Enter your name : 
// Dharmik
// Enter your balance : 
// 125698743
// Enter your pin : 
// 6403
// Hello Dharmik how are you ?
// Enter your pin to check balance : 
// 6403
// Your balance is : 125698743
// Enter withdrawl amount : 
// 125896
// Enter the pin : 
// 6403
// Your Transaction is being processed. Kindly wait.
// Please collect your cash from the cash box.
// After this withdrawl your current balance is : 125572847