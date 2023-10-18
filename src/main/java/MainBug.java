import model.Bug;
import model.BugReporter;

public class MainBug {

    public static void main(String[] args) {

        BugReporter reporter = new BugReporter("Bartek", "Testowy", "b@test.pl");
        Bug bug = new Bug("Submit button is not working", new BugReporter("Bartek", "Testowy", "b@test.pl"), 4);

        System.out.println(bug);

        bug.setBugStatus(true);

        System.out.println(bug);
    }
}
