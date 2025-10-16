package _06_String;

public class String02 {
    public static void main(String[] args) {
        String s = "I like music and movie and travel";
        System.out.println(s.replace(" and", ",")); //값이 두개가 들어가는데 첫번 째는 타겟이다.
        // and를 ,로 바꿔보자,  " " , ""로 공백 제거도 가능하다.

        //인덱스 기준 특정 위치부터 출력 하기
        System.out.println(s.substring(7)); //인덱스 번호가 7번 부터 출력하고 싶다는 뜻
        //숫자가 두개가 들어가면 범위를 설정할 수 있다.
        System.out.println(s.substring(7, 12)); //12가 공백인데 출력된건 c까지 나와서 끝인덱스를 지정할 때는 자기를 포함하지 않고
        // 자기 앞까지만 촐력하기 때문에 11까지만 나온다.

        //특정 문자열이 있는 위치부터 출력 시킬 수 있다.
        System.out.println(s.indexOf("movie"));
        System.out.println(s.substring(s.indexOf("movie"), s.indexOf("."))); // movie가 있는 위치부터 끝까지 출력 가능하다.
        //index를 두개쓰면 두 단어 사이의 앞까지 출력 한다. 그러니 movie부터 .앞까지 출력한다.

            s = "     I want go home      ";
            //처음과 끝부분 공백을 없애고 싶을 경우
        System.out.println(s.trim());


        String s1 = "Hello";
        String s2 = "World";
        System.out.println(s1 + s2);
        //또다른 방법으로 둘을 붙힐 수 있다.
        System.out.println(s1.concat(s2));
        System.out.println(s1.concat("!!").concat(s2));



























    }
}
