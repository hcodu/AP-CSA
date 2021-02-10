import java.io.File;
import java.util.Scanner;
public class HorseBarnTester {
    public static void main(String[] args) {

        Horse[] myHorses = new Horse[5];
        myHorses = ReadingCode.readh("barn.txt"); //i made readh because read returns a BankAccount
        HorseBarn myBarn = new HorseBarn(myHorses);

        System.out.println(myBarn);
        System.out.println(myBarn.findHorseSpace("Street"));

        myBarn.consolidate();
        System.out.println(myBarn);

    }
}
