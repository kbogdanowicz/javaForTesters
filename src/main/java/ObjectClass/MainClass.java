package ObjectClass;

public class MainClass {

    public static void main(String[] args) {

        User bartek = new User();
        bartek.firstName = "Bartek";
        bartek.lastName = "Testowy";
        bartek.email = "bartek@test.pl";
        bartek.age = 17;
        bartek.isAdult = false;
        bartek.fullName();
        bartek.getAllInfo();

        int userAge = bartek.getUserAge();
        System.out.println(userAge);

        boolean userAdult = bartek.isUserAdult();
        System.out.println("Is bartek adult: " + userAdult);


        User tomek = new User();
        tomek.firstName = "Tomek";
        tomek.lastName = "Nowy";
        tomek.email = "tomek.nowy@test.com";
        tomek.age = 30;
        tomek.isAdult = true;
        tomek.fullName();
        tomek.getAllInfo();

        int tomekAge = tomek.getUserAge();
        System.out.println(tomekAge);

        boolean tomekAdult = tomek.isUserAdult();
        System.out.println("Is tomek adult: " + tomekAdult);
    }
}
