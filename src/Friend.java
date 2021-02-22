public class Friend {
    private String first;
    private String last;
    private int level;

    Friend(String f, String l, int le) {
        first = f;
        last = l;
        level = le;
    }

    public void improveFS() {
        level++;
    }

    public String toString() {
        return first + " " + last + " Level: " + level;
    }

    public String getFirst() {
        return first;
    }
    public String getLast() {
        return last;
    }
    public int getLevel() {
        return  level;
    }


}
