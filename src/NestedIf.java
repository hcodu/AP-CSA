import java.util.Scanner;

public class NestedIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String coast;
        String size;
        int tier;


        while (true) {
            System.out.println("College Finder TM");
            System.out.println(" ");
            System.out.println("east or west coast?");
            coast = sc.next();
            System.out.println("Size? (large or small)");
            size = sc.next();
            System.out.println("Tier? (1 or 2)");
            tier = sc.nextInt();

            if (coast.equals("west")) {
                if (tier == 1) {
                    if (size.equals("large")) {
                        System.out.println("University of Wisconsin");
                    } else {
                        System.out.println("Harvey Mud");
                    }
                } else {
                    if (size.equals("large")) {
                        System.out.println("University of Oregon");
                    } else {
                        System.out.println("Denver Univsersity");
                    }
                }
            } else {
                if (tier == 1) {
                    if (size.equals("large")) {
                        System.out.println("Penn State");
                    } else {
                        System.out.println("MIT");
                    }
                } else {
                    if (size.equals("large")) {
                        System.out.println("Syracuse");
                    } else {
                        System.out.println("Capital University");
                    }
                }
            }

            System.out.println(" ");
        }
    }
}
