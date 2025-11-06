package _34_Lambda.calculator;
/*람다식은 단일 메소드만 가지는 인터페이스(함수형 인터페이스)를 구현하는 형태인데
* 구현해야할 메소드가 하나만 정의된 인터페이스
* @FunctionalInterface 어노테이션을 사용하면 컴파일 시에 단일 메소드인지 체크 해준다.*/
@FunctionalInterface // 1. 빨간줄 뜨는 이유 단일 메소드가 있어야하는데 하나도 없기 때문이다.
public interface Calculator {
    int calculate(int a, int b); //이러니까 빨간줄 사라진다.
    //임의로 하나 더만들어보자.
    // int calculate2(int a, int b, int c) //단일 메소드여야하는데 두개 만들어서 또 에러가 뜬다.
} //2. 이제 메인으로 간다.
