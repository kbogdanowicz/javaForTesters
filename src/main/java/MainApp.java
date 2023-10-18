import model.computer.*;

import java.util.ArrayList;
import java.util.List;

public class MainApp {

    public static void main(String[] args) {

      Hdd hdd = new Hdd("Samsung", 500);
      Computer mac = new Laptop("Mac", "PRO", hdd, new Ram("AAA", 128), 100);

      System.out.println(mac.getHdd().getSize());

    }
}
