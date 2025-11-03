package _28_WildCard;

public class Unbounded {
    //<?>는 타입에 제한이 없다 즉, 비한정적 와일드카드다.
    //단점은 읽기(get)만 가능하고 쓰기(set)는 불가능하다.
    //왜냐하면 타입이 명확하지 않기 때문이다.
    public static void inspect(Box<?> box) {
        //일기는ㅇ 가능한데 쓰기는 불가능하니 box.setValue(new Dog()); 불가능하다. 모두다 들어오게 해줬기 때문에 어떤 타입을 들어올지 모르기 때문 그래서 쓰기는 불가능
        System.out.println("Box 내용물: " + box.getValue());

    }
}
