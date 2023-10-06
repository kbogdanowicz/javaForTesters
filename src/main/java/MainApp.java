import ObjectClass.User;

public class MainApp {

    public static void main(String[] args) {

       String str1 = "Hello";
       String str2 = "hwllo";

        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));

        String upperCase = str1.toUpperCase();
        System.out.println((upperCase));

        String lowerCase = str1.toLowerCase();
        System.out.println(lowerCase);

        boolean startsWith = str1.startsWith("He");
        System.out.println(startsWith);

        System.out.println(str1.endsWith("lo"));
        System.out.println(str1.endsWith("ll"));

        System.out.println("    ".isBlank());
        System.out.println("   ".isEmpty());

        String replace = str1.replace("llo", "QWE");
        System.out.println(replace);

        String s = str1.replaceAll("l", "x");
        System.out.println(s);

        String substring = str1.substring(1, 4);
        System.out.println(substring);

        String textWithWhiteSpaces = "    This is some text    ";
        System.out.println(textWithWhiteSpaces.length());

        String strip = textWithWhiteSpaces.strip();
        System.out.println(strip);
        System.out.println(strip.length());


    }
}
