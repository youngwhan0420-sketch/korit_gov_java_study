package _25_LayeredArchitecture.repository;

import _25_LayeredArchitecture.entity.User;

public class UserList {
    private User[] users;

    public UserList() {
        this.users = new User[0];
    }

    public User findByUsername(String username) {
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                return user;
            }
        }
        return null;
    }

    public int generateUserId() {


        //만약 users배열에 아무것도 없으면 1반환
        //있으면 마지막 user객체의 userId에 +1한 결과값을 반환
        //삼항연산자
    }
}


//package _25_LayerdArchitecture.repository;
//
//import _25_LayerdArchitecture.entity.User;
//
//public class UserList { //멤버변수로 유버배열을 갖고 있다.
//    private User[] users;
//
//    public UserList() {
//        this.users = new User[0];
//    }
//    public User findByUsername(String usename) {
//        for (User user : users) {
//            if(user.getUsername())
//
//
//
//
//                //해당 유저가 없어서 null리턴 해준다.
//        }
//    }
//}
