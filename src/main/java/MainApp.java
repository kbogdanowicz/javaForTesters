import ObjectClass.User;

public class MainApp {

    public static void main(String[] args) {

        User user = new User("Bartek", "Testowy", "bartek@test.pl", 17);

        System.out.println(user.getEmail());

        user.setEmail("bartek@test.ru");

        System.out.println(user.getEmail());

        user.setEmail("bz@test.pl");

        System.out.println(user.getEmail());

    }
}
