package _28_WildCard;
/*
* <? super U> 하한 경계 와일드카드이다.
* 하위 클래스 제한을 둔다. (U와 그 부모 클래스들만 가능하다.
* 하한이 U
* 쓰기는 가능하나 읽기가 안전하지 않다.
*
*/
public class LowerBounded {
    public static void putDog(Box<? super Animal> box) {
//        box.setValue(new Dog());
//        box.setValue(new Animal());
//        System.out.println(box.getValue());
        Object o = box.getValue();
        System.out.println(o);
        //컴파일 에러 (Box<Object>, <Animal> 뭐가 튀어나올지 모르기 때문에 에러뜬다.

    }
}
