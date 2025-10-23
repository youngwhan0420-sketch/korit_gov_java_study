package _16_Class.Dog;

public class Dog {
    //속성을 먼저 기반으로 해야한다.
    //속성 => 클래스의 필드
    //개는 이름, 나이, 종이 있을 수 있을테니
    String name;
    int age;
    String dogType;

    //기능을 정의
    //기능 => 클래스의 메소드
    public void callName(){
        //이름을 부르면 짖는다 생각
        System.out.println("왈왈");
    }
    //정보를 볼수 있는 기능이 있다 하면
    public void showInfo() {
        System.out.println("정보 출력");
        System.out.println("이름은 " + name + " , 나이는 " + age);

    }
    //속성을 정의는 했지만 값이 나오진 않기 때문에 나오게 해준다.



}
