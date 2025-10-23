package _16_Class.WaterBottle;

public class WaterBottle {
    rivate int currentWater;

    //getter만들기

    public void fill(int amount) {
        if (amount > 0 && currentWater + amount <= 1000) {
            currentWater += amount;
            System.out.println(amount + "의 양만큼 물병의 물을 채웠습니다.");
        } else {
            System.out.println("");
        }
    }


    //물 마시기
    //조건이 0 이상




}













//문제
//WaterBottle 패키지 만들고 클래스
//currentWater 물의 양 => 속성
//메소드 물 채우기 fill => 최대용량 1000으로 이상으로 채울 수 없음 if (fill < 0) {
                                                            //s
//메소드 물 마시기 drink => 현재 용량보다 초과해서 마실 수 없음
//getter로 현재 물의 양 출력하기 int getwaterBottle() {

//객체 생성시 빈병
