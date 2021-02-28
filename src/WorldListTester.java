import java.util.ArrayList;
public class WorldListTester {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<String>();
        list.add("cat");
        list.add("mouse");
        list.add("frog");
        list.add("dog");
        list.add("dog");

        WordList animals=new WordList(list);
        System.out.println(animals);
        System.out.println(animals.numWordsOfLength(4));
        System.out.println(animals.numWordsOfLength(3));
        System.out.println(animals.numWordsOfLength(2));

        animals.removeWordsOfLength(4);
        System.out.println(animals);
        animals.removeWordsOfLength(3);
        System.out.println(animals);
        animals.removeWordsOfLength(2);
        System.out.println(animals);
    }
}
