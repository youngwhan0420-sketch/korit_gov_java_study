package _10_for;

import java.util.Scanner;

public class For {
    public static void main(String[] args) {
        //반복문 - for 생김새 = for () {
        /*
         * for (선언; 조건; 증감) {
         *   반복될 코드
         *
         * }*/
//        for (int i = 0; i < 10; i++) {
//            System.out.println("안녕" + i);
//        }
//
//        for (int i = 0; i <= 50; i++) {
//           if (i % 2 == 0) {
//               System.out.println(i); //짝수만 출력해보자 그럼 안에서 조건문을 사용한다.
//           }
//            for (int i = 10; i > 0; i--) {
//                System.out.println(i);
//            }

        //문제
        //1 ~ 100까지 다 더한 총합을 구하시오.
//        int sum = 0;
//        for (int i = 0; i < 101; i++) {
//            System.out.println(i);
//        }
//        int sum = 0;
//        for (int i = 1; i <= 100; i++) {
//            System.out.println(i);
//            sum += i;
//            System.out.println("sum : " + sum);
//        }
//        System.out.println(sum);

        // 문제
        //1 ~ 100까지 중에 짝수만 더한 총합을 구하시오.
//        int sum = 0;
//        for (int i = 1; i <= 100; i++) {
//          if (i % 2 == 0) {     //i에서 2를 나눴을 때 나머지가 0이 안되니 1이 짝수가 아니라 실행 안되고 i에서 2를 넣고 이런식으로 sum에 더해준다.
//              sum += i;
//          }
//        }
//        System.out.println(sum);


        //문제 구구단 출력하기
        //특정 단을 입력받아서 1부터 9까지 구구단 출력
//        Scanner scanner = new Scanner(System.in);
//        int dan = scanner.nextInt();
//        for (int i = 1; i <= 9; i++) {
//            System.out.println(dan + "X" + i + "=" + (dan * i));
//        }
        //구구단 전체 출력하기
//        for (int dan = 1; dan <= 9; dan++) {
//            for (int i = 1; i <= 9; i++) {
//                System.out.println(dan + "X" + i + "=" + (dan * i));
//
//              }
//            }
        /*
         *   *
         *   **
         *   ***
         *   ****
         *   ***** 출력하기
         *
         *   *****
         *   ****
         *   ***
         *   **
         *   *  출력하기
         * */
        //1.
//        for (int i = 0; i <= 5; i++) {
//            for (int j = 1; j <= i; i++) {
//                System.out.println("*");
//            }
//            System.out.println(); //이거 때문에 개행이 일어난다.
//
//        }

        //2.
//        for (int i = 5; i >= 1; i--) {
//            for (int j = 1; j <= i; j++) {
//                System.out.println("*");
//            }
//            System.out.println();
//        }
        //break, continue
//        for (int i = 0; i <= 10; i++) {
//            if (i == 5) {   // 5인지 아닌지 검사하고 아니면 출력 5가됐을 때 브레이크를 걸고 더 올라가지 않고 출력한다
//                break;  // continue를 넣으면 5가 빠지고 탈출하지 않고 올라가서 실행된다.
//            }
//            System.out.println(i);
//        }


        //1 ~ 50 까지 수 중에서 3의 배수 빼고 출력하기 (단, 3의 배수는 " "띄어 쓰기 한칸 출력으로 대체)
//        for (int i = 1; i <= 50; i++) {
//            if (i % 3 == 0) {
//                System.out.println(" ");
//                continue;
//            }
//            System.out.println(i);
//        }
        //1부터 계속 합계를 구하되 합계가 200이 넘어가면 스탑
        //마지막은 최종 합과 마지막으로 더한 수를 출력
//        int sum = 0;
//        int last = 0;
//        for (int i = 1; ; i++) {     //끝이 없으니 비워줘도 된다.
//            sum += i;
//            if (sum > 200) {
//                System.out.println("마지막으로 더한 수: " + i); //
//                System.out.println("최종합계: " + sum);
//                break;
//            }
//          1부터 100까지 수 중에서 3의 배수와 5의 배수의 갯수를 각각 출력하시오.
//          for (int i = 1; i <=100; i++) {
//            sum += i;
//            mul *= sum * 3;
//            System.out.println(mul);
//            continue;
//            }
//        }
//        int cnt3 = 0;
//        int cnt5 = 0;//갯수를 저장할 변수
//        for (int i = 1; i < 101; i++) {
//            if (i % 3 == 0) {
//                cnt3++;
//            }
//            if (i % 5 == 0) {
//                cnt5++;
//            }
//        }
//        System.out.println(cnt3);
//        System.out.println(cnt5);
//
//
//
//
//
//        정수를 5개 입력받고 입력받은 수 중 가장 큰 값 출력
//        범위는 1에서 100사이 만약 1에서 100사이가 아니라면
//        범위를 벗어났습니다. 출력 후 스탑
         // Scanner scanner = new Scanner(System.in);
//        int num1 = scanner.nextInt();
//        for ()
//        for (int i = 1; i <= 100; i++) {
//            break;
//
//        }
//    }
//        int max = 0;
//        for (int i = 0; i < 5; i++) {
//            int inputNum = scanner.nextInt();
//            if (inputNUm > 100 || inputNUm < 1) {
//                if (max < inputNum) { //만약 inputNum이 더크면
//                    max = inputNum;       //max보다 inputNUm이 더크면
//                }
//            }
//        }
//        System.out.println("최댓값 :" + max);


        //팩토리얼 구하기
        //숫자를 입력받아 팩토리얼 구하기
        //단 1 ~ 10까지만 입력받기
//        Scanner scanner = new Scanner(System.in);
//        int num = scanner.nextInt(); //숫자를 입력 받자
//        int fact = 1; //0이면 안된다.
//        for (int i = 0; i < num; i++) {//입력한 만큼 곱해줄꺼니 num을 넣어준다
//            fact *= i;
//        }
//        System.out.println(fact);





         //1 ~ 50 까지 반복하는데 3 6 9 일 때는 박수 출력
         //5일 때는 으악 출력
        for (int i = 1; i <= 50; i++) {
            boolean flag = true;

            if (i % 10 == 3 || i % 10 == 6 || i % 10 == 9) {
                System.out.println("박수"); //369131619 일때는 박수를 출력하기로 했으니
                flag = false;
            }   else if (i % 10 == 5) {
                System.out.println("으악");
                flag = false;
            }
            if (i >= 30 && i < 40) {
                System.out.println("박수");
                flag = false;
            }
            if (i == 50){
                System.out.println("으악");
                flag = false;
            }
            if (flag) {
                System.out.println(i);
            }
        }
    }
}


