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

        bartek.greetings("Bartek");
        bartek.greetings("Bartek", "Testowy");
        bartek.howOldAreYou("Bartek", 17);

        int bartekAgePlus10 = bartek.userAgePlus10(17);
        System.out.println(bartekAgePlus10);


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

        System.out.println(tomek.userAgePlus10(tomek.age));
    }
}
