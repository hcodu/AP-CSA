public class HorseBarn {
    private Horse[] spaces;

    public HorseBarn(Horse[] spaces) {
        this.spaces = spaces;
    }

    public int findHorseSpace(String name) {
        int index = -1;
        for(int i = 0; i < spaces.length; i++) {
            if(spaces[i] != null) {
                if(spaces[i].getName().equals(name)) {
                    return i;
                }
            }
        }
        return index;
    }

    public void consolidate(){
        int[] indexes = new int[5];
        Horse[] newAr = new Horse[5];
        int count = 0;
        for(int i = 0; i < spaces.length; i++) {
            if(spaces[i] != null) {
                indexes[count] = i; //find index of the not null objects in the spaces array
                count++; //
            }
        }

        for (int i = 0; i < count; i++) {
            newAr[i] = spaces[indexes[i]];
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
