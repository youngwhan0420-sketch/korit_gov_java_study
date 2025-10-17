package _09_SwitchCase;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        //Switch는 break를 만날때 까지 계속 실행된다.

        //ranking이 1등이다 = 전액 장학금 출력
        //2등이다 = 반액 장학금 출력
        //3 =소정의 상금
        //그 이하 = 박수쳐줌
//        int ranking = 2;
//        if (ranking == 1) {
//            System.out.println("전액 장학금");
//        } else if (ranking == 2) {
//            System.out.println("반액 장학금");
//        } else if (ranking == 3) {
//            System.out.println("소정의 상금");
//        } else {
//            System.out.println("박수");
//        }
//        // 스위치로 바꿔주기
//        switch (ranking) {
//            case 1:
//                System.out.println("전액 장학금");
//                break; //1등일 때 멈추고 싶을 경우
//            case 2:
//                System.out.println("반액 장학금");
//                break;
//            case 3:
//                System.out.println("소정의 상금");
//                break;
//            defalut: //모든 case를 만족하지 않을 때 여기를
//            System.out.println("박수 쳐줌");
//        }
        //2,3 등 둘다 반액 장학금이라 했을 떄 이렇게 해주면 된다.
//        case 2: //2에서 멈추지 않고 바로 3으로 가서 출력 후 break.
//        case 3:
//        System.out.println("소정의 상금");
//        break;
//
//        int grade = 1;
//        int price = 7000;
//        //1등급은 10000, 등급이 낮아질수록 -1000
//        //1 - 10000
//        //2 - 9000
//        //3 - 8000
//        switch (grade) { //처음엔 7000원으로 측정 됐으니 price1ㅇ
//            case 1:
//                price += 1000;
//            case 2:
//                price += 1000;
//            case 3:
//                price += 1000;
//                break;
//        }

        //월을 입력받고 (int)
        //3, 4, 5 => Spring 출력
        //6, 7, 8 => Summer
        //9, 10, 11 => Autumn
        //12, 1, 2 => Winter 출력


//        Scanner scanner = new Scanner(System.in);
//        int month = scanner.nextInt();
//            switch (month) {
//            case 3: case 4: case 5:
//                    System.out.println("Spring");
//                    break;
//                case 6: case 7: case 8:
//                    System.out.println("Summer");
//                    break;
//                case 9: case 10: case 11:
//                    System.out.println("Autumn");
//                    break;
//                case 12: case 1: case 2:
//                    System.out.println("Winter");
//                    break;
//                default:
//                    System.out.println("유효하지 않는 월 입니다.");
//            }

            //숫자 a를 입력받고
            //연산자 기호를 입력받고 (받을 수 있는 기호는 +, -, *, %) => 유효한 기호가 아닙니다 출력
            //숫자 b를 입력받는다.
            //switch case문을 이용해서 연산결과를 출력하시오. (기호를 기준으로 잡아야 한다.)
            Scanner scanner = new Scanner(System.in);
            int a = scanner.nextInt();
            scanner.nextLine(); // 개행을 버려주는 작업을 해줘야 한다.
            String oper = scanner.nextLine();
            int b = scanner.nextInt();

            System.out.println("a => " + a);
            System.out.println("oper = > " + oper);
            System.out.println("b => " + b);

            switch (oper) {
                case "+":
                    System.out.println(a + b);
                    break;
                case "-":
                    System.out.println(a - b);
                    break;
                case "*":
                    System.out.println(a * b);
                    break;
                case "/":
                    System.out.println(a / b);
                    break;
                default:
                    System.out.println("유효한 기호가 아닙니다.");
            }































    }
}
