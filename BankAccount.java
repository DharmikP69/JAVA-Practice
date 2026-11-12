/**
 * BankAccount
 */
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
