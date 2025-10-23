package _15_OverLoading;

public class OverLoading { //메소드 오버로딩
//    public static int getPower(int number) {
//        return number * number;
//    }
//
//    public static  int getPower(double doubleNum) {
//        return (int) (doubleNum * doubleNum);
//    } //getPower을 두개 만들었지만 위에 아래랑 타입이 다르다. 그럼 밑에서 getpower을 쓰게되면 다른유형 2개가 나온다.
//    public static void printInfo(String name) {
//        System.out.println(name);
//    }
//    public static void printInfo(String name, int age) {
//        System.out.println(name +" " + age);
//    }
//    public static void printInfo(String name, String address, int age) {
//        System.out.println(name + "" + address + " " +age );
//    }

    public static int max(int a, int b) {
        return a > b ? a : b;
    }
    public static double max(double a, double b) {
        return a > b ? a : b;
    }
    public static void main(String[] args) {
        //같은 이름의 메소드를 여러개 선언하는 것.
        //전달값(파라미터)의 타입이 달라야 한다.
        //또는 갯수가 달라야 한다. 대신 반환형은 같아도 된다.
//        String str = "abc";
//        str.indexOf(str)   //매개변수 타입이 다른거나 갯수가 달라야 한다.
//
//        System.out.println(getPower(3.14)); //숫자를 입력하면 알아서 찾아간다.


        //printInfo()
        //하나는 문자열 이름만 전달해서 = > 이름 출력
        //하나는 문자열 이름과 정수 나이 전달 => 이름, 나이 출력
        //하나는 문자열 이름과 정수 나이, 문자열 이메일 전달 => 이름, 나이 ,이메일 출력

//        printInfo("김영환"); //

        //max()
        //int 숫자 두개 중 더 큰 값
        //double 숫자 두개 중 더 큰 값 리턴
        System.out.println(max(8, 10));
        System.out.println(max(10, 5.6));
    }
}
