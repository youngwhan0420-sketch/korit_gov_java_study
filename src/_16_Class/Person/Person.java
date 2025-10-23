package _16_Class.Person;

public class Person {
    String name; // private로 걸면 Person이라는 클래스 내에서만 접근이 가능하다.
    String email;
    String address;
    String id;
    //defalut가 생략되어 있다.
    public void setId(String id) {
        this.id = id;
    }


    //모두private걸고
    public String getId() {
        return id;
    } //어디서든 사용이 가능하지만 메소드를 통해서 외부의 값을 받을 수 있다. 직접적으로는 받을 수 없다.
    //이게 없으면 외부에서 접근할 수 있는 방법은 없다.




    /*접근제어자 종류
    * public - 어디서든 접근이 가능하다.
    * protected - 같은 패키지 또는 자식 클래스에서만 접근 가능하다.
    * defalut - 같은 패키지에서만 접근이 가능하고 명시하지않으면 defalut(생략가능하다는 뜻)
    * private - 해당 클래스 내부에서만 접근이 가능하다.
    *
    * */
}
