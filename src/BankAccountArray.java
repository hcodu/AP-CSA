public class BankAccountArray {
    public static void main(String[] args) {
        ReadingCode array = new ReadingCode();
        BankAccount[] ar = new BankAccount[20];

        for(int i = 0; i < array.read("bank_account.txt").length; i++) {
            ar[i] = array.read("bank_account.txt")[i];
        }

        //Good standing
        System.out.println(goodStanding(ar, 1000));
        System.out.println("");
        //Search name
        System.out.println(searchName(ar, "Aditya"));
        System.out.println("");
        //Reverse order
        for(int i = 0; i < 20; i++) {
            System.out.println(reverseOrder(ar)[i]);
        }
        System.out.println("");
        //Find highest balance
        System.out.println(findHighestBalance(ar));
        System.out.println("");
        //Has duplicates
        System.out.println(hasDuplicates(ar));
        System.out.println("");
        //


    }
    public static BankAccount searchName(BankAccount[] array, String toSearch) {
        int index = 0;

        for(BankAccount arr: array) {
            if(toSearch.equals(arr.getName())) {
                return arr;
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

    public static boolean goodStanding(BankAccount[] accounts, double minimum){

        for(BankAccount arr: accounts) {
            if(arr.getBalance() < minimum){
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

    public static boolean hasDuplicates(BankAccount[ ] accounts) {
        for(int i = 0; i < accounts.length; i++) {
            for(int x = 0; i < accounts.length; i++) {
                if(x != i && accounts[i].equals(accounts[x])) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void shiftRight(BankAccount[ ] accounts) {
        BankAccount[] newAr = new BankAccount[20];
        newAr[0] = null;
        for(int i = 0; i < accounts.length - 1; i++) {
            newAr[i + 1] = accounts[i];
        }

    }

    //Delete one of the accounts, then shift all accounts after that account to the left
// After the delete and shift, set the very last account to null
    public static void deleteAccount(BankAccount[ ] accounts, int index) {
        BankAccount[] newAr = new BankAccount[20];
        boolean deleted = false;
        for(int i = 0; i < accounts.length - 1; i++) {
            if((i != index) && deleted == false) {
                newAr[i] = accounts[i];
            }
            else {
                newAr[i] = accounts[i + 1];
                deleted = true;
            }
        }
    }








}
