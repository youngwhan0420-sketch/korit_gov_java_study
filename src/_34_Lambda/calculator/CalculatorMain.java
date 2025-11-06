package _34_Lambda.calculator;

import java.util.function.Predicate;

public class CalculatorMain {
    public static int operate(int a, int b, Calculator c) { //3. 오퍼레이트 가 하는일은 매개 변수 3개 받는데 칼큘레이터안에느 칼큘레이트 메소드가 하나있는데 거기에 ab숫자 두개를 매개변수로 받는다.
        return c.calculate(a, b); //칼큘레이터를 호출하면서 인자 두개를 넣어둔다.
    }

    public static void main(String[] args) { //4. 칼큘레이터에있는 칼큘레이트를 람다로 구현해준다.
        Calculator add = (x, y) -> x + y;
        Calculator sub = (x, y) -> x - y;
        Calculator mul = (x, y) -> x * y;
        Calculator div = (x, y) -> x / y;

        //오퍼레이트를 부르면 된다.
        System.out.println("2 + 3 = " + operate(2, 3, add));
        System.out.println("2 - 3 = " + operate(2, 3, sub));
        System.out.println("2 * 3 + " + operate(2, 3, mul));

        Predicate<Integer> isZero = (num) -> {
            if (num == 0) {
                return true;
            }
            return false;
        };

        Calculator div2 = (x, y) -> {
            if (y == 0) {
                System.out.println("0으로 나눌 수 없습니다.");
                return 0;
            }
            return x / y;
        };
        System.out.println("4 / 0 = " + operate(4, 0, div2));
    }
}
