package _22_Bean;

import java.time.LocalDateTime;

/*
* Bean
* 필드 속성들을 프로퍼티라고 하며, 해당 프로퍼티들은 private로 캡슐화가 되어있어야 한다.
* 그리고 캡슐화된 프로퍼티들은 getter,setter로만 접근 가능하다.
* getter, setter들은 모두 다 public이어야 한다.
* 데이터를 표현하는 것을 목적  , 모델은 데이터를 표현하기 위한방식
* */
public class UserEntity {
    private int userId;
    private  String username;
    private int age;
    private String email;
    private LocalDateTime createDt; //해당 데이터가 db에 들어간 시간
    private LocalDateTime updateDt; // 쿼리문을 통해 수정한 시각이 찍힌다.
    private int statusCode;

    //외부 접근은 게터 세터로만 접근이 가능한데 Bean이다.

    //게터 세터들을 다 만들어 주자
    public int getUserId() {
        return userId;
    }

    public String getUsername() {
        return username;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }
    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //

    //
}
