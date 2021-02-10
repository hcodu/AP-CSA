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
        Horse[] newAr = new Horse[5];
        int count = 0;
        for(int i = 0; i < spaces.length; i++) {

//            if(spaces[i] != null) {
//                newAr[i] = spaces[i];
//                //System.out.println(newAr[i].getName());
//            }
//            else {
//                if(count < 1) {
//                    newAr[i] = spaces[i + 1];
//                    //System.out.println(newAr[i].getName());
//                }
//                else {
//                    newAr[i] = null;
//                    //System.out.println(newAr[i].getName());
//                }
//                i++;
//                System.out.println(newAr[i]);
//                System.out.println(i);
//            }

        }
        spaces = newAr;
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
