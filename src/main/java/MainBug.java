import Exercise2Class.Bug;

public class MainBug {

    public static void main(String[] args) {

        Bug bug1 = new Bug("Submit button is not working", "bartek@test.pl", 4);

        bug1.setBugDescription("Short.");
        bug1.setEmail("bartek.test.pl");
        bug1.setBugPriority(7);

        bug1.setBugDescription("Error on start page");
        bug1.setEmail("bartek.z@test.pl");
        bug1.setBugPriority(3);

        bug1.showAllBugInfo();



    }
}
