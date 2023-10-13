import model.computer.Laptop;
import model.computer.PC;

public class MainApp {

    public static void main(String[] args) {

        PC officeComputer = new PC("Office Computer", "HP", 500, 128);
        Laptop gamingLaptop = new Laptop("XGames", "HP GAMES", 500, 256, 50);

        officeComputer.switchOn();
        System.out.println(officeComputer.getState());

        officeComputer.setPowerSupply(true);
        officeComputer.switchOn();
        System.out.println(officeComputer.getState());

    }
}
