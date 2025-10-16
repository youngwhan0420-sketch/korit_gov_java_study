package _07_Scanner;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {
        //Scanner 입력 받기

        Scanner scanner = new Scanner(System.in);

//        String str1 = scanner.next(); //이렇게 하면 String 문자열 입력 받을 수 있다.
//        String str2 = scanner.next();
//        //next() 는 토큰 단위로 읽는다. 토큰이란 공백문자(띄어쓰기, 탭, 엔터를 의미한다.)
//        System.out.println(str1); //실행하면 원래는 프로세스 종료가 뜨는데 아직 안끝났다 왜냐면 입력을 기다리고 있기 때문에
//        //hello를 치면 11행에 str1에 hello가 들어가고 끝난다.
//        System.out.println("str1: " + str1);
//        System.out.println("str2: " + str2);
    //hello를 쓰고 엔터를 굳이 안쳐도 스페이스, 탭, 누르고 world를 치면  str1에 hello str2 에 world가 들어간다.

        //nextLine()는 엔터 단위로 읽는다.
        String str3 = scanner.nextLine();
        System.out.println("str3: " + str3);
        //중간에 공백이 있더라도 한줄당 한줄로 인식을 받는다.
        //입력에 숫자를 써도 문자열로 인식한다.

        //int 정수 입력 받기
//        int num1 = scanner.nextInt();
//        System.out.println("num1: " + num1);
//        //이렇게 하면 정수를 입력 받을 수 있다.
//        int num2 = scanner.nextInt();
//        System.out.println("num2: " + num2);
//
        int num = scanner.nextInt();
        //scanner.nextLine();
        String str = scanner.nextLine();
        System.out.println("num: " + num + "str: " + str);
        //nextint치고 nextline받을려니까 끝나는 이유는 123누르고 엔터를 누르는 순간 123\n까지 입력을 받게되기 때문에
        //123은 넘에 들어가는데 \n기록이 남으니 nextLine으로 가니까 엔터를 받고 끝내버리기 때문에 결과라 이렇게 나온다.
        //이걸 해결 하는 방법은 중간에 \n를 버려줘야 하니 중간에 scanner.nextLine();를 써서 버려준다.

    }
}
