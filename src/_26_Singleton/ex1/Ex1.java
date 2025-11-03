//package _26_Singleton.ex1;
//
//public class Ex1 {
    //인스턴스를 하나 만든다.

    //접근 못하게 생성자 만든다.

    //
     //인스턴스가 널이면
    //인스턴스에 뉴 Ex1해서 만들고

    //아니면
    //이제 메인에서 만든다


package _26_Singleton.ex1;

public class Ex1 {
    private static Ex1 instance;

    private Ex1() {}

    public static Ex1 getInstance() {
        if(instance == null) {
            instance = new Ex1();
        }
        return instance;
    }
}