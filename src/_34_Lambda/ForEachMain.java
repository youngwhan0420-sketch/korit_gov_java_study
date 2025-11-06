package _34_Lambda;

import java.util.Arrays;
import java.util.List;

public class ForEachMain {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("사과", "딸기", "블루베리", "수박", "포도");

        for(String fruit : fruits) {
            System.out.println(fruits);
        } //향상된 포문으로 순회

        //for each로 하기
        fruits.forEach(fruit -> System.out.println("과일: " + fruit)); //
        //향상된 포문에는 스트링 해줘야하는데 여기선 알아서 된다.

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        numbers.forEach(number -> System.out.println(number * 2));

    }
}
