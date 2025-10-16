package _08_if;

import java.util.Scanner;

public class if02 {
    public static void main(String[] args) {
        //else if
        /*
        * if (조건) {
        *  조건1이 참 일때        맞으면 여기를 실행 틀리면 else if
        * } else if (조건2) {
        *  조건2가 참 일때
        * } else {
        *   조건 1과 조건2가 모두 거짓일 때
        * }
        * 조건1이 참(앞의 조건이 참이면) 이면 8번이 실행되는데 뒤에 조건들은 실행하지않고 끝난다.
        *
        * */

//        int avgScore = 50;
//        /*
//        * 90이상 A
//        * 80이상 B
//        * 70이상 C
//        * 나머지 D
//        * */
//        if (avgScore >= 90) {
//            System.out.println("등급: A");
//        } else if (avgScore >= 80) { //위에 조건이 아닐경우 실행
//            System.out.println("등급: B");
//        } else if (avgScore >= 70) { //위에 조건이 아닐 경우 실행
//            System.out.println("등급: C");
//        }  else {
//            System.out.println("등급: D");    //둘다 틀렸을 경우 실행
//        }


        //사분면
        //x, y를 입력받으세요.
        //입력했을 때 몇 사분면에 존재하는지 출력하시오.
  //      Scanner scanner = new Scanner(System.in);
//        int x;
//        int y;
//        System.out.println("x를 입력하세요: ");
//          x = scanner.nextInt();
//
//        scanner.nextLine();
//
//        System.out.println("y를 입력하세요: ");
//        y = scanner.nextInt();
//
//        if (x > 0 & y > 0) {
//            System.out.println("1사분면 입니다.");
//        } else if (x > 0 & y < 0) {
//            System.out.println("4사분면 입니다.");
//        } else if (x < 0 & y > 0) {
//            System.out.println("2사분면 입니다.");
//        } else if (x < 0 & y < 0) {
//            System.out.println("3사분면 입니다.1");
//        } else (x = 0 & y = 0) {
//
//        }
        Scanner scanner = new Scanner (System.in);
        int x;
        int y;
        System.out.println("x를 입력하세요: ");
        x = scanner.nextInt();
        System.out.println("y를 입력하세요: ");
        y = scanner.nextInt();

        if(x > 0 && y > 0) {
            System.out.println("1사분면");
        } else if (x < 0 && y > 0) {
            System.out.println("2사분면");
        } else if (x < 0 && y < 0) {
            System.out.println("3사분면");
        } else {
            System.out.println("4사분면 ");
        }






    }
}
