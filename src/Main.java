public class Main {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount(1000.0, "Tim");
        BankAccount b2 = new BankAccount(2000.0, "Tom");
        BankAccount b3 = new BankAccount(3000.0, "Tam");

        Bank bank = new Bank(b1, b2, b3, "TD Bank");


        bank.findDepositPrint("Tim", 100);

        bank.findWithdrawtPrint("Tam", 12.4);


    }
}