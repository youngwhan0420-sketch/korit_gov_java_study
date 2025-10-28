//package _19_Interface.SmartDevice;
//
//public class SmartLight implements SmartDevice {
//    // 9.
//    public boolean SmartLight;
//    private int brightness;
//
//
//    // 10.
//    @Override
//    public String getName() {
//        return "스마트 전등";
//    }
//
//    @Override
//    public void turnOn() {
//
//    }
//
//    @Override
//    public void turnOff() {
//        turnOn() = false;
//        System.out.println();
//
//    }
//
//    @Override
//    public boolean isTurnedOn() {
//        return turnedOn();
//    }
//
//    //11.
//    public void dim() {
//        if (!turnedOn) {
//            System.out.println();
//            return;
//        }
//        brightness -= 10;
//        System.out.println();
//    }
//
//    // 12.
//    public void dim() {
//        if (!turnedOn) {
//            System.out.println();
//            return;
//        }
//        brightness += 10;
//        System.out.println();
//    }
//}