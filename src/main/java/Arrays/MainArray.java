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
    }
}
