package _11_While;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        /*반복문 (Do While)
        * 일단 한번 실행 후 조건을 검사 한다. => 조건에 상관없이 무조건 최초 1회는 실행한다는 소리인데
        * while은 조건 검사후 실행이다.
        *
        *
        *
        * 생김새 do {
        *       반복될 코드 (최초 한번은 실행)
        * } while(조건);
        *
        *
        *
        *
        *
        *
        *
        *
        *
        *
        *
        *
        *
        *
        *
        *
        *
        *
        *
        *
        *
        *
        *
        *
        *
        *
        *
        *
        *
        *
        *
        *
        *
        *
        * 0아니면 반복
        *
        * //1.1부터 n 까지 합을 (do - while)
        * 입력받아서 총합을 구해라 먼저 n을 입력받고 do while을 실행
        * */
        Scanner scanner = new Scanner(System.in);
//        System.out.println("n : ");
        int n = scanner.nextInt();
//        int i = 1;
//        int sum = 0;
//        do {
//                sum += i;
//                i++;
//        } while(i <= n);
//        System.out.println("1");
//
        //숫자 맞추기
        int answer = (int) (Math.random() * 100) + 1; //제공된 타입이 더블이라 빨간색이 떠서 int를 타입캐스팅 해준다. 0이 나올 수있어서 +1해준다.
        //숫자를 입력 받아서 정답을 맞추고 시도한 횟수를 나중에 정답 맞췄을 때 같이 출력
        int tries = 0;
        int guess;
        do { //계속 반복해서 숫자 맞추기
            System.out.println(); //추측을 하는 숫자를 입력받기
            guess = scanner.nextInt();
            tries++;

            if (guess < answer) { //guess가 answer보다 작으면 UP출력
                System.out.println("UP");
            } else if (guess > answer) { //guess가 묹ㄷㄱ
                System.out.println("DOWN");
            }
        } while(guess != answer); //같다라는 건 정답을 맞춰서 틀리면 계속 반복하게 만듦 맞추면 밑에 출력하게
        System.out.println("정답! 시도 횟수 : " + tries);










    }
}
