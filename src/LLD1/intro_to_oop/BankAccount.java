package LLD1.intro_to_oop;

public class BankAccount {
    double balance;
    String ownerName;

    void deposite(double amount) {
        System.out.println("Deposit Amount: " + String.format("%.2f", amount));
        if (amount > 0) {
            balance += amount;
            return;
        }
        System.out.println("Invalid Amount");
    }

    void withdraw(double amount) {
        System.out.println("Withdrawal Amount: " + String.format("%.2f", amount));
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient Funds");
        }
    }

    void checkBalance() {
        System.out.println("\nAvailable Balance: " + String.format("%.2f", balance) + "\n");
    }
}
