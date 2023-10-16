package model.computer;

public class PC extends Computer{

    private boolean isPowerSupply;

    public PC(String name, String type, int hdd, int ram) {
        super(name, type, hdd, ram);
        isPowerSupply = false;
    }

    public int volumeUp() {
        return volumeLevel +=1;
    }
    public void showComputerName() {
        System.out.println(name);
    }

    @Override
    public void switchOn() {
        System.out.println("Checking power supply");
        if (isPowerSupply) {
            super.switchOn();
        } else {
            System.out.println("Connect to power supply.");
        }
    }

    public void switchOff() {
        System.out.println("Switched off PC:" + name);
        state = false;
    }

    public void setPowerSupply(boolean powerSupply) {
        isPowerSupply = powerSupply;
    }
}