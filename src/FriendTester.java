public class FriendTester {
    public static void main(String[] args) {


		FriendGroup homies = new FriendGroup();
        homies.addFriend(new Friend("Tim", "Roberts", 4));
        homies.addFriend(new Friend("Mary", "Roberts", 4));
        homies.addFriend(new Friend("Tom", "Roberts", 3));
        homies.addFriend(new Friend("Tam", "Roberts", 2));
        homies.addFriend(3, new Friend("Terry", "Roberts", 3));
        homies.addFriend(new Friend("Carrie", "Roberts", 1));
        homies.display();
        homies.listFriends(2);
        homies.improveFriend("Terry");
        homies.display();
        homies.improveFriend("Carrie");
        homies.listFriends(2);
        homies.removeFriend("Mary");
        homies.listFriends(4);
        homies.improveFriend("Terry");
        homies.removeAll(3);
        homies.display();
        System.out.println(homies.findFriend("Tam").toString());
    }
}
