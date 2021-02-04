public class ArrayPractice1 {
    public static void main(String[] args) {
        int[] nums = {1, 7, 3, 0, 8, 14, 9, -5};
        System.out.println("Average: " + average(nums));
        System.out.println("Above average: " + countAboveAvg(nums));
        System.out.println("Largest: " + largest(nums));
        System.out.println("Index of Smallest: " + indexSmallest(nums));

    }

    public static double average(int[] array) {
        double sum = 0, avg;
        for(int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        avg = sum / (array.length);
        return avg;
    }
    public static int countAboveAvg(int[] array) {
        int count = 0;
        double avg = average(array);
        for(int i = 0; i < array.length; i++) {
            if(array[i] > avg) {
                count++;
            }
        }
        return count;
    }
    public static int largest(int[] array) {
        int largest = array[0];
        for(int i = 0; i < array.length; i++) {
            if(array[i] > largest) {
                largest = array[i];
            }
        }
        return largest;
    }
    public static int indexSmallest(int[] array) {
        int smallest = array[0];
        int smallestIndex = -1;
        for(int i = 0; i < array.length; i++) {
            if(array[i] <= smallest) {
                smallest = array[i];
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }
}
