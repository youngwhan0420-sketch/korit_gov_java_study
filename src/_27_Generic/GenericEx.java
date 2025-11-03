package _27_Generic;

public class GenericEx {

    public static  <T> T identify(T value) {//내가 안에 타입이 뭐가 들어올지 모르는데 클래스 타입이 들어온다고 해둠
        System.out.println(value.getClass().getName());
        return value;
    }
}
