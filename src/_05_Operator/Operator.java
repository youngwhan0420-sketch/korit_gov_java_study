package _05_Operator;

public class Operator {
    public static void main(String[] args) {
        //operator은 연산자
        //연산자의 종류:
        //대입 연산자
//        int num1 = 10;
//        //=는 해당 변수에 데이터(값)을 대입한다는 의미
//
//        //산술 연산자
//        int num2 = 5;
//        System.out.println(num1 + num2); //15가 나온다.
//        System.out.println(num1 - num2); //5
//        System.out.println(num1 * num2); //50
//        System.out.println(num1 / num2); //몫만 나온다.
//        System.out.println(num1 % num2); //나눈 나머지 가 나온다.
//
//        System.out.println(2 + 3 * 4); //14
//        System.out.println((2 + 3) * 4); //20
//
//        //복합 대입 연산자
//        num1 += 10;
//        //num1 = num1 + 10; 이 뜻 이다.
//        num1 -= 5;
//        //num1 = num1 - 5;
//        num1 *= 2;
//        //num1 = num1 * 2;
//        num1 /= 3;
//        //num1 = num1 / 3;
//        num1 %= 4;
//        //num1 = num1 % 4;
//
//        System.out.println("=================");
//
//
//
//
//
//
//        //증감 연산자
//        int j = 10;
//        System.out.println(j);
//        System.out.println(j++); //j앞에 ++을 해주고 출력 해보자.
//        //j++은 이 코드가 적용 되고 나서 +1을 해준다. 그래서 다시 한번 출력해주면 +가 된 j가 나온다.
//        //++j는 증감을 시켜주고 출력을 해서 바로 11이 나올 것이다.
//        System.out.println(j);
//        System.out.println(++j);// 여긴 11이라 12가 나온다.
//        //-도 마찬가지 이다.
//
//
//        //비교 연산자 = 결과값이 항상 boolean이다. 이뜻은 True, False둘중 하나가 나온다. 조건문 할 때 필요한 개념이다.
//        // == 같다라는 의미
//        System.out.println(num1 == num2); //False 가 나온다.
//        //!= 같지 않다라는 의미
//        System.out.println(num1 != num2); //True가 나온다.
//        // > 왼쪽이 더 크다는 의미
//        System.out.println(num1 > num2); //False
//        // >= 왼쪽이 더 크거나 같다.
//        System.out.println(num1 >= num2); //False
//        // <= 왼쪽이 더 작다
//        System.out.println(num1 < num2); //True
//        // <= 왼쪽이 더 작거나 같다.
//        System.out.println(num1 <= num2);
//

//        //논리 연산자 (& and, | or, ! not)
//        boolean flag1 = true;
//        boolean flag2 = false;
//        System.out.println(flag1 & flag2); //and는 논리곱이라는 의미인 하나라도 false가 있으면 결과값을 false다.
//        System.out.println(flag1 & flag1);// 결과값이 True이다.
//        System.out.println(flag1 | flag2); //or는 논리합이라는 이미인 하나라도 true가 있으면 true다.
//        System.out.println(flag2 | flag2);
//        System.out.println(flag1 | flag1);
//        System.out.println(!flag1); // ! not는 부정이라는 의미 => 해당 조건을 반대로

//        ***********************논리 연산자 조합********************** (&&, ||)
//        && => 선 조건이 true일 때만 후조건을 실행하며 선조건이 false이면 후조건을 실행하지 않는다.
//        || => 선 조건이 true이면 후조건을 실행하지 않으며 선조건이 false일 때만 후조건을 실행한다.
//        int a = 10;
//        int b = 20;
//        System.out.println(b > a && a > 5);
//        System.out.println(b < a || b > 10);

//        **********************삼항 연산자***************************
//        int x = 5;
//        int y = 3;
//        이라고 했을 때
//        삼항 연산자의 생김새는 : (조건) ? 참일 때 결과값 : 거짓일 때 결과 값
//        x와 y 가있는데 둘중에 더큰 숫자를 출력하고 싶다면 조건을 걸어야 한다.
//        int max = (x > y) ? x : y; //그럼 둘중에 더 큰숫자가 max로 들어가게 된다.
//        System.out.println(max);
//        int min = (x < y) ? x : y; //x가 y보다 작냐고 물어봤을때 거짓이면 y가 더 작다는 소리니까 min에 대입을 하게 된다.
//        System.out.println(min);
//        긴 코드를 짧게 줄여줄 수 있다.

//        y = 5; //y를 5로 바꿔보고
//        boolean isSame = (x == y) ? true : false; //같으면 true가 isSame에 들어간다.
//        System.out.println(isSame);

//        String same = (x != y) ? "다름" : "같음"; //이렇게 표현도 가능하다.


//        height라는 int 변수를 선언하고 키가 120이상인 경우 탑승가능하도록 하는 삼항연산자를사용하고
//        가능하면 탑승가능을 출력하고 불가능하면 "탑승 불가능"을 출력해보자.
//        int height = 130;
//        int y = 120;
//        String same = (height > y) ? "탑승가능" : "탑승 불가능";
//        System.out.println(same);

//        int height = 140;
//        String result = height >= 120 ? "탑승 가능" : "탑승 불가능";
//        System.out.println(result);


            //홀 짝 맞추기 해당숫자가 짝수면 짝수 출력 홀수면 홀수 출력
//            int num = 1;
//            String result = (num ) ? "짝수" : "홀수";
//         System.out.println(result);
//            int num = 2;
//            String result2 = num % 2 == 0 ? "짝수" : "홀수";
//        System.out.println(result2);

        //점수가 0에서 100까지 주어질 때 90이상A 80이상 B 70이상 C 나머지 D
            int score = 78;
            String result3 = score >= 90 ? "A" : score >= 80 ? "B" : score >= 70 ? "C" : "D";
            System.out.println(result3);
        //삼항 연산자를 여러개 쓸 바에는 가독성이 떨어지기 때문에 조건문을 쓰는게 낫다.


    }
}
