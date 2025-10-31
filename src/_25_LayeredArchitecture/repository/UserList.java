package _25_LayeredArchitecture.repository;

import _25_LayeredArchitecture.entity.User;

public class UserList {
    private User[] users;

    public UserList() {
        this.users = new User[0];
    }

    public User[] getAllUser() {
        return users;
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
        //만약 users 배열에 아무것도 없으면 1반환
        //있으면 마지막 user객체의 userId에 +1 한 결과값을 반환
        //삼항연산자
        return users.length == 0 ? 1 : users[users.length - 1].getUserId() + 1;
    }

    public void add(User user) {
        //새로 넣을 배열 => 길이? => 원래 있던 배열의 길이에서 + 1
        User[] temp = new User[users.length + 1];
        //새로 넣을 배열에 원래 있던 요소들을 먼저 추가
        for (int i = 0; i < users.length; i++) {
            temp[i] = users[i];
        }
        //새로 추가할 user를 넣어야함
        temp[temp.length - 1] = user;
        //users에 있던 배열에서 새로운 배열로 바꾸기
        users = temp;
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
