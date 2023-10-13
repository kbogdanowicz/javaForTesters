import model.computer.Laptop;
import model.computer.PC;
import utils.StringUtils;
import utils.WeekUtils;

public class MainApp {

    public static void main(String[] args) {

        PC officeComputer = new PC("Office Computer", "HP", 500, 128);
        Laptop gamingLaptorp = new Laptop("XGames", "HP GAMES", 500, 256);

        officeComputer.switchOn();
        gamingLaptorp.switchOn();

    }
}
