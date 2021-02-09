import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class HorseBarn {
    private Horse[] spaces;

    public HorseBarn(Horse[] spaces) {
        this.spaces = spaces;
    }

    public int findHorseSpace(String name) {
        int index = -1;
        for(int i = 0; i < spaces.length; i++) {
            System.out.println(i + spaces[i].getName());
//            if((spaces[i].getName()).equals(name)) {
//                index = i;
//                return index + 1;
//            }
        }
        return index;
    }

    public void consolidate(){
        ArrayList<Horse> newArList = new ArrayList<Horse>();
        Collections.addAll(newArList, spaces);

        for(int i = 0; i < spaces.length; i++) {

        }
    }

    public String toString(){
        String toReturn="";
        for(Horse item: spaces){
            if(item!=null){
                toReturn+=item.getName()+ " "+ item.getWeight()+"\n";
            }
            else{
                toReturn+="null\n";
            }
        }
        return toReturn;
    }

}
