package _25_LayerdArchitecture.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class User {
    private int userId;
    private String usename;
    private String password;
    private String name;
}
