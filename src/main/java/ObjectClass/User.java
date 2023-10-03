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
}
