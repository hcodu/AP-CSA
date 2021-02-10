import java.io.File;
import java.util.Scanner;
public class HorseBarnTester {
    public static void main(String[] args) {

        Horse[] myHorses = new Horse[5];
        myHorses = ReadingCode.readh("barn.txt");
        HorseBarn myBarn = new HorseBarn(myHorses);


        myBarn.consolidate();
        //System.out.println(myBarn);

        //System.out.println(myBarn.findHorseSpace("Street"));

        //System.out.println(myBarn);

    }
}
