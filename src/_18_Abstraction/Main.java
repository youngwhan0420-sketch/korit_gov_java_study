package _18_Abstraction;

public class Main { //5.메인에서 객채 생성 해준다.
    public static void main(String[] args) {
        // Factory factory = new Factory(); // 오류가 뜨는데 추상클래스라 객체 만들 수 없다고 뜬다.
        //6. 그래서 자식 클래스로 해야한다.
        PhoneFactory phoneFactory1 = new PhoneFactory();
        phoneFactory1.setFactoryName("애플");

        phoneFactory1.produce("iphone17");
        phoneFactory1.displayInfo();
        phoneFactory1.manage();

        TabletFactory tabletFactory1 = new TabletFactory();
        tabletFactory1.upgrade("");


        //7. 팩토리 추상클래스라 객체 못만들지만 만드는 방법
        // 메인부에서 구현을 하면서 객체를 만들었다.얘를 익명 클래스 라고 한다.
        //익명클래스라 임시로 잠깐 생겨난 객체라 다른 객체처럼 만든게 아니다.
        Factory factory = new Factory() {
            @Override
            public void produce(String model) {
                System.out.println(this.getFactoryName() + "에서 [" + model + "]을 생성합니다.");
            }

            @Override
            public void manage() {
                System.out.println(super.getFactoryName() + "을 관리합니다.");

            }
        };
        //위와 같이 추상 클래스의 개념을 벗어나는 객체 생성은 익명 클래스라는 개념 덕분이다.
        //즉 재사용하지않고 한번만 사용하고 버릴 거라면(즉,Main클래스에서만 사용하고 다른 곳에서는 사용하지 않을 거라면 익명 클래스가 유용하다.
        /*
         * 그렇다고 해서 추상 클래스 Factory의 객체가 생성된 것이 아닌 임시(즉석)로 만들어진 이름없는 자식 클래스다.
         * 이름없는 자식 클래스는 익명 클래스다.
         * 그래서 추상 클래스의 객체가 만들어진 것이 아니지만 추상 클래스의 개념은 지키고 있다.
         *
         *
         *
         * */

    PhoneFactory phoneFactory2 = new PhoneFactory();
    phoneFactory2.setFactoryName("삼성 공장");
    phoneFactory2.produce("갤럭시 s25");

    }

}
