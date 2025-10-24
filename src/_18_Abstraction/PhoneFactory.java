package _18_Abstraction;

public class PhoneFactory extends Factory {//1. 추상 클래스 팩토리를 상속받자 빨간불 뜨는거는 생성자에 뭔가 주입을 해줘야 하는데 추상메소드 둘을 구현 해줘야함
//2. 메소드 구현 해준다.
    // 추상 클래스를 상속받으면 반드시 추상메소드를 재정의 해줘야 한다.
    @Override
    public void produce(String model) {
        //3.출력해준다.
        System.out.println("[" + model + "] 모델 스마트폰을 생산합니다.");
    }

    @Override
    public void manage() {
        //4. 재정의 해준다
        System.out.println("스마트폰 공장을 관리합니다.");

    }

}
