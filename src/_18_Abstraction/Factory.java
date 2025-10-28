package _18_Abstraction;
/*
* Abstract는 "추상적인", "형태만 있는" 이라는 뜻
* Java에서 abstract는 "틀은 있지만 내용은 없는" 클래스나 메소드를 만들 떄 사용한다.
* 이 기능은 꼭 있어야 해라고 미리틀을 잡아두는데 하지만 어떻게 구현할지는 나중에(자식 클래스) 정한다.
*
* 추상클래스는 객체를 생성할 수 없고, 공통적인 기능의 틀만 가지고 있는 클래스이다.
*
* 추상 클래스를 왜 써야할까
* = 설계 일관성과 확장성을 확보하기 위해서 이다.
* 이렇게 설계하면 공통된 구조를 가진 자식 클래스들을 설계할 수 있게 된다.
* 오류 방지/ 강제 구현 = > 추상 메소드를 구현하지 않으면 컴파일 에러가 발생한다.
* 즉, 필수 기능 구현 누락을 방지한다.
* */
public abstract class Factory { //class앞에 abstract를 붙혀주면 추상 클래스가 된다.
    //1. 일단 필드를 먼저 선언하자
    private String factoryName;

    //3. 추상 메소드 정의 자식 클래스에서 구현한다는건 오버라이드해서 구현한다. 그래서 재정의가 아니고 정의다.
    public abstract void produce(String model);
    public abstract void manage();
    /*
    * abstract가 메소드의 접근 지정자와 리턴 타입 사이에 명시가 되면
    * 클래스도 동일하게 abstract가 있어야 한다.
    * 이말은 추상 클래스여야 추상메소드를 선언할 수 있다.
    * 추상메소드가 하나라도 있으면 추상클래스다.
    * */

    //2.게터 세터 정의
    public String getFactoryName() {
        return factoryName;
    }

    public void setFactoryName(String factoryName) {
        this.factoryName = factoryName;
    }


    public void displayInfo() { //일반 메소드 가질 수 있다.
        System.out.println("공장 정보를 출력합니다.\n 공장 이름: " + factoryName);
    }
}
