package _16_Class.Student;

public class Student {

//    //메소드 - showInfo()로 정보 출력
//    String name;
//    int age;
//    String address;
//    String email;
//
   //  public void showInfo() {
//       System.out.println("이름: " + name + "\n나이: " + age + "\n주소: " + address + "\n이메일: " + email);
//    }

     //private여서 StudentMain에서는 접근이 불가능한 상태가 된다.
    //메소드를 통해야 값을 수정할 수 있다.
    private  String name;
    private  int age;
    private  String address;
    private  String email;

    //생성할 때 주입을 해주는 방법
    Student(String name, int age, String email, String address) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.address = address;
    }

        public void showInfo() {
            System.out.println("이름: " + name);
            System.out.println("나이: " + age);
            System.out.println("이메일: " + email);
            System.out.println("주소: " + address);
        }
    }

