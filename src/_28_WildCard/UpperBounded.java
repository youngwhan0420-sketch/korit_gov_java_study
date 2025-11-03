package _28_WildCard;
/*
* <? extends T> => 상한 경게 와일드 카드
* 상위 클래스 제한을 둔다. (U를 포함해서 그 자손들만 가능)
* 상한이 U인거다.
* 읽기는 가능하나 쓰기가 불가능 하다. 왜냐면 도그클래스를 상속받은 코긱 ㅏ여기 들어온다 치면
* 읽기 전용 */
public class UpperBounded {
    public static void inspect(Box<? extends Dog> box) {//상한 경계 와일드 카드
        Dog d = box.getValue();
        //box.setValue(new Dog()); 이게 안된다. 뭐가 들어갈지 모르기 때문
        System.out.println(d); //코기가 튀어나오면 d는 부모를 참조하지만 자식의 메소드를 먼저 호출한다.그래서 읽기 가능 메인에서 써보면
//        Dog corgi = new Corgi();
//        corgi.toString();//하게 되면 자식꺼를 부르게 된다. 그래서 읽기는 가능하다. 자식꺼의 메소드를 먼저 호출할꺼기 때문이다. 쓰기는 불가능 타입이 명확하지 않기 때문

    }
}
