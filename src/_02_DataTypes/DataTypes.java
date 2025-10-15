package _02_DataTypes;

public class DataTypes {
    public static void main(String[] args) { // 를 한번에 쓰는 단축어: psvm이다.

        System.out.println("안녕하세요");
        System.out.println(123);
        System.out.println("123");
        System.out.println(3.14);
        //변수는 재사용성과 유지보수에 좋다
        //변수 선언하는 방법: 자료형 변수명 = 데이터;
        //정수에 int와 long를 사용해 변수를 선언해보자.
        int num1 = 10; // 그럼 num1이라는 변수를 선언해서 변수에 10이라는 정수가 담겼다. 10이라는 값을 가진 int 자료형의 변수다.
        //그래서 num1이라는 변수를 입력하면 10이 출려된다.
        System.out.println(num1);
        int age = 27;
        System.out.println(age);
        long num2 = 1000000L;
        //long라 써놨지만 기본적으로  int로 인식을 한다 그래서 명시를 해줘여 한다. 그러기 위해선
        //int범위를 벗어난 long을 쓸때는 숫자 끝에 대문자L을 써주면 빨간색 및줄이 사라진다.
        num2 = 1000000000; //이렇게 다시 num2를 선언하면 num2를 재할당 하겠다는 뜻이다.
        //중간중간 _로 숫자 구분이 가능하다.
        char char1 = '가';
                char char2 = '나';
                char char3 = '다';
        System.out.println(char1 + char2 + char3);
        //char은 아스키코드로 숫자로 나온다. 숫자말고 문자로 가나다 나오게 하고싶다면 앞에다 ""를 넣어주면 가나다가 나온다.
        System.out.println(""+char1 + char2 + char3);

        String names = "김영환";
        //대문자로 시작하기 때문에 클래스를 의미한다.
        String hello = "안녕하세요";
        String name = "김영환";
        System.out.println(hello + name);

        boolean isEmpty = false;
        System.out.println(isEmpty);

        //이름 변수와 나이 변수, 주소 변수를 선언한다.
        //제 이름은 ***이고, 나이는**살이며, ***에서 살고 있습니다.

        String nm = "김영환";
        String ad = "울산";
        int ag = 29;

        System.out.println("제 이름은 " + nm + "이고, 나이는 " + ag + "살이며 " + ad + "에서 살고 있습니다.");






    }

}
