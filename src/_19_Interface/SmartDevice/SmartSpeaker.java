package _19_Interface.SmartDevice;

public class SmartSpeaker implements SmartDevice{ //1. 인터페이스 상속 받으니
    private  boolean turnedOn;
    private String playListName = "발라드";

    @Override
    public String getName() {
        return "";
    }

    @Override
    public void turnOn() {
        turnedOn = true;
        System.out.println(getName() + "" + playListName + "");

    }

    @Override
    public void turnOff() {
        turnedOn = false;
        System.out.println(getName() + " " );

    }

    @Override
    public boolean isTurnedOn() {
        return turnedOn;
    }
    public void changePlaylist(String playListName) {
        this.playListName = playListName;
        System.out.println("" + playListName + "");
    }
}
