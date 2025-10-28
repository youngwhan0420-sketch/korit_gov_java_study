package _20_Casting.Animals;

//public class Main {
//    public static void main(String[] args) {
//        Dog dog1 = new Dog(); //생성과 동시에 바로 넣음
//        dog1.speak();
//        dog1.wagTail();
//
//        //업캐스팅 해보기 (자식 -> 부모)
//        Animal a = new Dog(); //애니멀 타입에 객체를 넣었는데 왜 가능하냐면 도그는 애니멀의 자식클래스이기 때문이다.
//        //그럼 a는 참조를 부모를 하게 된다.
//        a.speak();//멍멍이 나오지만
//        a.wagTail(); //부모한테는 wagTail이 없기 때문에 부를 수 없다.
//        //자식만 가지고 있으면 업캐스팅 했을 때 호출할 수 없다.
//    //a는 Animal타입이지만 내부적으로 Dog의 객체
//    //얘를 부를 수 있는 방법은 다운 캐스팅 해야한다.
//        //다운 캐스팅(부모 -> 자식)
//        ((Dog) a).wagTail();
//
//        Animal a2 = dog1;
//        Dog dog2 = (Dog) a2;
//        dog2.wagTail();
//
//        //다양한 자식들을 하나의 클래스 타입으로 처리할 수 있다.
//        Dog dog3 = new Dog();
//        Dog dog4 = new Dog();
//        Dog dog5 = new Dog();
//        Dog[] dogs = {
//                dog3,
//                dog4,
//                dog5
//        };
//        Animal dog = new Dog();
//        Animal cat = new Cat();
//        Animal tiger = new Tiger();
//        Animal[] animals = {
//                dog,
//                cat,
//                tiger
//        }; //업캐스팅이 되기 때문에 부모클래스로 한번에 처리가 가능하다.
//        for(Animal animal : animals) {
//            animals.speak(); //오버라이드 된 스피크 호출
//        }
//    }
//}

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.speak();
        dog1.wagTail();

        //업캐스팅 (자식 -> 부모)
        Animal a = new Dog();
        //a는 Animal타입이지만 내부적으로 Dog의 객체
        a.speak();
//        a.wagTail();

        //다운캐스팅 (부모 -> 자식)
        ((Dog) a).wagTail();

        Animal a2 = dog1;
        Dog dog2 = (Dog) a2;
        dog2.wagTail();

        //다양한 자식들을 하나의 클래스타입으로 처리할 수 있다.
        Dog dog3 = new Dog();
        Dog dog4 = new Dog();
        Dog dog5 = new Dog();
        Dog[] dogs = {
                dog3,
                dog4,
                dog5
        };

        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal tiger = new Tiger();
        Animal[] animals = {
                dog,
                cat,
                tiger
        };

        for (Animal animal : animals) {
            animal.speak();
        }
    }
}
