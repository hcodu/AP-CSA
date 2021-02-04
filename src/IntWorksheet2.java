import java.util.Scanner;

public class IntWorksheet2 {
    public static void main(String[] args) {

        double d1 = 37.9;
        double d2 = 1004.128;
        int i1 = 12;
        int i2 = 18;
        final double pi = 3.14;


        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Radius: ");
        double radius = sc.nextDouble();

        System.out.println("Volume:  " + ((4.0/3.0) * pi * Math.pow(radius, 3))); // Wouldn't let me use the ^ operator on a double? So I used to the power from the Math class
        System.out.println("Surface Area:  " + (4 * pi * Math.pow(radius, 2)));
        System.out.println(" ");

        System.out.println("Problem 1: " + (57.2 * (i1 / i2) +1));
        System.out.println("Problem 2: " + (57.2 * ((double)i1 / (double)i2) + 1));
        System.out.println("Problem 3: " + (15 - i1 * (d1 * 3) + 4));
        System.out.println("Problem 4: " + (15 - i1 * (int)(d1 * 3) + 4));
        System.out.println("Problem 5: " + (15 - i1 * ((int)d1 * 3) + 4));

    }
}
