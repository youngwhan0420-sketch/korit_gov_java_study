package _17_Inheritance.Message;

public class SimpleMessage extends Message { //메시지가 ALl이기 때문에 빨간줄 뜨니 생성자를 만들어 준다.
    SimpleMessage(String text){
        super(text);
    }
    @Override
    protected String makePreFix() { //메소드 makePreFix() => 같은 패키지 또는 자식 클래스에서만 접근 가능하도록
        return "[SIMPLE] "; // "[SIMPLE] " 반환하도록 재정의
    }
    @Override
    public String format() { //메소드 format() => 모두 접근 가능
        return makePreFix() + "내용: " + text; // return 접두사로 "[SIMPLE] "가 붙고 중간에는 "내용: ", 뒤에는 메세지 텍스트가 붙어서 리턴
    }
}
