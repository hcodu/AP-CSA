import java.io.File;
import java.util.Scanner;

public class TwoDArrayLab1 {
    public static void main(String[] args) {
        int[][] myArray= read("numbers.txt");

//        System.out.println(sum(myArray));
//        System.out.println(rowSum(myArray, 2));
//        System.out.println(colSum(myArray, 1));
//        System.out.println(sum2(myArray));
//        System.out.println(findLargest(myArray));
//        System.out.println(largestByRow(myArray, 12));
//        System.out.println(findLargest2(myArray));
//        printTranspose(myArray);
//        System.out.println(myArray.length);
        
    }
    public  static int[][]  read(String fileName) {
        int[][] toReturn=new int[12][6];
        System.out.println("Reading File from Java code");
        try{
            File file = new File(fileName);
            Scanner in = new Scanner(file);
            // Read file line by line and print on the console
            for (int i=0; i<toReturn.length; i++)   {
                for(int j=0; j<toReturn[0].length; j++){
                    int r=in.nextInt();
                    toReturn[i][j]=r;
                }
            }


            in.close();
            //Close the buffer reader

        }catch(Exception e){
            System.out.println("Error while reading file line by line:" + e.getMessage());
        }

        return toReturn;

    }

    public static void display(int[][] theArray){
        for(int row=0; row<theArray.length; row++){
            for(int col=0; col<theArray[0].length; col++){
                System.out.print(theArray[row][col]+" ");
            }
            System.out.println();
        }
    }

    public static int sum(int[][] arr) {
        int sum = 0;
        for(int row=0; row<arr.length; row++){
            for(int col=0; col<arr[0].length; col++){
                sum = sum + arr[row][col];
            }
        }
        return sum;
    }

    public static int rowSum(int[][] arr, int row) {
        int sum = 0;
        for(int i = 0; i < arr[0].length; i++) {
            sum = sum + arr[row - 1][i];
        }
        return sum;
    }

    public static int colSum(int[][] arr, int col) {
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            sum = sum + arr[i][col - 1];
        }
        return sum;
    }

    public static int sum2(int[][] arr) {
        int sum = 0;
        for(int i = 1; i < arr.length + 1; i++) {
            sum = sum + rowSum(arr, i);
        }
        return sum;
    }

    public static int findLargest(int[][] arr){
        int largest = arr[0][0];
        for(int[] row : arr){
            for(int arr2 : row){
                if (largest < arr2)
                    largest = arr2;
            }
        }
        return largest;
    }

    public static int largestByRow(int[][] arr, int row) {
        int largest = arr[row - 1][0];
        for(int i = 0; i < arr[0].length ; i++) {
            if(arr[row - 1][i] > largest) {
                largest = arr[row - 1][i];
            }
        }
        return largest;
    }

    public static int findLargest2(int[][] arr) {
        int largest = largestByRow(arr, 1);
        for(int i = 1; i < arr.length; i++) {
            if(largestByRow(arr, i + 1) > largest) {
                largest = largestByRow(arr, i + 1);
            }
        }
        return largest;
    }

    public static void printTranspose(int[][] arr) {
        for(int row = 0; row < arr[0].length; row++){
            for(int col = 0; col < arr.length; col++){
                System.out.print(arr[col][row] + " ");
            }
            System.out.println();
        }
    }

}
