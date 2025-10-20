package _11_While;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        //반복문 - While
        //조건이 참일 경우 계속 반복
        //for과의 차이는 for문은 횟수 중심, while문은 조건 중심
        /*
         * while (조건) {  boolean자료형이 나오는 조건
         *   반복할 코드 // 참이면 여기 계속 반복한다
         * }
         * while의 주의할 점 // 조건을 변경해주는 코드가 있어야 한다.
         * 반복할 코드 내에는 조건을 변경해주는 코드가 있어야 한다.
         *
         *
         * */
        //1 ~ 5까지 출력
//        int i = 1;
//        while (i <= 5) { //5가될때 까지 계속 출력할것인데 조건을 변경해줄 코드가 없어서 1이 계속 출력된다.
//            System.out.println(i);
//            i++; // 해주면 된다. 조건을 변경하기 위한 코드 필요
//        }
//        i = 10;
//        while (i >= 1) {
//            System.out.println(i);
//            i--; //조건을 변경하기 위한 코드가 필요
//        }
        //짝수만 출력하겠다  (1 ~ 10)
//        int i = 1;
//        while (i <= 10) {
//            if (i % 2 == 0) {
//                System.out.println(i);
//            }
//            i++;
//        }
//        boolean flag = true;
        Scanner scanner = new Scanner(System.in);
//        //점수를 입력한다. (0 ~ 100)
//        while (flag) {
//            int score = scanner.nextInt(); //입력을 받는다.
//            if (0 <= score && score <= 100) {
//                System.out.println("점수는" + score);
//                break; // flag = false; 로 바꾸면 안되는 이유  잘 입력을 해도 다시 입력하세요가 나오기 때문에 break;나
//            } else { //이렇게 써주면 flag써줄 수있다.
//                System.out.println("다시 입력하세요.");
//            }
//        }

        int menu;
        while (true) {
            System.out.println("메뉴를 선택하세요.");
            System.out.println("1.주문하기");
            System.out.println("2.취소하기");
            System.out.println("3.재주문하기");
            System.out.print("메뉴를 고르세요 >>>"); //개행이 일어나지 않아서 괄호옆에 일어날 수 있도록
            menu = scanner.nextInt();//4,5골랐다면 다시 입력을 받도록 해야해서

//            if (menu != 1 && menu && 2 && menu != 3) {
//                System.out.println("다시 입력해주세요");
//                continue;// 위에 다시 올라가게 continue 써준다.
           // }
            switch (menu) {
                case 1:
                    System.out.println("주문하기 메뉴");
                case 2:
                    System.out.println("취소하기 ");
                    break;
                    case 3:
                        System.out.println("재주문하기");
                    break;
                default:
                    System.out.println("다시입력해주세요");
                    continue;
            }
                break; //while을 멈춘것
        }
        // 문제 => 1부터 100까지 누적합
        //누적합 받아둘 변수







        // 문제 => 1번 부터 100번까지 식당 웨이팅이있는데
        // 이때 1번부터 차례대로 입장 하는데  ==> **번 손님 입장! 출력
        // 10번 손님이 입장할 때 한정메뉴가 솔드아웃
        // 솔드아웃 되었기 때문에 가게 문닫음
        // 마지막엔 영업 종료 출력
        //일단 1번부터 100번까지 반복해야하니
        //솔드아웃이 되는 번호
        /*while을 100이 될때 까지 돌린다.
        * 입장 출력을 해야한다.
        *
        * 만약 10번이 입장하면 한정메뉴 솔드아웃해야한다.
        *
        * 이제 반복될 필요 없어서 break걸어준다.
        *
        *
        * 증가를 걸어준다.
        *
        * while문이 끝나고 나서 영업종료를 해준다.*/


        // 1번부터 50번까지 웨이팅이있는데
        // 메뉴가 20개 까지만 한정판매 => 솔드아웃 가게 샷다 내림 출력
        // 이때 14번이 노쇼했다. => *번 노쇼 발생! 출력
        // 이것을 while문으로 해서
        // 사실상 21번 손님까지 먹을 수 있다.
        // continue와 break를 둘다 써야 한다.
        /*
        * 50번 까지 웨이팅이니 변수를 잡아두고
        * 노쇼도 잡아둔다.
        * 그다음 while문을 돌려서 50번까지 반복 한다.
        * 노쇼가 있는거는 한정판매 확인전에 먼저 확인 해야한다.
        *
        *
        * for문이였으면 그냥 continue해도 넘어가는데 whoel은 일일히해줘야하기 때문에 i++해주고
        *
        * 일단 20개까지 한정판매이기 때문에 솔드아웃되면
        * 한정판매 뜨게 한다.
        * 멈춘다.
        *
        *
        * */


    }
}
//while유효성
