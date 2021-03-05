import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        int[] nums = {8, 7, 5, 4, 2, 1};

        insertionSort(nums);

    }
    public static void insertionSort(int[] elements)

    {
        int count = 0;
        for (int j = 1; j < elements.length; j++)

        {

            int temp = elements[j];

            int possibleIndex = j;

            while (possibleIndex > 0 && temp < elements[possibleIndex - 1])

            {

                elements[possibleIndex] = elements[possibleIndex - 1];

                possibleIndex--;

            }

            elements[possibleIndex] = temp;   // line 12
            count++;

        }
        System.out.print(count);

    }
    }







