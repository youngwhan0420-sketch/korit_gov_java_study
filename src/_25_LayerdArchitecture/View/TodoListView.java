//package _25_LayerdArchitecture.View;
//
//import _25_LayerdArchitecture.entity.User;
//import _25_LayerdArchitecture.service.UserService;
//
//import java.util.Scanner;
//
//public class TodoListView {
//    private Scanner scanner;
//    private User principal;
//    private UserService userService;
//
//    public TodoListView() {
//        scanner = new Scanner(System.in);
//        //투두 생성될때 객체서비스 넣어준다.
//    }
//
//    public void homeView() {
//        while (true) {
//            //이메소드가 호출되면 메인메뉴를 띄어주면서 사용자한테 어떤 메뉴를 선택할껀지 반복을 해야하니
//            System.out.println("[Todo List]");
//            System.out.println("1. TodoList");
//            if (principal == null) {
//                System.out.println("2. 회원가입");
//                System.out.println("3. 로그인");
//            } else {
//                System.out.println("2. 로그아웃");
//            }
//            System.out.println("q.프로그램 종료");
//            System.out.print(">>>");
//            String cmd = scanner.nextLine();//사람이 뭘 입력하냐에 따라 틀꺼니까
//
//
//            if ("q".equals(cmd)) { //하면 멈춰버리면 도ㅓㅣ니
//                break;
//            } else if ("1".equals(cmd)) {
//                //TodoList 관리
//            } else if ("2".equals(cmd) && principal == null) { //2번 눌렀는데
//                //회원가입
//            } else if ("2".equals(cmd) && principal != null) {
//                //로그아웃
//            } else if ("3".equals(cmd) && principal == null) {
//                //로그인
//            } else {
//                System.out.println("잘못입력하였습니다.");
//                //각각 메뉴에 따른 메소드를 만든다.
//            }
//        }
//    }
//
//    //회원가입 뷰
//    void signupView() {
//        System.out.println("[ 회원가입 ]");
//        String username = null;
//        while (true) { //와일문 통해서 입력받기
//            System.out.print("username: ");
//            username = scanner.nextLine();
//            //username 중복확인
//        }
//    }
//}
