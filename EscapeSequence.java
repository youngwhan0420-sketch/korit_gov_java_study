package _06_String;

public class EscapeSequence {
    public static void main(String[] args) {
        //특수 문자, 이스케이프 문자
        //종류 (\n, \t, \\, \", \')
//        //손흥민의 팀은 "LA FC" 이다 로 출력하고 싶어서
//        System.out.println("손흥민의 팀은 \"LA FC\"이다");
//
//        // \'
//        char c = 'A';
//        // c = ''';
//        c = '\'';
//        System.out.println(c);
//


        //문제 처음부터 1까지만 출력하기
        String id = "990226-1234564";
        System.out.println(id.substring(0, 8));
        System.out.println(id.substring(0, id.indexOf("-") +2));













    }
}
