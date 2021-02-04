//test commit
public class BankAccountArray {
    public static void main(String[] args) {
        ReadingCode array = new ReadingCode();
        BankAccount[] ar = new BankAccount[30];

        for(int i = 0; i < array.read("bank_account.txt").length; i++) {
            ar[i] = array.read("bank_account.txt")[i];
        }


        System.out.println(searchName(ar, "Aditya"));

        for(int i = 0; i < 20; i++) {
            System.out.println(reverseOrder(ar)[i]);
        }

    }
    public static BankAccount searchName(BankAccount[] array, String toSearch) {
        int index = 0;

        for(int i = 0; i < array.length; i++) {
            if(toSearch.equals(array[i].getName())) {
                return array[i];
            }
        }
        return null;
    }

    public static BankAccount[] reverseOrder(BankAccount[ ] accounts) {
        BankAccount[] reverse = new BankAccount[accounts.length];

        for(int i = 0; i < accounts.length; i++) {
            reverse[reverse.length - 1 - i] = accounts[i];
        }
        return reverse;
    }

    public static boolean goodStanding(BankAccount[] array, double min) {

        for(int i = 0; i < array.length; i++) {
            if(array[i].getBalance() < min) {
                return false;
            }
        }
        return true;

    }

    public static BankAccount findHighestBalance(BankAccount[] array) {
        double highest = array[0].getBalance();
        int index = 0;
        for(int i = 0; i < array.length; i++) {
            if(array[i].getBalance() > highest) {
                highest = array[i].getBalance();
                index = i;
            }
        }

        return array[index];
    }
    




}
