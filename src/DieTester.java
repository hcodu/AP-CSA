public class DieTester {
    public static void main(String[] args) {
        Die d1 = new Die();
        Die d2 = new Die();
        int sum, sum2;
        int fiveCount = 0, sixCount = 0, sevenCount = 0, eightCount = 0, nineCount = 0, tenCount= 0;

        System.out.println("Die 1 face: " + d1.getFace());
        System.out.println("Die 2 face: " + d2.getFace());

        for(int i = 0; i < 100; i ++) {
            sum = 0;
            d1.roll();
            d2.roll();
            sum = d1.getFace() + d2.getFace();

            if(sum == 5)
                fiveCount++;
            else if(sum == 7)
                sevenCount++;
            else if(sum == 9)
                nineCount++;
        }

        System.out.println("");
        System.out.println("After flipping 100 times...");
        System.out.println("The sums of dies 1 and 2 equaled 5: " + fiveCount + " times");
        System.out.println("The sums of dies 1 and 2 equaled 7: " + sevenCount + " times");
        System.out.println("The sums of dies 1 and 2 equaled 9: " + nineCount + " times");
        System.out.println("");

        Die d3 = new Die(7);
        Die d4 = new Die(7);

        d3.roll();
        d4.roll();
        System.out.println("Die 3 face: " + d3.getFace());
        System.out.println("Die 4 face: " + d4.getFace());

        for(int i = 0; i < 100; i ++) {
            sum2 = 0;
            d3.roll();
            d4.roll();
            sum2 = d3.getFace() + d4.getFace();

            if(sum2 == 6)
                sixCount++;
            else if(sum2 == 8)
                eightCount++;
            else if(sum2 == 10)
                tenCount++;
        }
        System.out.println("");
        System.out.println("After flipping 100 times...");
        System.out.println("The sums of dies 3 and 4 equaled 6: " + sixCount + " times");
        System.out.println("The sums of dies 3 and 4 equaled 8: " + eightCount + " times");
        System.out.println("The sums of dies 3 and 4 equaled 10: " + tenCount + " times");

    }
}
