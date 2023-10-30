import model.Bug;
import model.BugReporter;

import java.util.*;

public class MainBug {

    public static void main(String[] args) {

        System.out.println("---LIST---");

        List<Bug> bugs = new ArrayList<>();
        bugs.add(new Bug("Bug", new BugReporter("Bartek", "Testowy", "bz@test.pl"), 4));
        bugs.add(new Bug("New bug", new BugReporter("Tomek", "Testowy", "tomek@test.pl"), 1));
        bugs.add(new Bug("Bug 2", new BugReporter("Mirek", "Automatyczny", "miru@test.pl"), 2));
        bugs.add(new Bug("Bug 3", new BugReporter("Asia", "Nowa", "aska@test.pl"), 3));
        bugs.add(new Bug("Bug", new BugReporter("Bartek", "Testowy", "bz@test.pl"), 4));

        for (Bug bug : bugs) {
            System.out.println(bug.getBugDescription());
        }

        System.out.println("---SET---");

        Set<Bug> bugSet = new HashSet<>(bugs);

        for (Bug bug : bugSet) {
            System.out.println(bug.getBugDescription());
        }

        System.out.println("---TREESET---");

        Set<Bug> bugTreeSet = new TreeSet<>(bugSet);

        for (Bug bug : bugTreeSet) {
            System.out.println(bug.getBugDescription());
        }

    }
}
