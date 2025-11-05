package _33_Exeption;

import static _33_Exeption.AgeRestrictionException.SignupException.signup;

/*
* AgeRestrictionException
* => 나이제한에 대한 예외 클래스 */
class AgeRestrictionException extends Exception { //1. 예외 클래스 만들어주기
    public AgeRestrictionException (String message) { //2.
        super(message); //3.
}
public class SignupException {
    public static void signup(String username, int age) throws AgeRestrictionException { //여기서 예외처리를 하지 않는다. 사인업 호출한곳에서 처리하겠다 .
        if (age < 14) {
            throw  new AgeRestrictionException("만 14세 미만은 가입할 수 없습니다.");
        }
        System.out.println(username + "님 가입을 환영합니다.");
    }
}

    public static void main(String[] args) {
        String username = "김영환";
        int intage = 89;
        try {
            signup(username, intage);
        } catch (AgeRestrictionException e) { //예외처리 해준다.
             System.out.println("회원가입 실패: " + e.getMessage());
        } finally {
            System.out.println("회원가입 처리 종료"); //잘되면 환영합니다 떠야하니 31줄에
        }
    }

}
/*
 * signup메소드(String username, int age)
 * => 가입조건이 만 14세 이상
 * 이 조건에 만족하지 않으면 AgeRestrictionException발생
 * 해당 예외는 호출한 곳에서 처리
 * 만약 예외가 발생하지 않는다면 "Username님, 가입을 축하합니다." 출력
 *
 * main에서 예외 처리를 해주면 됩니다.
 * 예외발생시 "회원가입 실패: 이유" 출력
 * 예외 유무 상관없이 "회원가입 처리종료" 출력*/