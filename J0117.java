class SavingsAccount extends BankAccount {

    private double interestRate;

    public SavingsAccount(String accNo, double balance, double interestRate) {
        super(accNo, balance);
        this.interestRate = interestRate;
    }

    public void addInterest() {
        double interest = getBalance() * interestRate / 100;

        deposit(interest);
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() - amount < 500) {
            System.out.println("For the saving account minimum balance 500 should be maintained.");
        } else {
            super.withdraw(amount);
        }
    }
}

public class J0117 {

    public static void main(String[] args) {
        BankAccount b1 = new BankAccount("12502040501020", 5000);

        b1.deposit(4000); // 5000+4000
        b1.getBalance(); // 9000
        b1.withdraw(2000); // 9000-2000
        b1.getBalance(); // 7000
        b1.show(); // 12502040501020 has 7000
        b1.withdraw(7000); // success cause no rule for the minimun balance
        b1.show(); // 12502040501020 has 0

        SavingsAccount sa1 = new SavingsAccount("125020405010200", 5000, 5);

        sa1.getAccountNumber(); // 125020405010200
        sa1.getBalance(); // 5000
        sa1.deposit(10000); // 5000 + 10000
        sa1.getBalance(); // 15000
        sa1.withdraw(1500); // 15000-1500
        sa1.getBalance(); // 13500
        sa1.addInterest(); // 13500 + 675
        sa1.getBalance(); // 14175
        sa1.show(); // 125020405010200 has 14175
        sa1.withdraw(14000); // Error cause 500 is not maintained
        sa1.show(); // 125020405010200 has 14175
        sa1.withdraw(13675); // leaves exactly 500, should succeed
        sa1.withdraw(1); // leaves 499, should be blocked

    }

}
