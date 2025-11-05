//package _32_LayeredArchitecture2;
//
//import _32_LayeredArchitecture2.dto.SignupReqDto;
//import _32_LayeredArchitecture2.service.SignupService;
//
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        SignupService signupService = SignupService.getInstance();
//        Scanner scanner = new Scanner(System.in);
//        while (true) {
//            System.out.println("[회원관리 시스템]");
//            System.out.println("1. 회원가입");
//            System.out.println("2. 로그인");
//            System.out.println("3. 가입된 회원 전체 조회");
//            System.out.println("q. 종료");
//            System.out.print(" >> ");
//            String selectedMenu = scanner.nextLine();
//
//            if ("q".equalsIgnoreCase(selectedMenu)) {
//                System.out.println("프로그램 종료 중...");
//                break;
//            } else if ("1".equals(selectedMenu)) {
//                System.out.println("[ 회원가입 ]");
//                SignupReqDto signupReqDto = new SignupReqDto();
//                while (true) {
//                    System.out.print("Username: ");
//                    signupReqDto.setUsername(scanner.nextLine());
//                    //아이디 중복확인
//                    if (signupService.isValidDuplicatedUsername(signupReqDto.getUsername())) {
//                        break;
//                    }
//                    System.out.println("이미 사용중인 Username입니다.");
//                }
//                while (true) {
//                    System.out.print("비밀번호: ");
//                    signupReqDto.setPassword(scanner.nextLine());
//                    //비밀번호 유효성 체크
//                    if (signupService.isValidPassword(signupReqDto.getPassword())) {
//                        break;
//                    }
//                    System.out.println("비밀번호는 공백일 수 없습니다. 다시 입력하세요.");
//                }
//                //비밀번호와 비밀번호 확인 같은지 체크
//                while (true) {
//                    System.out.print("비밀번호 확인: ");
//                    signupReqDto.setConfirmPassword(scanner.nextLine());
//                    if (signupService.isValidConfirmPassword(signupReqDto.getPassword(), signupReqDto.getConfirmPassword())) {
//                        break;
//                    }
//                    System.out.println("비밀번호가 일치하지 않습니다. 다시 입력하세요.");
//                }
//
//                signupService.signup(signupReqDto);
//                System.out.println("[[ 회원가입 완료 ]]");
//
//            } else if ("2".equals(selectedMenu)) {
//                System.out.println("[ 로그인 ]");
//            } else if ("3".equals(selectedMenu)) {
//                System.out.println("[ 가입된 회원 전체 조회 ]");
//            } else {
//                System.out.println("메뉴를 다시 선택해주세요.");
//            }
//        }
//
//        System.out.println("프로그램 종료 완료");
//    }
//}
//package _32_LayeredArchitecture2;
//
//import _32_LayeredArchitecture2.dto.SignupReqDto;
//import _32_LayeredArchitecture2.service.SignupService;
//
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        SignupService signupService = SignupService.getInstance();
//        Scanner scanner = new Scanner(System.in);
//        while (true) {
//            System.out.println("[회원관리 시스템]");
//            System.out.println("1. 회원가입");
//            System.out.println("2. 로그인");
//            System.out.println("3. 가입된 회원 전체 조회");
//            System.out.println("q. 종료");
//            System.out.print(" >> ");
//            String selectedMenu = scanner.nextLine();
//
//            if ("q".equalsIgnoreCase(selectedMenu)) {
//                System.out.println("프로그램 종료 중...");
//                break;
//            } else if ("1".equals(selectedMenu)) {
//                System.out.println("[ 회원가입 ]");
//                SignupReqDto signupReqDto = new SignupReqDto();
//                while (true) {
//                    System.out.print("Username: ");
//                    signupReqDto.setUsername(scanner.nextLine());
//                    //아이디 중복확인
//                    if (signupService.isValidDuplicatedUsername(signupReqDto.getUsername())) {
//                        break;
//                    }
//                    System.out.println("이미 사용중인 Username입니다.");
//                }
//                while (true) {
//                    System.out.print("비밀번호: ");
//                    signupReqDto.setPassword(scanner.nextLine());
//                    //비밀번호 유효성 체크
//                    if (signupService.isValidPassword(signupReqDto.getPassword())) {
//                        break;
//                    }
//                    System.out.println("비밀번호는 공백일 수 없습니다. 다시 입력하세요.");
//                }
//                //비밀번호와 비밀번호 확인 같은지 체크
//                while (true) {
//                    System.out.print("비밀번호 확인: ");
//                    signupReqDto.setConfirmPassword(scanner.nextLine());
//                    if (signupService.isValidConfirmPassword(signupReqDto.getPassword(), signupReqDto.getConfirmPassword())){
//                        break;
//                    }
//                    System.out.println("비밀번호가 일치하지 않습니다. 다시 입력하세요.");
//                }
//
//                signupService.signup(signupReqDto);
//                System.out.println("[[ 회원가입 완료 ]]");
//
//            } else if ("2".equals(selectedMenu)) {
//                System.out.println("[ 로그인 ]");
//                //객체 생성하고
//                //아이디 먼저 입력받기
//                //입력과 동시에 셋을 하는데 이때 만약에
//                //사인인 서비스 가져올꺼니 14번줄 추가해준다. 객체받아와서 이제 사인인서비스 사용가능
//                //이렇게 사용한다.  공백이 아니다 하면
//                //이렇게 끝내고
//                //공백이면 다시입력하세요뜨게 한다.
//
//                //비밀번호 입력하는걸 만들어준다.
//                //위랑 똑같이
//
//                //유효성 검사완료후 사인인 호출
//                //이렇게 호출한다.
//
//            } else if ("3".equals(selectedMenu)) {
//                System.out.println("[ 가입된 회원 전체 조회 ]");
            //메인으로 와서 객체.투스트링 해주면 오버라이딩한 투스트링이 나온다.
//            } else {
//                System.out.println("메뉴를 다시 선택해주세요.");
//            }
//        }
//
//        System.out.println("프로그램 종료 완료");
//    }
//}