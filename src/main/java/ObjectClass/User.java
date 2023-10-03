package ObjectClass;

public class User {

    String firstName; // null
    String lastName; // null
    String email; // null
    int age; // 0
    boolean isAdult; // false

    void fullName() {
        System.out.println(firstName + " " + lastName);
    }

    void getAllInfo() {
        System.out.println(firstName + " " + lastName + " " + email + " " + age + " " + isAdult);
    }

    int getUserAge() {
        return age;
    }

    boolean isUserAdult() {
        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }

    void greetings(String name) {
        System.out.println("Hi " + name + ", how are you?");
    }

    void greetings(String firstName, String lastName) {
        System.out.println("Hi " + firstName + " " + lastName + ", how are you?");
    }

    void howOldAreYou(String userName, int userAge) {
        System.out.println("Hi " + userName + ", you are " + userAge + " years old");
    }

    int userAgePlus10(int userAge) {
        return userAge + 10;
    }
}
