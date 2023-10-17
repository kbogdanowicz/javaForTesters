import model.computer.Computer;
import model.computer.Laptop;
import model.computer.PC;

public class MainApp {

    public static void main(String[] args) {

        Computer officeComputer1 = new PC("Office Computer 1", "HP", 500, 128);
        Computer gamingLaptop = new Laptop("XGames", "HP GAMES", 500, 256, 50);

        System.out.println(officeComputer1.volumeUp(20));
        System.out.println(officeComputer1.volumeUp(55));
        System.out.println(officeComputer1.volumeUp(35));

        System.out.println(officeComputer1.volumeDown(69));
        System.out.println(officeComputer1.volumeDown(12));
        System.out.println(officeComputer1.volumeDown(45));
        System.out.println(officeComputer1.volumeDown(12));

        System.out.println(gamingLaptop.volumeUp(30));
        System.out.println(gamingLaptop.volumeUp(60));
        System.out.println(gamingLaptop.volumeUp(12));

        System.out.println(gamingLaptop.volumeDown(34));
        System.out.println(gamingLaptop.volumeDown(58));
        System.out.println(gamingLaptop.volumeDown(12));
        System.out.println(gamingLaptop.volumeDown(34));





    }
}
