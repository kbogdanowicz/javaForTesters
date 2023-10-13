package model.computer;

public class PC extends Computer{

    private boolean connectionToPower;

    public PC(String name, String type, int hdd, int ram, boolean connectionToPower) {

        super(name, type, hdd, ram);
        this.connectionToPower = connectionToPower;
    }

    public void showComputerName() {
        System.out.println(name);
    }

    @Override
    public void switchOn() {
        System.out.println("Checking power supply");
        if (connectionToPower) {
            super.switchOn();
        } else {
            System.out.println("Connect computer to power.");
        }
    }

    public void setConnectionToPower(boolean connectionToPower) {
        this.connectionToPower = connectionToPower;
    }
}
