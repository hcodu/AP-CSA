import java.io.File;
import java.util.Scanner;

public class ReadingCode {
    public  BankAccount[]  read(String fileName) {
        // TODO Auto-generated method stub
        BankAccount[] accounts=new BankAccount[20];
        //System.out.println("Reading File from Java code");

        try{

            File file = new File(fileName);
            Scanner in = new Scanner(file);

            //Variable to hold the one line data
            String line;

            // Read file line by line and print on the console
            for (int i=0; i<20; i++)   {
                String name=in.next();
                double bal=in.nextInt();
                //System.out.println(name+"     "+bal);
                accounts[i]= new BankAccount(bal, name);
            }
            //Close the buffer reader
            in.close();
        }catch(Exception e){
            System.out.println("Error while reading file line by line:" + e.getMessage());
        }

        return accounts;

    }
    public  static Horse[]  readh(String fileName) {
        Horse[] barn=new Horse[5];
        //System.out.println("Reading File from Java code");

        try{

            File file = new File(fileName);

            Scanner in = new Scanner(file);

            // Read file line by line and print on the console
            for (int i=0; i<5; i++)   {

                String name=in.next();
                if(!name.equals("null")){
                    int w=in.nextInt();
                    //System.out.println(name+"     "+w);
                    barn[i]= new Horse(name, w);}
            }
            //Close the buffer reader
            in.close();
        }catch(Exception e){
            System.out.println("Error while reading file line by line:" + e.getMessage());
        }
        return barn;

    }
}

