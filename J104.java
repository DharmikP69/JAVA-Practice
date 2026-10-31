class BankAccount{
    private final String accountNumber;   // account number can be upto 14 digit that is way beyond standard int so String is best choice
    private double balance;

    BankAccount(String accountNumber, double initialBalance){
        this.accountNumber = accountNumber;
        
        if(initialBalance < 0){
            balance = 0;
        } else {
            this.balance = initialBalance;
        }
    }

    void deposit(double amount){
        if(amount <= 0){
            System.out.println("Invalid amount to deposit. Check the amount.");
            return;
        }

        balance += amount;
        System.out.println(amount + " is deposited successfully.");
    }

    void withdraw(double amount){
        if(amount <= 0){
            System.out.println("Invalid amount to withdraw.");
            return;
        }

        if(amount > balance){
            System.out.println("insufficient funds.");
            return;
        }

        balance -= amount;
        System.out.println(amount + " is withdrawn successfully.");
    }

    double getBalance(){
        return balance;
    }

    String getAccountNumber(){
        return accountNumber;
    }

    void show(){
        System.out.println("Account number " + accountNumber +" has " + balance);
    }

// If i create the function setBalance() then any one can access this function from the main section and it is wrong because it is private field and only the 
// account holder can chnage or set the balance. So it is a security feature so we should not give direct setBAlance() function.

}

public class J104{
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount("12502040501020", 1000);
        b1.deposit(500);
        b1.deposit(-50);
        b1.withdraw(2000);
        b1.withdraw(300);
        b1.show();
        b1.withdraw(1200);
        b1.show();


        BankAccount b2 = new BankAccount("12502040501021", -100);
        b2.show();
    }
}
//Output : 
// 500.0 is deposited successfully.
// Invalid amount to deposit. Check the amount.
// insufficient funds.
// 300.0 is withdrawn suceessfully.
// 1200.0 is withdrawn successfully.
// Account number 12502040501020 has 0.0
// Account number 12502040501021 has 0.0