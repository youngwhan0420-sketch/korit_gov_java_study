package _16_Class.OOP;

import _16_Class.Person.Person;

public class OOP { //OOP는 객체지향 프로그래밍이란 뜻 (Object Oriented Programming)
    public static void main(String[] args) {
        // 현실 세계의 개념을 코드로 표현한 것 즉, 사람, 동물, 자동차 이런것들을 하나의 객체로 본다.
        //여기에는 상태(속성)와 동작(기능)을 중심으로 프로그래밍한다.

        // OOP의 네가지 원칙
        //1. 추상화 - 복잡한 내부 동작을 감추고, 꼭 필요한 기능만 보여주는 것
        //2. 캡슐화 - 데이터(변수)를 보호하고, 접근을 제한하여 안정성을 높이는 것(정보은닉)
        //3. 상속
        //4. 다양성

        Person person1 = new Person();
        person1.setId("970420 -1 "); //이러고 출력해보면 id의 값을 받아올 수 있다.
        System.out.println(person1.getId());//캡슐화


        person1.getId(); //이렇게 해야 값을 받을 수 있다.
//        person1.name //이렇게는 접근이 불가능하다.
//        person1.email = ""; //같은 패키지가 아니라서 접근이 불가능하다. 생략을해서 default로 되어 있기 때문 접근가능하게하고 싶으면 public를 붙혀준다.
    }
}
