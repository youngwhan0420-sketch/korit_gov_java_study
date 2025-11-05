package _32_LayeredArchitecture2.util;

import java.util.Objects;

public class PasswordEncoder {
    private static final String secrets = "암호화비밀번호"; //암호화 시켜주는 비밀키

    public static String encode(String str) {  //()안에있는 평문을 암호문으로 바꿔보자
        if (str == null) {
            return null;
        }
        System.out.println("hash: " + Objects.hash(str));
        long hash = Integer.toUnsignedLong(Objects.hash(str));
        System.out.println("unsigned hash: ");
        long encodedHash = hash + Objects.hash(secrets);
        System.out.println("");
        System.out.println("");
        System.out.println("");
        return Long.toHexString(encodedHash);
        //인코드 작성

    }

    //이제 비교하기
    public static boolean match(String 평문, String 암호문) {
        if (평문 == null || 암호문 == null) {
            return false;
        }
        return encode(평문).equals(암호문);
    }
 }
