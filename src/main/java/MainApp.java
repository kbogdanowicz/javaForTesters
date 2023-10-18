import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class MainApp {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        List<String> names1 = new ArrayList<>();

        names.add("Bartek");
        names.add("MArek");
        names.add("Alicja");
        names. add("Tomek");

        names1.add("Bartek");
        names1.add("Alicja");

//        for (String name: names) {
//            System.out.println(name);
//        }

//        names.remove(0);
//        names.remove("Bartek");

//        String name = names.get(0);
//        System.out.println(name);

//        boolean empty = names.isEmpty();
//        boolean bartek = names.contains("Bartek");

//        System.out.println(names.size());

        names.addAll(names1);

//        names.removeAll(names1);
//        System.out.println(names);

        Collections.sort(names);
        Collections.reverse(names);

        System.out.println(names);

    }
}
