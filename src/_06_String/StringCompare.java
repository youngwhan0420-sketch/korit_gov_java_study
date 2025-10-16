package _06_String;

public class StringCompare {
    public static void main(String[] args) {
        //문자열 비교
        String str1 = "Java";
        String str2 = "Python";
        System.out.println(str1 == str2);//결과라 false가 나올 것이다.
        //또 다른 방법
        System.out.println(str1.equals(str2)); //false가 나온다.

        System.out.println(str1.equals("Java")); //true가 나온다.

        System.out.println(str1.equalsIgnoreCase("java")); //대소문자를 무시하고 내용으로만 따졌을 때 같은지를 확인 시켜준다.

        str1 = "1234";
        str2 = "1234"; //같은 문자열 1234인데
        System.out.println(str1 == str2); //하면 결과값이 true가 나올 텐데
        System.out.println(str1.equals(str2)); //하면 true

        //만약에
        str1 = new String("1234");
        str2 = new String("1234");
        //똑같이 써도 같냐라고 비교했을때 false라고 나온다.
        System.out.println(str1 == str2); //참조 위치를 비교
        //근데 이렇게 하면 true가 나온다.
        System.out.println(str1.equals(str2)); //문자열의 내용을 비교
        //new를 쓰면 컴퓨터 메모리공간을 할당받아 str1에 1234를 넣는다. str2도 이런식으로 할당받아 1234를 넣는데
        //내용적으로 같은데 ==는 내용비교가 아니고 참조 위치 비교이다. 위치가 같냐는 거
        //str1 100번지 str2를 101 예시를 하면
        //==라는 비교를 했을떄 1234를 비교하는게 아니라 서로의 메모리 주소의 위치를 비교하는 거다.
        //참조위치를 비교했을 떄 다르기 때문에 false가 나오고
        //equals가 내용이 같냐는 뜻이라 true가 나온다.
        //new는 클래스 생성하는 거기 떄문











    }
}
