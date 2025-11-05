//package _32_LayeredArchitecture2.service;
//
//import _32_LayeredArchitecture2.dto.SignupReqDto;
//import _32_LayeredArchitecture2.entity.User;
//import _32_LayeredArchitecture2.repository.UserRepository;
//import _32_LayeredArchitecture2.repository.UserRepositoryImpl2;
//
//public class SignupService { //사인업서비스 객체가 생성될때 겟인스턴스로 생성되는데 생성쇨때 싱글톤 생선되는데
//    //사인업만들때 유저레퍼지토리의 객체도 같이주입되어야 한다. 그래서 생성자막아주기에 넣어뒀ㅈ다 .
//
//    //싱글톤이기 때문에
//    private static SignupService instance;
//    private UserRepository userRepository;
//
//    //생성자 막아주기
//    private SignupService(UserRepository userRepository) { //
//        this.userRepository = userRepository;
//    }
//
//    public static SignupService getInstance() {
//        if (instance == null) {
//            instance = new SignupService(UserRepositoryImpl2.getInstance());//인스턴스해서 객체를 갖와 사인업서비스 생성자
//        } //임플에서는 구현이 안되서
//        return instance;
//    }
//
//    //메소드 만들기
//    public boolean inValidDuplicatedUsername(String username) {
//        User foundUser = userRepository.findByusername((username)); //파인드를 호출했을때 유저네임을 가져올 수 있다.
//        if (foundUser != null) { //인터페이스 메소드 참조
//            return true; //boolean 반환이라
//        }
//        return false;
//    }
//    public boolean isValidPassword(String password) {
//        return password != null && !password.isBlank();
//
//    }
//    //메인에 메소드 만들기에서 여기로
//    public boolean isValidConfirmPassword(String password, String confirmPassword) {
//        if (password == null || confirmPassword == null) {
//            return false;
//        }
//        return password.equals(confirmPassword);
//    }
//    public void signup(SignupReqDto signupReqDto) {
//        userRepository.insert(signupReqDto.toEntity()); //인터페이스 메소드 참조함
//    }
//
//
//
//}
package _32_LayeredArchitecture2.service;

import _32_LayeredArchitecture2.dto.SignupReqDto;
import _32_LayeredArchitecture2.entity.User;
import _32_LayeredArchitecture2.repository.UserRepository;
import _32_LayeredArchitecture2.repository.UserRepositoryImpl;
import _32_LayeredArchitecture2.repository.UserRepositoryImpl2;

public class SignupService {
    private static SignupService instance;
    private UserRepository userRepository;

    private SignupService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public static SignupService getInstance() {
        if (instance == null) {
            instance = new SignupService(UserRepositoryImpl2.getInstance());
        }
        return instance;
    }

    public boolean isValidDuplicatedUsername(String username) {
        User foundUser = userRepository.findByUsername(username);
        if (foundUser == null) {
            return true;
        }
        return false;
    }

    public boolean isValidPassword(String password) {
        return password != null && !password.isBlank();
    }

    public boolean isValidConfirmPassword(String password, String confirmPassword) {
        if (password == null || confirmPassword == null) {
            return false;
        }
        return password.equals(confirmPassword);
    }

    public void signup(SignupReqDto signupReqDto) {
        userRepository.insert(signupReqDto.toEntity());
    }

}