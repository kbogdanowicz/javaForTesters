import model.computer.Computer;
import model.computer.Laptop;
import model.computer.PC;

public class MainApp {

    public static void main(String[] args) {

        Computer officeComputer1 = new PC("Office Computer 1", "HP", 500, 128);
        Computer gamingLaptop = new Laptop("XGames", "HP GAMES", 500, 256, 50);

        System.out.println(officeComputer1.volumeUp());
        System.out.println(gamingLaptop.volumeUp());
    }
}
