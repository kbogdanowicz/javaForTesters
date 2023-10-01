public class MainApp {

    public static void main(String[] args) {

//        Arithmetic Operqators
        double a = 10;
        double b = 4;
        System.out.println(10 + 10);
        System.out.println(10 - 10);
        System.out.println(10 * 10);
        System.out.println(10 / 10);
        System.out.println(a / b);

//        Relational Operators
        int numOne = 1;
        int numTwo = 2;
        System.out.println(numOne > numTwo);
        System.out.println(numOne < numTwo);
        System.out.println(numOne == numTwo);
        System.out.println(numOne != numTwo);

//        Logical Operators
//        || OR
        System.out.println(numOne > numTwo || numOne == 1 ); // false || true -> true
        System.out.println(numOne > numTwo || numOne != 1 ); // false || false -> false
        System.out.println(numOne < numTwo || numOne != 1 ); // true || not checked -> true

//        && AND
        System.out.println(numOne < numTwo && numOne == 1 ); // true AND true -> true
        System.out.println(numOne > numTwo && numOne == 1 ); // false AND true -> false
        System.out.println(numOne > numTwo && numOne != 1 ); // false AND false -> false

//        Control statement
        if(numOne < numTwo) {
            System.out.println("number one is less than number two");
        } else {
            System.out.println("number one is greater then number two");
        }

        String homePage = "Home";
        String loginPage = "Login";
        String contactPage = "Contact";

        String page = "Login";

        switch(page){
            case "Home":
                System.out.println("I switch to Home page");
                break;
            case "Login":
                System.out.println("I switch to Login page");
                break;
            case "COntact":
                System.out.println("I switch to Contact page");
                break;
            default:
                System.out.println("I don't know this page");
        }
    }
}
