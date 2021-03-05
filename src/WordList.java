import java.util.ArrayList;

public class WordList{
    private ArrayList<String> myList; //contains Strings made up of letters

    public int numWordsOfLength(int len){
        //to be implemented in part a
        int count = 0;
        for(int i = 0; i < (myList.size()); i++) {
            if((myList.get(i).length()) == len) {
                count++;
            }
        }
        return count;
    }

    //Postcondition: all words that are exactly len letters long have been removed from this Wordlist, with the order of the remaining words unchanged
    public void removeWordsOfLength(int len){
        for(int i = 0; i < myList.size(); i++) {
            if(myList.get(i).length() == len) {
                myList.remove(i);
                i--;
            }
        }
    }

    //added methods for debugging and testing
    public WordList(ArrayList<String> theList){
        myList=theList;
    }

    public String toString(){
        return myList.toString();
    }


}
