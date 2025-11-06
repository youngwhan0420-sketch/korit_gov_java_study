package _34_Lambda.StringProcessor;

import java.util.Scanner;

public class StringProcessorMain { //2. 정적 메소드 만들기
    public static String excute(String input, StringProcessor processor) { //2.
        return processor.process(input);//3.

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//4.
        //5. 람다식 구현 해준다.
        StringProcessor toUpper = s -> s.toUpperCase(); //모두 대문자로
        StringProcessor toLower = s -> s.toLowerCase(); //모두 소문자로
//        StringProcessor addPrefix = s -> ">>" + s;
        //StringProcessor addPrefix = s -> new StringBuilder(">>").uppend(s).toString(); //접두사로 >> 붙이기
        StringProcessor reverse = s -> new StringBuilder(s).reverse().toString(); //문자열 거꾸로 뒤집기

        String testString = scanner.nextLine();

        System.out.println("원본 문자열: " + testString);
        System.out.println("대문자 변환: " + excute(testString, toUpper));
        System.out.println("소문자 변환: " + excute(testString, toLower));
        //System.out.println("접두가 추가: " + excute(testString, addPrefix));
        System.out.println("뒤집기: " + excute(testString, reverse));


    }
}
