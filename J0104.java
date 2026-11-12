public class J0104{
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