package model.computer;

public class PC extends Computer implements Music, Video {

    private boolean isPowerSupply;

    public PC(String name, String type, int hdd, int ram) {
        super(name, type, hdd, ram);
        isPowerSupply = false;
    }

    public int volumeUp() {
        return volumeLevel += 1;
    }

    @Override
    public int volumeUp(int volumeUp) {
        volumeLevel = volumeLevel + volumeUp;
        if (volumeLevel <= 100) {
            return volumeLevel;
        } else {
            return 100;
        }
    }

    @Override
    public int volumeDown() {
        volumeLevel -= 1;
        if (volumeLevel <= 0) {
            return 0;
        } else {
            return volumeLevel;
        }
    }

    @Override
    public int volumeDown(int volumeDown) {
        volumeLevel = volumeLevel - volumeDown;
        if (volumeLevel < 0) {
            return 0;
        } else {
            return volumeLevel;
        }
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

    @Override
    public void playMusic() {
        System.out.println("PLAY MUSIC");
    }

    @Override
    public void pauseMusic() {
        System.out.println("PAUSE MUSIC");
    }

    @Override
    public void stopMusic() {
        System.out.println("STOP MUSIC");
    }

    @Override
    public void playVideo() {
        System.out.println("PLAY VIDEO");
    }

    @Override
    public void pauseVideo() {
        System.out.println("PAUSE VIDEO");
    }

    @Override
    public void stopVideo() {
        System.out.println("STOP VIDEO");
    }
}
