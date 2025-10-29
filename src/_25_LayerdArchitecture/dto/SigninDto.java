package _25_LayerdArchitecture.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class SigninDto { //로그인 이니 로그인에 필요한 데이터는 유저네임 패스워드 니까
    private String username;
    private String password;
}
