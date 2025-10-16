package _08_if;

import java.util.Scanner;

public class if01 {
    public static void main(String[] args) {
        //조건문
        /*if (조건) {
        * 해당 조건이 참일 떄 실행될 코드
        * } else {
//        *       해당 조건이 거짓일 때 사용
//        * */
//        int height = 140;
//        // 키가 120이상이면 탑승 가능 출력했을 때
//        if (height >= 120) {
//            System.out.println("탑승 가능");
//        }  else {
//            System.out.println("탑승 불가능");
//        }
//        //삼항 연산자로 쓰면
//        // String result = height >= 120 ? "탑승 가능" : "탑승 불가능";
//
//        //키가 120 이상이면서 어린이인 경우만 탑승 가능
//        boolean isKid = true;
//        if (height >= 120 && isKid) {
//            System.out.println("탑승 가능");
//        } else {
//            System.out.println("탑승 불가능");
//        }
//        //키가 120 이상이거나 어린이인 경우 탑승 가능
//        if (height >= 120 || isKid) {
//            System.out.println("탑승 가능");
//        } else {
//            System.out.println("탑승 불가능");
//        }
//        //1. 3의 배수인지 판단
//        int num = 12;
//        // 3의 배수이면 3의 배수입니다. 출력
//        //일단 3의 배수니까 어떤 조건을 먼저 걸어야 판단을할지 생각해보기
//        if (num % 3 == 0) {
//            //조건이 참일 때 어떤 코드가 실행되야 하는지
//            System.out.println("3의 배수입니다.");
//        }
//
//        //2. 절댓값 출력
//        int num2 = -12;
//        //절댓값을 출력하시오.
//        //절댓값은 부호를 빼버리자. 일단 조건을 먼저 생각 하기
//        if (num2 >= 0) {//이면 그대로 출력해준다.
//            System.out.println(num2);
//        } else {
//            //음수인 상황에는 앞에 -를 붙혀서 +로 만들어준다.
//            System.out.println(-num2);
//        }
//
//        //3. 최댓값 출력
//        int num3 = 12;
//        int num4 = 8;
//        //최댓값을 출력하시오.
//        if (num3 > num4) {
//            System.out.println(num3); //num3가 최댓값인 경우 num4보다 클때 얘가 최댓값이 된다.
//        }   else {
//            System.out.println(num4);
//        }
//



        // 아이디 비밀번호 확인
        String userId = "myid1234";
        String userPw = "qwer1234";
        // 사용자에게 아이디 비밀번호를 입력받아 일치하면
        // 로그인 확인 출력
        // 아이디가 틀리면 아이디가 틀렸습니다.
        // 비밀번호가 틀리면 비밀번호가 틀렸습니다. 출력

        //일단 입력을 받아야하니
        Scanner scanner = new Scanner(System.in);
        System.out.println("아이디 >>>");
        String inputId = scanner.nextLine();
        System.out.println("비밀번호 >>>");
        String inputPw = scanner.nextLine();
        //여기 까지가 입력받는거 까지

        //74. 75행이 있어서 중첩해서 써야한다.
        if (userId.equals(inputId)) { //유저 아이디가 일치할 때
            if (userPw.equals(inputPw)) {// 비민번호가 맞을때    //참이면 여기로 이 조건도 참이면 로그인 된거니
                System.out.println("로그인 확인"); //로그인 확인을 출력한다.
            } else {
                //비밀번호가 틀릴 때
                System.out.println("비밀번호가 틀렸습니다.");
            }
        } else {
            //아이디가 틀렸을 때
            System.out.println("아이디가 틀렸습니다.");
        }
    //둘다 틀렸는데 아이디가 틀렸습니다만 뜨는 이유는 id를 먼저 확인하도록 했기 때문에 비밀번호를 건너 뛴다.
    }
}
