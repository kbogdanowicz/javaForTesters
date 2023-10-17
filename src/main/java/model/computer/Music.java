package model.computer;

public interface Music {

    void playMusic();
    void pauseMusic();
    void stopMusic();

    default void sayHello() {
        System.out.println("Hello from Music default");
    }
}
