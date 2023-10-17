package model.computer;

public interface Music {

    void playMusic();
    void pauseMusic();
    void stopMusic();

    default void sayHelloFromMusic() {
        System.out.println("Hello from default");
    }
}
