import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<Integer>();
        myList.add(12);
        myList.add(9);
        myList.add(7);
        myList.add(8);
        myList.add(4);
        myList.add(3);
        myList.add(6);
        myList.add(11);
        myList.add(1);
       for (int i = 0; i < myList.size(); i++)

        {

            if (myList.get(i) % 2 == 0)

            {

                myList.remove(i);

            }

        }

        System.out.println(myList);

    }
    

}






