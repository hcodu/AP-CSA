import java.text.SimpleDateFormat;
import java.util.Date;

public class Bank {
    private BankAccount b1, b2, b3;
    private String name;

    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
    java.util.Date d = new Date();
    private String date = formatter.format(d);

    Bank(BankAccount one, BankAccount two, BankAccount three, String name) {
        b1 = one;
        b2 = two;
        b3 = three;
        System.out.println("Hello welcome to " + name + "! Today is " + date);
    }



    public int findAccount(String last) {
        if(b1.getName().contains(last))
            return 1;
        else if (b2.getName().contains(last))
            return 2;
        else if (b3.getName().contains(last))
            return 3;
        else
            return -1;
    }

    public void findDepositPrint(String last, double a) {
        if(b1.getName().contains(last)) {
            b1.deposit(a);
            System.out.println(b1.toString());
        }
        else if (b2.getName().contains(last)) {
            b2.deposit(a);
            System.out.println(b2.toString());
        }
        else if (b3.getName().contains(last)) {
            b3.deposit(a);
            System.out.println(b3.toString());
        }
    }

    public void findWithdrawtPrint(String last, double a) {
        if(b1.getName().contains("last")) {
            b1.withdraw(a);
            System.out.println(b1.toString());
        }
        else if (b2.getName().contains("last")) {
            b2.withdraw(a);
            System.out.println(b2.toString());
        }
        else if (b3.getName().contains(last)) {
            b3.withdraw(a);
            System.out.println(b3.toString());
        }
    }
}
