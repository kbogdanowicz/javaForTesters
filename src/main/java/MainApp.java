import model.User;

import java.util.*;

public class MainApp {

    public static void main(String[] args) {

        Map<Integer, String> names = new HashMap<>();

        names.put(10, "Bartek10");
        names.put(0, "Bartek0");
        names.put(1, "Bartek1");
        names.put(20, "Bartek20");
        names.put(5, "Bartek5");

        System.out.println(names);

        for (Map.Entry<Integer, String> name : names.entrySet()) {
            System.out.println(name.getKey() + " " + name.getValue());
        }

    }

}
