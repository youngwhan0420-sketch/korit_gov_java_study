package _16_Class.Car;

public class CarMain {
    public static void main(String[] args) {
        Car audi = new Car(); //생성자로 호출 얘를 실행하면 생성자에 넣어둔 객체가 생성되었습니다가 뜬다. NoArgs를 쓴것 속성값이 아무것도 없다
        audi.carName = "A7"; //이렇게 따로 주입을 해주면 쓸 수 있다.

        //속성값 중 carName만 주입된 객체
        Car santafe = new Car("싼타페"); //밑에 car는 값을 넣어줄 수 있는 생성자이다.
        System.out.println(santafe.carName);
        //아우디는 아무것도 없다.

        //속성값이 모두 주입된 객체
        Car sorrento = new Car("쏘렌토", santafe.carYearModel, santafe.carColor); //아무것도 넣어주지 않으면 객체가 생성되었습니다.가 뜨고 "쏘렌토"를 쓰면 Car쓴거고 3개다 넣어주면 All을 써준거다.
        sorrento.showInfo();
        sorrento.startCar();
        sorrento.drive();

    }
}
