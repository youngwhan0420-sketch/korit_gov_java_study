package _19_Interface.SmartDevice;

public class SmartAirConditioner implements SmartDevice { //2. 상속 받기













    //4. 상속 받기
    boolean turnedOn; // 4. 상속 받기//
    int temperature = 24;

    // 3.
    @Override
    public String getName() {
        return "스마트 에어컨";
    }

    //5.
    @Override
    public void turnOn() {
        turnedOn = true;
        System.out.println(getName()+"의 전원이 켜집니다.");
    }


    @Override
    public void turnOff() {
        turnedOn = false;
        System.out.println(getName()+"의 전원이 꺼집니다.");
    }
    //6.
    @Override
    public boolean isTurnedOn() {
        return turnedOn;
    }


    // 7.
    public void upTemperature() {
        if (turnedOn) {
            temperature++;
            System.out.println("설정 온도 : "+temperature);
        } else {
            System.out.println("전원이 꺼져있습니다. 전원을 켜주세요.");
        }
    }

    // 8.
    public void downTemperature() {
        if (turnedOn) {
            temperature--;
            System.out.println("설정 온도: " + temperature);
        } else {
            System.out.println("전원이 꺼져있습니다. 전원을 켜주세요.");
        }
    }

}
