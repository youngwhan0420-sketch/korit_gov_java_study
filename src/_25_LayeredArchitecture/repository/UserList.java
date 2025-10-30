package _25_LayeredArchitecture.repository;

import _25_LayeredArchitecture.entity.User;

public class UserList {
    private User[] users;

    public UserList() {
        this.users = new User[0];
    }
    //유저 배열을 반환

    public User findByUsername(String username) {
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                return user;
            }
        }
        return null;
    }

    public int generateUserId() { //일단 이걸 호출하면 유저아이디를 ㅁ나들고 싶은데 일단 만약 유져스라는 배여릉ㅇㄹ 확인하는 데 길이가 0이라는거는
        //아무것도 없으니 1을 반환하면 된다. 0이 아니라면 배열에 누군가꺼가 들어가있는거라 마지막꺼에 +1해줘야하니 유저스배열에서 인덱스로 접근을 한다. 마지막으로 유져 배열에 추가해준다.
        //만약 users배열에 아무것도 없으면 1반환
        //있으면 마지막 user객체의 userId에 +1한 결과값을 반환
        //삼항연산자
        return users.length == 0 ? 1 : users[users.length - 1].getUserId() + 1;//이제 유저 서비스에서 생성 가능 (24번)
    }
    public void add(User user) {


        //새로 넣을 배열 => 길이는 원래 있던 배열의 길이에서 +1을 해준다.
        User[] arr = new User[users.length+1];
        //새로 넣을 배열에 원래 있던 요소들을 먼저 추가
        for (int i = 0; i < users.length; i++) {
            arr[i] = users[i];
        }
        //새로 추가할 user를 넣어야 함.
        arr[arr.length-1] = user;
        //users에 있던 배열에서 새로운 배열로 바꿔야 한다.
        users = arr;

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
