package _27_Generic;

public class Main {
    public static void main(String[] args) {

        //1. 셋 데이터1에 어떤 데이터가 들어있다 치고
        //2. 메세지도 넣어주고
        //3.
        //4. 출력해보면
        //5. 만약 인트를 넣어야 한다. 그럼 int를 넣는데 너무 번거롭다.
        //6. 그래서 이거를 대치하기 위해 제네릭이라는 기술이 나왔다.

        //이렇게 해주면 된다. 그럼 리스폰데이터1은 스트링타입으로 된다.
        //리스폰스데이터2는 안에있는데이터의 타입을 인티저로 쓰겠다는 뜻


        String str = GenericEx.identify("HEllo");
        System.out.println(str);
    }
}
