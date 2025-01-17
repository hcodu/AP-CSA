public class TwoDArrayLab2 {
    public static void main(String[] args) {
        double myList[]={4.7, 6.2, 7.2, 4.9, 5.5, 1.8, 3.5, 4.8, 1.5, 2.7, 4.7, 3.3, 7.2, 0.3, 7.4, 7.6, 7.1, 6.4, 1.1, 7.2, 5.2, 5.9, 7.6, 9.7, 2.8, 6.5, 7.5, 9.6, 5.8, 9.6, 0.5, 6.4, 2.4, 4.1, 2.1, 4.6, 7.3, 9.7, 8.7, 7.1, 0.1, 1.7, 7.4, 5.2, 0.2, 7.7, 4.7, 9.4, 1.3, 9.0, 8.0, 6.1, 8.2, 3.5, 7.4, 1.0, 5.4, 3.2, 8.8, 5.0, 9.3, 1.7, 3.0, 2.5, 4.0, 6.3, 7.4, 9.4, 1.2, 9.9, 4.6, 0.5, 7.0, 1.0, 3.7, 8.1, 5.5, 5.1, 5.2, 0.3, 5.0, 3.5, 7.1, 8.5, 10.0, 3.0, 4.5, 1.7, 6.5, 8.3, 8.2, 5.1, 9.3, 3.0, 0.1, 3.2, 2.4, 9.9, 10.0, 3.3};
        double[][] converted = convert(myList, 10, 8);
        display(converted);
        System.out.println(findAverage(converted, 3, 6, 4,7));
        System.out.println(findHighestAvarageRow(converted));
        //System.out.println(findHighestAvarageCol(converted));


    }

    public static void display(double[][] theArray){
        for(int row = 0; row < theArray.length; row++){

            for(int col = 0; col < theArray[0].length; col++){
                System.out.print(theArray[row][col]+" ");
            }
            System.out.println();
        }
    }

    //Convert the integer array to a 2-D array according to the dimensions
    public static double[][] convert(double[] theList, int rows, int cols){
        double newArr[][] = new double[rows][cols];
        int i = 0;
        while(i < (rows * cols)) {
            for(int col = 0; col < rows; col++) {
                for(int row = 0; row < cols; row++) {
                    newArr[col][row] = theList[i];
                    i++;
                }
            }
        }
        return newArr;
    }

    // Find the average of the elements that are within the range of indices
    public static double findAverage(double[][] theArray, int rowStart, int rowEnd, int colStart, int colEnd){
        double sum = 0, count = 0;
        for(int row = rowStart; row < rowEnd; row++){
            for(int col = colStart; col < colEnd; col++){
                sum = sum + theArray[row][col];
                count++;
            }
        }
        return sum / count;
    }

    //returns the row number that has the highest average
    public static int findHighestAvarageRow(double[][] theArray){
        int highestAvgRow = 0;
        double highestAvg = 0;
        double a1 = 0, a2 = 0;
        double s1 = 0, s2 = 0;
        int counter1 = 0, counter2 = 0;
        for (int row = 0; row < theArray.length - 1; row ++) {
            for (int col = 0; col < theArray[0].length; col++) {
                s1 = s1 + theArray[row][col];
                counter1++;
            }
            for (int col = 0; col < theArray[0].length; col++) {
                s2 = s2 + theArray[row + 1][col];
                counter2++;
            }
            a1 = s1 / counter1;
            a2 = s2 / counter2;
            if (a2 > a1 && a2 > highestAvg) {
                highestAvgRow = row + 1;
                highestAvg = a2;
            }

            counter1 = 0;
            counter2 = 0;
            s1 = 0;
            s2 = 0;
        }
        return highestAvgRow + 1;
    }

    //returns the column number that has the highest average
    public static int findHighestAvarageCol(double[][] theArray){
        int counter = 0;
        double sum = 0;
        double highestAvg = 0;
        int highestAvgCol = 0;
        for(int col = 0; col < theArray[0].length; col++) {
            for (int row = 0; row < theArray.length; row++) {
                sum = sum + theArray[row][col];
                counter++;
            }
            if (sum / counter > highestAvg) {
                highestAvg = sum /counter;
                highestAvgCol = col + 1;
            }
            sum = 0;
            counter = 0;
        }

        return highestAvgCol;
    }

}
