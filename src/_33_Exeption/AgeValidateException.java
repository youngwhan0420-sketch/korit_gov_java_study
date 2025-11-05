package _33_Exeption;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AgeValidateException {
    public static void main(String[] args) {
        //나이를 입력받고 검증함수를 통해 확인하고
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("나이를 입력하세요: ");
            int age = scanner.nextInt();
            validateAge(age); //예외 터지는이유는 내가 설정해둔 범위가 아니라서
            System.out.println("정상적인 나이입니다.: " + age);
        } catch (InputMismatchException e) {
            System.out.println("숫자x 정수입력하세요.");
        } catch (IllegalArgumentException e) {
            System.out.println("예외 발생: " + e.getMessage()); //밑에서 설정해둔 메시지 뜬다.
        } finally {
            System.out.println("검증 종료");
        }

        //나이를 입력받을 떄 nextInt로 받게 될텐데 문자열을 넣게 됐을떄의 예외처리도 함께
        //=> 숫자가 아닙니다. 정수를 입력해주세요.출력
        //검증 함수에서 예외 발생시 "예외 발생: **에러메시지**"출력
        //마지막은 예외 발생 여부 상관없이 "검증 종료" 출력
    }

    public static void validateAge(int age) {
        if (age <= 0 || age >= 150) {
            throw new IllegalArgumentException("유효하지 않은 나이 입니다. (입력값: " + age + ")");
        }
    }
}