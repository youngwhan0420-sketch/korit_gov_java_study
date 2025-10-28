//package _19_Interface.SmartDevice;
//
//public class SmartHomeHub {
//    private SmartAirConditioner smartAirConditioner;
//    private SmartSpeaker smartSpeaker;
//    private SmartLight smartLight;
//
//    // 생성자 만들어주기
//    public SmartHomeHub(SmartAirConditioner smartAirConditioner, SmartSpeaker smartSpeaker, SmartLight smartLight) {
//        this.smartAirConditioner = smartAirConditioner;
//        this.smartSpeaker = smartSpeaker;
//        this.smartLight = smartLight;
//    }
//    public void turnOnAll() {
//        smartAirConditioner.turnOn();
//        smartSpeaker.turnOn();
//        smartLight.turnOn();
//    }
//
//    public void turnOffAll() {
//        smartAirConditioner.turnOff();
//        smartSpeaker.turnOff();
//        smartLight.turnOff();
//    }
//    public void showStatus() {
//        System.out.println("" + smartAirConditioner.isTurnedOn());//트루면 on false면 오프
//        System.out.println("" + smartAirConditioner.isTurnedOn());
//        System.out.println("" + smartAirConditioner.isTurnedOn());
//    }
//}
