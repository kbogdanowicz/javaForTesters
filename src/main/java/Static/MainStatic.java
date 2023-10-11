package Static;

import ObjectClass.User;

public class MainStatic {

    public static void main(String[] args) {

        User user1 = new User("BArtek", "Testowy", "bart@email.pl", 18);
        User user2 = new User("BArtek", "Testowy", "bart@email.pl", 18);
        User user3 = new User("BArtek", "Testowy", "bart@email.pl", 18);
        User user4 = new User("BArtek", "Testowy", "bart@email.pl", 18);

        System.out.println(User.userCounter);
    }
}
