package _24_Builder.User;

public class UserMain {
    public static void main(String[] args) {
        User user = new User.Builder()
                .email("@")
                .userId(5)
                .username("k")
                .password("fgfdg")
                .build();
    }
}
