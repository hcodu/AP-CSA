import java.io.File;
import java.util.*;

public class FindingLife {
        public static void main(String[] args) {
            String [][] theArray = readLife("lifeData.txt");
            System.out.println(LifeSearch(theArray));
            display(theArray);

        }

        public static void display(String[][] myArray) {
            for (int row = 0; row < myArray.length; row++) {
                for (int col = 0; col < myArray[0].length; col++) {
                    System.out.print(myArray[row][col] + " ");
                }
                System.out.println();
            }
        }
        public static String[][] readLife(String fileName) {
            String[][] toReturn = new String[26][26];
            System.out.println("Reading File from Java code");

            try {

                File lifeData = new File(fileName);

                Scanner in = new Scanner(lifeData);

                // Read file line by line and print on the console
                for (int i = 0; i < toReturn.length; i++) {
                    for (int j = 0; j < toReturn[0].length; j++) {
                        String r = in.next();
                        toReturn[i][j] = r;
                    }
                }

                in.close();
                // Close the buffer reader

            } catch (Exception e) {
                System.out.println("Error while reading file line by line:" + e.getMessage());
            }

            return toReturn;

        }
        public static int leftlifeSearch(String[][] array)
        {
            int counter = 0;
            for (int row = 0; row < array.length; row ++)
            {
                for (int col = 0;  col < array[0].length; col++)
                {
                    if (array[row][col].equals("L") && col > 2 && array[row][col - 1].equals("I")
                            && array[row][col - 2].equals("F") && array[row][col - 3].equals("E"))
                    {
                        counter++;
                    }
                }
            }
            return counter;
        }
        public static int rightlifeSearch(String[][] array) {
            int counter = 0;
            for (int row = 0; row < array.length; row ++) {
                for (int col = 0;  col < array[0].length; col++) {
                    if (col < array[0].length - 3 &&
                            array[row][col].equals("L") && array[row][col + 1].equals("I")
                            && array[row][col + 2].equals("F") && array[row][col + 3].equals("E")) {
                        counter++;
                    }
                }
            }
            return counter;
        }
        public static int uplifeSearch(String[][] array) {
            int counter = 0;
            for (int row = 0; row < array.length; row ++) {
                for (int col = 0;  col < array[0].length; col++) {
                    if (row > 2 &&
                            array[row][col].equals("L") && array[row - 1][col].equals("I")
                            && array[row - 2][col].equals("F") && array[row - 3][col].equals("E")) {
                            counter++;
                        }
                    }
                }
                return counter;
        }
        public static int downLifeSearch(String[][] array) {

            int counter = 0;
            for (int row = 0; row < array.length; row ++) {
                for (int col = 0;  col < array[0].length; col++) {
                    if (row < array.length - 3 &&
                            array[row][col].equals("L") && array[row + 1][col].equals("I")
                            && array[row + 2][col].equals("F") && array[row + 3][col].equals("E")) {
                            counter++;
                        }
                    }
                }
                return counter;
        }

        public static int downRightlifeSearch(String[][] array)
        {
            int counter = 0;
            for (int row = 0; row < array.length; row ++) {
                for (int col = 0;  col < array[0].length; col++) {
                    if (row < array.length - 3 && col < array[0].length - 3 &&
                            array[row][col].equals("L") && array[row + 1][col + 1].equals("I")
                            && array[row + 2][col + 2].equals("F") && array[row + 3][col + 3].equals("E")) {
                        counter++;
                    }
                }
            }
            return counter;
        }
        public static int upRightlifeSearch(String[][] array) {
            int counter = 0;
            for (int row = 0; row < array.length; row ++) {
                for (int col = 0;  col < array[0].length; col++) {
                    if (row > 3 && col < array[0].length - 3 &&
                            array[row][col].equals("L") && array[row - 1][col + 1].equals("I")
                            && array[row - 2][col + 2].equals("F") && array[row - 3][col + 3].equals("E")) {
                        counter++;
                    }
                }
            }
            return counter;
        }
        public static int downLeftlifeSearch(String[][] array) {
            int counter = 0;
            for (int row = 0; row < array.length; row ++) {
                for (int col = 0;  col < array[0].length; col++) {
                    if (row < array.length - 3 && col > 3 &&
                            array[row][col].equals("L") && array[row + 1][col - 1].equals("I")
                            && array[row + 2][col - 2].equals("F") && array[row + 3][col - 3].equals("E"))
                    {
                        counter++;
                    }
                }
            }
            return counter;
        }
        public static int upLeftlifeSearch(String[][] array) {
            int counter = 0;
            for (int row = 0; row < array.length; row ++) {
                for (int col = 0;  col < array[0].length; col++) {
                    if (row > 3 && col > 3 &&
                            array[row][col].equals("L") && array[row - 1][col - 1].equals("I")
                            && array[row - 2][col - 2].equals("F") && array[row - 3][col - 3].equals("E"))
                    {
                        counter++;
                    }
                }
            }
            return counter;
        }
        public static int LifeSearch(String[][] array) {
            int total = leftlifeSearch(array) + rightlifeSearch(array) + uplifeSearch(array)
                    + downLifeSearch(array) + downRightlifeSearch(array) + upRightlifeSearch(array)
                    + downLeftlifeSearch(array) + upLeftlifeSearch(array);
            return total;
        }
    }


