import ObjectClass.User;
import Utils.StringUtils;
import Utils.WeekUtils;

public class MainApp {

    public static void main(String[] args) {

     String bartekTestowy = StringUtils.getFormattedText("BartekTestowy");
     System.out.println(bartekTestowy);

     String bartek = StringUtils.getFormattedText("Bartek");
     System.out.println(bartek);

     System.out.println(WeekUtils.MONDAY);
    }
}
