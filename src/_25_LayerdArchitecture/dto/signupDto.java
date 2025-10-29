package _25_LayerdArchitecture.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class signupDto { //회원가입할 때 쓸 dto
    //유저아이디 빼고 3개 다, 회원가입 시점에 유저아이디 알 수 없으닌 3개만 필드로 가진다.
    private String usename;
    private String password;
    private String name;



}
