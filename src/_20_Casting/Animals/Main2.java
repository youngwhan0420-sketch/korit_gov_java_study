package _20_Casting.Animals;

public class Main2 {
    public static void main(String[] args) {
        //1.객체 만들어보자
        Dog dog1 = new Dog();
        Animal animal1 = new Animal();
        //이때 instanceof를 써보자
        //쓰는 방법은 (객체 instanceof 클래스)
        //결과는 true냐 false로 나온다. 결과값이 true인 경우는 앞에 객체가
        boolean result1 = animal1 instanceof Animal;
        System.out.println(result1); //true: 확인하고자 하는 객체가 해당 클래스의 인스턴스 이거나 자식 클래스의 인스턴스 인지 확인
        boolean result2 = animal1 instanceof Dog;
        System.out.println(result2); //false

        boolean result3 = dog1 instanceof Dog;
        System.out.println();
        boolean result4 = dog1 instanceof Animal;
        System.out.println();
        //이걸 어디다 쓰냐면
        Animal animal2 = new Dog();
        //도그에 웨그테일
        if (animal2 instanceof Dog ) {//dog2를 붙혀주면 24번줄은 안써도 된다.
            Dog dog2 = (Dog) animal2;
            dog2.wagTail();//안전하게 호출 가능, ClassCastException방지
        } else {
            System.out.println("불가능한 다운캐스팅 입니다.");
        }
    }
}
