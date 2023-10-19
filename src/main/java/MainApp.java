import model.User;

import java.util.*;

public class MainApp {

    public static void main(String[] args) {

        List<User> users = new ArrayList<>();

        users.add(new User("Bartek", "Testowy", "bk@test.pl", 27));
        users.add(new User("Tomek", "Testowy", "bk@test.pl", 37));
        users.add(new User("Asia", "Testowy", "bk@test.pl", 10));
        users.add(new User("Piotr", "Testowy", "bk@test.pl", 17));

        Collections.sort(users, Comparator.comparing(User::getUserAge));

        for (User user : users) {
            System.out.println(user.getFirstName() + " " + user.getAge());
        }
    }
}
