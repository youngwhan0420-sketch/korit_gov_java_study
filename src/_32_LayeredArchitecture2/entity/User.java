package _32_LayeredArchitecture2.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
@Builder
@Data
@AllArgsConstructor
public class User {
    private Integer userId;
    private String username;
    private String password;
} //1. 엔티티 생성 끝
