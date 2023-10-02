package ObjectClass;

public class MainClass {

    public static void main(String[] args) {

        User bartek = new User();
        bartek.firstName = "Bartek";
        bartek.lastName = "Testowy";
        bartek.email = "bartek@test.pl";
        bartek.age = 17;
        bartek.isAdult = false;
        System.out.println(bartek.firstName);

        User tomek = new User();
        tomek.firstName = "Tomek";
        tomek.lastName = "Nowy";
        tomek.email = "tomek.nowy@test.com";
        tomek.age = 30;
        tomek.isAdult = true;
        System.out.println(tomek.email);
    }
}
