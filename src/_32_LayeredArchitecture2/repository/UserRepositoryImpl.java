//package _32_LayeredArchitecture2.repository;
//
//import _32_LayeredArchitecture2.entity.User;
//
//public class UserRepositoryImpl implements UserRepository{
//    private static UserRepositoryImpl instance;
//    private User[] users;
//    private int autoIncremenId;
//
//    private UserRepositoryImpl() {
//        users = new User[0];
//        autoIncremenId = 1; 생성자에 1추가
//    }
//
//    public static UserRepositoryImpl getInstance() {
//        if (instance == null) {
//            instance = new UserRepositoryImpl(); 싱글톤
//        }
//        return instance;
//    }
//    @Override
//    public void insert(User user) {
//        User[] temp = Arrays.copyOf//새배열을 만들어서 원래 있던 배열을 그대로 카피해서 +1해준다.
        //
//
//    }
//
//    @Override
//    public User findByusername(String username) {
//        return null; //없으면 널 있으면 user
//    }
//}
package _32_LayeredArchitecture2.repository;

import _32_LayeredArchitecture2.entity.User;

import java.util.Arrays;

public class UserRepositoryImpl implements UserRepository {
    private static UserRepositoryImpl instance;
    private User[] users;
    private int autoIncrementId;

    private UserRepositoryImpl() {
        users = new User[0];
        autoIncrementId = 1;
    }

    public static UserRepositoryImpl getInstance() {
        if (instance == null) {
            instance = new UserRepositoryImpl();
        }
        return instance;
    }

    @Override
    public void insert(User user) {
        User[] temp = Arrays.copyOf(users, users.length + 1);
        user.setUserId(autoIncrementId++);
        temp[temp.length - 1] = user;
        users = temp;
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
}




