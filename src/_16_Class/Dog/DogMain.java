package _16_Class.Dog;

public class DogMain {
    public static void main(String[] args) {
        //도면만 짠거기 실체화 되어있지 않기 때문에 여기서 만들어본다.
        //객체 생성하는 방법
        Dog dog1 = new Dog(); //Dog클래스를 가지고 dog1이라는 이름의 객체를 만듦

        //생성된 해당 객체 속성 값 대입 또는 변경을 해본다
        //dog1. //을 찍어보면 속성들 3가지가 나온다.
        dog1.name = "방울이";
        dog1.age = 3;
        dog1.dogType = "시고르자브종";

        //이름을 갑자기 바꾸고 싶으면 dog1.name = "해피";로 바꿀 수 있다.
        //출력해서 확인해보기
        System.out.println(dog1.name);
        System.out.println(dog1.age);
        System.out.println(dog1.dogType);

        //생성된 객체의 메소드를 호출하는 방법
        dog1.callName();
        dog1.showInfo();

        //1.문제
        //student라는 패키지 안에 Student와 StudentMain만들고
        //속성 - 이름, 나이, 이메일, 주소
        //메소드 - showInfo()로 정보 출력
        //StudentMain에서 객체 생성 후 정보 대입, showInfo()메소드를 통해 정보 출력



    }
}
