package _08_if;

public class if01 {
    public static void main(String[] args) {
        //조건문
        /*if (조건) {
        * 해당 조건이 참일 떄 실행될 코드
        * } else {
        *       해당 조건이 거짓일 때 사용
        * */
        int height = 140;
        // 키가 120이상이면 탑승 가능 출력했을 때
        if (height >= 120) {
            System.out.println("탑승 가능");
        }  else {
            System.out.println("탑승 불가능");
        }
        //삼항 연산자로 쓰면
        // String result = height >= 120 ? "탑승 가능" : "탑승 불가능";

        //키가 120 이상이면서 어린이인 경우만 탑승 가능
        boolean isKid = true;
        if (height >= 120 && isKid) {
            System.out.println("탑승 가능");
        } else {
            System.out.println("탑승 불가능");
        }
        //키가 120 이상이거나 어린이인 경우 탑승 가능
        if (height >= 120 || isKid) {
            System.out.println("탑승 가능");
        } else {
            System.out.println("탑승 불가능");
        }
        //1. 3의 배수인지 판단
        int num = 12;
        // 3의 배수이면 3의 배수입니다. 출력




        //2. 절댓값 출력
        int num2 = -12;
        //절댓값을 출력하시오.





        //3. 최댓값 출력
        int num3 = 12;
        int num4 = 8;
        //최댓값을 출력하시오.






        // 아이디 비밀번호 확인
        String userId = "myid1234";
        String userPw = "qwer1234";
        // 사용자에게 아이디 비밀번호를 입력받아 일치하면
        // 로그인 확인 출력
        // 아이디가 틀리면 아이디가 틀렸습니다.
        // 비밀번호가 틀리면 비밀번호가 틀렸습니다. 출력







    }
}
