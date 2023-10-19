import model.User;

import java.util.*;

public class MainApp {

    public static void main(String[] args) {

        Set<String> names = new HashSet<>();

        names.add("Bartek");
        names.add("Mirek");
        names.add("Piotrek");
        names.add("Tomek");
        names.add("Asia");
        names.add("Bartek");

        System.out.println(names.size());

        Set<String> sortedNames = new TreeSet<>(names);

        for (String name: sortedNames
             ) {
            System.out.println(name);
        }
    }
}
