package _33_Exeption;
class LoginFailedException extends Exception { //2. 상속받아 예외클래스 생성
    public LoginFailedException(String message) {
        super(message);
    }
}//1. 클래스로 정의
public class Exception02 { //1. 아이디 비밀번호를 입력헀는때 안맞으면 예외가 발생하도록 코딩
    public static void login(String id, String password) throws LoginFailedException { //5. 로그인 메소드에서 둘장 하나라도 일치 안하면 쓰로우 뉴를 하는데 예외처리는 해주지 않아 throws를 넣어줬다.
        //이뜻은 로그인 메소드 내에서 예외가 발생하면 여기서 처리하지않고 호출한쪽에서 처리하라고 하는거임 트라이가 호출지점임
        String correctId = "admin";
        String correctPassword = "1q2w3e4r";

        //3. 입력한 아이디와 비밀번호가 맞는지 확인해서 통과시키기
        if (!id.equals(correctId) || !password.equals(correctPassword)) {
            throw new LoginFailedException("ID 또는 PW가 틀렸습니다."); //4. 원래 트라이에 널어야 하는데 여기서는 throws를 써준다
        }

    }

    public static void main(String[] args) {
        String inputId = "admin";
        String inputPassword = "1234qwer";
        try {
            login(inputId, inputPassword); //트라이가없었으면 예외가 뜬다. 여기서 호출헀으면 이거에 대한 예외처리를 해줘야하는 상황이다.
        } catch (LoginFailedException e) {
            System.out.println("로그인 실패: " + e.getMessage());
        } finally {
            System.out.println("프로그램 정상 종료");
        }
    }
}
