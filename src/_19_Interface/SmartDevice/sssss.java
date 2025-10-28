package _19_Interface.SmartDevice;

import org.ietf.jgss.GSSManager;

public class sssss {
    /* SmartAirConditioner클래스를 만들고 SmartDevice를 상속
     * 고유 속성
     * bool turnedOn
     * int temperature = 24
     *
     * interface
     * getName => "스마트 에어컨" 리턴
     * turnOn =>
     * turnedOn = true;
     * "해당 가전 이름"의 전원을 켭니다. 설정 온도: **도 출력
     * turnOff => 반대로
     * isTurnedOn => 현재 전원 상태 리턴
     * 고유 메소드로 온도 올리는거 하나 내리는거 하나
     * 근데 전원이 꺼져있으면 현재 전원이 꺼져있습니다 출력*/



    /* interface
     * getName => String
     * turnOn, turnOff => void
     * isTurnedOn => boolean*/




    /* hub
    필드에 각 가전이 들어있음
     * 고유 메소드로
     * turnOnAll() => 모든 가전을 전원 킴
     * turnOffAll() => 모든 가전의 전원을 끔
     * showStatus() => 모든 가전의 상태 출력*/





    /* light
    인터페이스 상속받고 에어컨이랑 똑같이
     * 속성으로 turnedOn이랑 brightness = 50
     * 고유 메소드로 밝기를 올리는거 하나 내리는 거 하나
     * 올리거나 내릴때 전원이 켜져있어야 하며 10씩 증감*/




    /* speaker
    똑같이
     * 속성으로 turnedOn, playListName = "발라드"
     * 고유 메소드로 playListName을 파라미터로 받아서
     * 해당 재생 목록을 재생하는 메소드*/
    public static void main(String[] args) {
        SmartAirConditioner smartAirConditioner = new SmartAirConditioner();
//        smartAirConditioner.upTemperature();
//        smartAirConditioner.turnOn();
//        smartAirConditioner.upTemperature();
//        smartAirConditioner.turnOff();
//        smartAirConditioner.turnOn();

//        smartAirConditioner.downTemperature();






    }



































































}
