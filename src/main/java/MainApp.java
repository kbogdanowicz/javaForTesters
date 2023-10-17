import model.computer.PC;

public class MainApp {

    public static void main(String[] args) {

        PC officeComputer1 = new PC("Office Computer 1", "HP", 500, 128);

        officeComputer1.playMusic();
        officeComputer1.pauseMusic();
        officeComputer1.stopMusic();

        officeComputer1.sayHelloFromMusic();

        officeComputer1.playVideo();
        officeComputer1.pauseVideo();
        officeComputer1.stopVideo();

        officeComputer1.sayHelloFromVideo();
    }
}
