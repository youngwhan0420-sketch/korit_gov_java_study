package _16_Class.Car;

public class Car {
    //속성 === 필드 === 멤버변수
    String carName;
    int carYearModel;
    String carColor;
    //속성


    //Car클래스의 생성자
    //필드 값이 아무것도 들어가지 않는 생성자
    Car() {
        System.out.println("객체가 생성되었습니다.");
        //생성될때 얘를 출력을해라라고 해놓은거다.이 클래스를 바탕으로 객체를 만들때 car클래스가 호출이 된다.
        System.out.println("NoArgsConstructor"); // 아직 객체에 있는 속성이 값이 없는 상태라는 뜻
    }

    /*
    * this는 해당 클래스로 만들어진 자기 자신 객체를 의미한다.(참조한다.)
    * this를 써야 하는 이유는 속성의 이름과 매개변수의 이름이 같을 경우 명확히 하기 위해서 this를 쓴다.
    * this가 생략이 가능한 경우는 속성의 이름과 매개변수의 이름이 다를경우는 this생략 가능하다.
    * */
    //필드 속성중 carName만 값을 주입하는 생성자
    Car(String carNm) {
        this.carName = carNm; //이때 이름이 다르면 this생략이 가능하다.
        System.out.println("RequiredArgsConstructor");
    }
    //필드 속성 모두 값을 주입하는 생성자
    //속성이 3개니까
    Car(String carName, int carYearModel, String carColor) {
        this.carName = carName;
        this.carYearModel = carYearModel;
        this.carColor = carColor;
        System.out.println("AllArgsConstructor");
    }


    public void startCar() { //기능
        System.out.println(carName + "가 시동을 겁니다.");
    }
    public void drive() { // 기능
        System.out.println(carName + "가 전진합니다.");
    }
    public void stop() {  // 기능
        System.out.println(carName + "가 정지합니다.");
    }
    public void showInfo() { //기능
        System.out.println("자동차 이름은 " + carName);
        System.out.println("자동차 연식은 " + carYearModel);
        System.out.println("자동차 색상은 " + carColor);
    }
}
//객체를 생성할때 사용되는게 생성자인데 생성자는 생략되어 있다.
