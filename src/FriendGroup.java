import java.util.ArrayList;

public class FriendGroup {
    ArrayList<Friend> friends = new ArrayList<Friend>();

    FriendGroup(ArrayList<Friend> fr) {
        friends = fr;

    }

    FriendGroup() {

    }

    public void display() {
        for(Friend i: friends) {
            System.out.println(i);
        }
    }

    public Friend findFriend(String first) {
        for(Friend i: friends) {
            if(i.toString().contains(first)) {
               return i;
            }
        }
        return null;
    }

    public void listFriends(int le) {
        for(Friend i: friends) {
            if(i.getLevel() == le) {
                System.out.println(i.toString());
            }
        }
    }

    public void addFriend(Friend aFriend) {
        friends.add(aFriend);
    }

    public void addFriend(int index, Friend aFriend) {
        friends.add(index, aFriend);
    }

    public void removeFriend(String first) {
        friends.remove(first);
    }

    public void removeAll(int le) {
        for(int i = 0; i < friends.size() - 1; i++) {
            if(friends.get(i).getLevel() == le) {
                friends.remove(i);
            }
        }
    }

    public boolean improvable(String first) {
        if(this.findFriend(first).getLevel() < 4) {
            return true;
        }
        else {
            return false;
        }
    }

    public boolean improveFriend(String first) {
        if(this.improvable(first) == true) {
            this.findFriend(first).improveFS();
            return true;
        }
        else {
            return false;
        }

    }

}
