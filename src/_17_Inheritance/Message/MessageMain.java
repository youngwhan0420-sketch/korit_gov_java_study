package _17_Inheritance.Message;
/*
 * Message라는 클래스 생성
 * 속성으로는 String text
 * Allargs 생성자
 * 메소드 String 반환 makePreFix() => 같은 패키지 또는 자식 클래스에서만 접근 가능하도록
 *  ===>return "[MSG] ";
 * 메소드 String 반환 format() => 모두 접근 가능
 *  ===> return 접두사로 "[MSG] "가 붙고 뒤에는 메세지 텍스트가 붙어서 리턴
 * 메소드 void print() => 모두 접근 가능
 *  ===> format()을 호출한 값 출력
 *
 * 클래스 SimpleMessage => Message 상속
 * 부모필드 생성자사용해서 객체 생성하도록
 * 메소드 makePreFix() => 같은 패키지 또는 자식 클래스에서만 접근 가능하도록
 * ===> "[SIMPLE] " 반환하도록 재정의
 * 메소드 format() => 모두 접근 가능
 * ===> return 접두사로 "[SIMPLE] "가 붙고 중간에는 "내용: ", 뒤에는 메세지 텍스트가 붙어서 리턴
 * ex) [SIMPLE] 내용: 가나다라마바사
 *
 * 클래스 FancyMessage => Message 상속
 * * 부모필드 생성자사용해서 객체 생성하도록
 * 메소드 makePreFix() => 같은 패키지 또는 자식 클래스에서만 접근 가능하도록
 * ===> "[FANCY] " 반환하도록 재정의
 * 메소드 format() => 모두 접근 가능
 * ===> return 접두사로 "[FANCY] "가 붙고 중간에는 "★ ",
 * 뒤에는 메세지 텍스트가 붙고 끝에 " ★"로 끝남
 * ex) [FANCY] ★ 가나다라마바사 ★
 * */
public class MessageMain {
    public static void main(String[] args) {
        Message msg1 = new Message("ㅇㄹ");
        msg1.print();

        SimpleMessage msg2 = new SimpleMessage("ㄹㅇ");
        msg2.print();
        //simpleMessage에 프린트가 없어서 부모클래스에 프린트가지고 있어서 부모의 프린트를 출력

        FancyMessage msg3 = new FancyMessage("fdf");
        msg3.print();

    }
}
