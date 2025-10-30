package _25_LayeredArchitecture.service;

import _25_LayeredArchitecture.dto.SignupReqDto;
import _25_LayeredArchitecture.entity.User;
import _25_LayeredArchitecture.repository.UserList;

public class UserService {
    private UserList userList;

    public UserService(UserList userList) {
        this.userList = userList;
    }
    //public User signin(signinReqDto signinReqDto) {
    //User foundUser = userList.findByUsername(signinReqDto.getUsername());
    //if (foundUser == null) {
    //username을 가진 회원 없음
    //return null;을 반환 한다.
    //}
    //if (foundUser.getPassword(),equals(signinReqDto.getPassword())){
    //return null;
    //}
    //return foundUser;
//}
    //username 중복확인
    public boolean isDuplicatedUsername(String username) {
        return userList.findByUsername(username) != null;
    }

    //회원가입
    public void signup(SignupReqDto signupReqDto) {
        //1. signupReqDto -> user (entity)
        User user = signupReqDto.toEntity();
        //2. userId 생성
        user.setUserId(userList.generateUserId());
        //3. user 배열에 추가

    }
    //회원 정보 전체를 출력하는 메소드 만든다.
    public void printUserAllUserList() {
        System.out.println("[[회원 정보 전체 조회]]");//유저 리스트로 가서 배열을 반환해주는 메소드를 만든다.
       // for (User user: userList.getAllUser()) {
        //    System.out.println(user);
        //}
    }
}