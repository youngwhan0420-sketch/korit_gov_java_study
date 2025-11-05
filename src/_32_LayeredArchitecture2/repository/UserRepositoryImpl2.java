//package _32_LayeredArchitecture2.repository;
//
//import _32_LayeredArchitecture2.entity.User;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class UserRepositoryImpl2 implements UserRepository { //4. 오버라이드해서 다 구현을 해야 빨간줄 안뜬다.
//    private static UserRepositoryImpl2 instance; // 5.
//    private List<User> users;
//    private int autoIncrementId;
//
//    //6. 생성자 막아주기
//    private UserRepositoryImpl2() {
//        users = new ArrayList<>();
//        autoIncrementId = 1;
//    }
//
//    public static UserRepositoryImpl2 getInstance() {
//        if (instance == null) {
//            instance = new UserRepositoryImpl2();
//        }
//        return instance;
//    }
//  //4. 오버라이드해서 다 구현을 해야 빨간줄 안뜬다.
//    @Override
//    public void insert(User user) {
//        user.setUserId(autoIncrementId++);
//        users.add(user); //맨처음엔 1이 들어가고 ++이뤄지면서 그다음엔 2, 3
//        System.out.println(users);
//    }
//
//        @Override
//        public User findByusername (String username){
//            for (User user : users) {
//                if (user.getUsername().equals(username)) {
//                    return user;
//                }
//            }
//            return null;
//
//        }
//    }
//
package _32_LayeredArchitecture2.repository;

import _32_LayeredArchitecture2.entity.User;

import java.util.ArrayList;
import java.util.List;

public class UserRepositoryImpl2 implements UserRepository {
    private static UserRepositoryImpl2 instance;
    private List<User> users;
    private int autoIncrementId;

    private UserRepositoryImpl2() {
        users = new ArrayList<>();
        autoIncrementId = 1;
    }

    public static UserRepositoryImpl2 getInstance() {
        if (instance == null) {
            instance = new UserRepositoryImpl2();
        }
        return instance;
    }

    @Override
    public void insert(User user) {
        user.setUserId(autoIncrementId++);
        users.add(user);
        System.out.println(users);
    }

    @Override
    public User findByUsername(String username) {
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                return user;
            }
        }
        return null;
    }
    //오버라이드해서
    //얘가 가지고 있는 유저스를 전체를 출력하는 거로 바꿔보자.
    //어펜드시켜서 문자열을 쭉 만들꺼다 스트링빌더를 이요해서
    //그래서 스트링빌더 객체를만들고
    //여기서 이어붙힐껀데 반복을 해야하니
    //유저스 사이즈만큼 반복을 여기서 돌리고
    //스트링빌더에 어팬드 유저스에 겟해서 i 번째를 들고온다.
    //만약 아이가 아니다. 마지막 전까지
    //어펜드해서 ,를 찍어준다. 마지막이 아닌 애들은 콤마를 찍어준다.
    //대괄호 닫아준다.
    //리턴 스트링빌더만은 안되고 투 스트링 해줘야 한다.
    //그럼 유저들 중간중간 콤마를 찍어주고 마지막에 대괄호로 닫아준다. 이제 메인에가서
}