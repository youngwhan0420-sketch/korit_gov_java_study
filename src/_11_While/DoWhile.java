package _11_While;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        //반복문 - Do While
        //일단 한번 실행 후 조건 검사
        //=> 조건에 상관없이 무조건 최초 1회는 실행
        //while은 조건 검사 후 실행

        /*
         * do {
         *   반복할 코드 -- 최초 한번은 실행
         * } while (조건);
         * */
        int i = 10;
        do {
            System.out.println(i);
            i++;
        } while (i <= 5); // 11이니까 false라서 반복 종료 그래서 10출력되고 끝난다.

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("=== 메뉴 ===");
            System.out.println("1. 주문하기");
            System.out.println("2. 취소하기");
            System.out.println("0. 종료");
            System.out.println("선택: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("주문을 합니다.");
                    break;
                case 2:
                    System.out.println("취소합니다.");
                    break;
                case 0: //0을 누르면 종료라 했으니까 case 0으로 해준다.
                    System.out.println("종료합니다.");
                    break;
                default:
                    System.out.println("올바른 번호를 선택하시오.");
            }
        } while (choice != 0); //선택한 숫자가 0이 아니면 계속 반복 0이면 반복 끝이라는 코드

        /* 문제 1
         * 1 부터 n까지 합 (do - while)
         * */
        System.out.println("n: ");
        int n = scanner.nextInt();
        i = 1;
        int sum = 0;
        do {
            sum += i;
            i++;
        } while (i <= n);
        System.out.println("1~" + n + "까지의 총합: " + sum);

        /* 문제 2
         * 숫자 맞추기 게임: 숫자를 입력받아서 정답을 맞추기
         * 업 다운 출력, 시도한 횟수를 나중에 정답 맞췄을 때 같이 출력*/
        int answer = (int) (Math.random() * 100) + 1;//0이 나올 수있어서 +1해준다.
        //Math.random()이게 0.0 ~ 1.0의 랜덤 소수 하나 뽑는데 100을 곱해주니 0 ~ 100미만의 소수로 된다.
        //100미만이니 99까지니까 +1 해줘서 1 ~ 100까지 완성
        int tries = 0; // 몇번 시도했는지 0으로 시작
        int guess; // 내가 입력할 숫자가 들어갈 상자
        do {
            System.out.println("숫자(1 ~ 100)입력: ");
            guess = scanner.nextInt();
            tries++;

            if (guess < answer) { // 내가 선택한 숫자가 정답보다 작으면 UP출력
                System.out.println("UP");
            } else if (guess > answer) { // 내가 선택한 숫자가 정답보다 클 경우 DOWN출력
                System.out.println("DOWN");
            }
        } while (guess != answer); //내가 입력한 숫자와 답이 다르면 위에있는 코드를 계속 실행하라는 뜻
        //같으면 이 코드는 거짓이 되니 반복 그만하고 빠져나와서 밑에 실행
        System.out.println("정답! 시도 횟수:" + tries);
    }
}