//package _24_Builder.User;
//
//public class User {
//    private int userId;
//    private String username;
//    private String password;
//    private String email;
//
//
//
//    private User (Builder builder) { //유저 생성자
//        this.email = builder.email;
//        this.password = builder.password;
//        this.userId = builder.userId;
//        this.username = builder.username;
//
//    }
//
//    // @Override
//    // public String toString() {
//    //    return "User(userId =" + userId + ", username=" + username + ",password=" + password
//    // }
//    public static class Builder { // 빌더
//        private int userId;
//        private String username;
//        private String password;
//        private String email;
//
//
//        public Builder userId(int userId) {
//            this.userId = userId;
//            return this;
//        }
//        public Builder username(String username) {
//            this.username = username;
//            return this;
//        }
//        public Builder password(String password) {
//            this.password = password;
//            return this;
//        }
//        public Builder email(String email) {
//            //if (!email.contains("@")) {
//            // sout("이메일");
//            //} else {
//            //  this.email = email;
//            //  }
//            //  return this;
//            //}
//            this.email = email;
//            return this;
//        }
//
//
//        public User build() { //유저 객체를 반환하는 빌드
//            if ((username == null || username.isBlank() || password == null || password.isBlank())) { //isblank와 (isempty 를 쓰면 해당문자열이 0이면 트루, 블랭크는 빈공백으로 이루어져 있으면 트루)
//                //이즈엠티는 문자열 길이가 0일 떄, 이즈 블랭크쓰면
//                System.out.println("username필드 또는 password필드가 비어 있습니다.");
//            }
//            if (!email.contains("@")) {
//                System.out.println("이메일 형식이 아닙니다.");
//                email = null;
//            }
//            return new User(this);
//        }
//
//    }
//}
//
//
//
