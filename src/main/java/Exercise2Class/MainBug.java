package Exercise2Class;

public class MainBug {

    public static void main(String[] args) {

        Bug bug1 = new Bug("Submit button is not working", "bartek@test.pl", 4);

        bug1.showAllBugInfo();
        bug1.showEmail();
        bug1.showBugStatus();
        int priority = bug1.getPriority();
        System.out.println(priority);

        bug1.bugStatus = false;
        bug1.showBugStatus();

    }
}
