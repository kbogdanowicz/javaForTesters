import ObjectClass.User;
import Utils.StringUtils;

public class MainApp {

    public static void main(String[] args) {

     String bartekTestowy = StringUtils.getFormattedText("BartekTestowy");
     System.out.println(bartekTestowy);

     String bartek = StringUtils.getFormattedText("Bartek");
     System.out.println(bartek);
    }
}
