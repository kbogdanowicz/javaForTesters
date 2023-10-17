package model.computer;

public class Laptop extends Computer{

    private int batteryLevel;

    public Laptop(String name, String type, int hdd, int ram, int batteryLevel) {
        super(name, type, hdd, ram);
        this.batteryLevel = batteryLevel;
    }

    public int volumeUp() {
        return volumeLevel += 5;
    }

    @Override
    public int volumeUp(int volumeUp) {
        volumeLevel = volumeLevel + volumeUp;
        if (volumeLevel <= 100 ) {
            return volumeLevel;
        } else {
            return 100;
        }
    }

    @Override
    public int volumeDown() {
        volumeLevel -=2;
        if(volumeLevel <= 0) {
            return 0;
        } else {
            return volumeLevel;
        }
    }

    @Override
    public int volumeDown(int volumeDown) {
        volumeLevel = volumeLevel - volumeDown;
        if (volumeLevel >= 0) {
            return volumeLevel;
        } else {
            return 0;
        }
    }

    @Override
    public void switchOn() {
        System.out.println("Checking power level");
        if (batteryLevel > 0) {
            super.switchOn();
        } else {
            System.out.println("Battery level to low.");
        }

    }

    public void switchOff() {
        System.out.println("Switched off laptop:" + name);
        state = false;
    }

    public void setBatteryLevel(int batteryLevel) {
        this.batteryLevel = batteryLevel;
    }
}
