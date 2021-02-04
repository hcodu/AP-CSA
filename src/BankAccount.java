public class BankAccount {
    private double balance;
    private String name;
    private String date;

    BankAccount(Double b, String n) {
        balance = b;
        name = n;
    }
    BankAccount() {
        balance = 0;
        name = "guest";
    }

    public void deposit(double amount) {
        balance = balance + amount;
    }

    public void withdraw(double ammount) {
        balance = balance - ammount;
    }

    public String toString() {
        return "Name: " + name + ". Balance: " + balance;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }


}
