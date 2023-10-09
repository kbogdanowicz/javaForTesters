package Arrays;

public class MainArray {

    public static void main(String[] args) {

        String names[] = new String[5];

        names[0] = "Bartek";
        names[1] = "Arek";
        names[2] = "Monika";
        names[3] = "Piotr";
        names[4] = "Krzysztof";

        for (int i = 0; i < names.length; i++) {
            if (i % 2 == 0) {
                System.out.println(names[i]);
            }
        }

        for (String name : names
        ) {
            System.out.println(name);
        }

        int[] newNumbers = {1, 2, 3, 4, 5};

        String[] names1 = {"Bartek", "Marek", "Krzysztof", "Adam"};
        System.out.println(names1.length);

        for (String name1 : names1
             ) {
            System.out.println(name1.toUpperCase());
        }

        for (int i = 0; i < names1.length; i++) {
            System.out.println(names1[i].toLowerCase());
        }


    }
}
