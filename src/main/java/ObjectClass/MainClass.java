package ObjectClass;

public class MainClass {

    public static void main(String[] args) {

        User bartek = new User("Bartek", "Testowy", "bartek@test.pl", 17);
        bartek.getAllInfo();

        User tomek = new User("Tomek", "Nowy", "tomek.nowy@test.com", 30);
        tomek.getAllInfo();

    }
}
