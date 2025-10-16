package _06_String;

public class String01 {
    public static void main(String[] args) {
        String s = "My name is young";
        //문자열의 길이를 한번에 구해주는 방법
        System.out.println(s.length());
        System.out.println(s.toUpperCase()); //대문자로 변환
        System.out.println(s.toLowerCase()); //소문자로 변환
        System.out.println(s.contains("name")); //단어의 포함 여부를 묻는다. true, false로 나온다.
        System.out.println(s.indexOf("name")); //인덱스 위치정보를 알아낼 수 있다.
        //해당 문자열이 없으면 -1이 나온다.

        s = "I like music and movie and travel";
        System.out.println(s.lastIndexOf("and")); //and를 찾을 껀데 지금 and가 두번 나왔는데 last인덱스가 나왔기 때문에
        //여러개중 마지막 위치의 and를 찾는다 얘도 없으면 -1이 뜬다.
        System.out.println(s.startsWith("I like")); // 해당 문자여로 시작하는지 묻는거다 (true/false)가 결과로 나온다.
        System.out.println(s.endsWith("travel")); //해당 문자열로 끝나는지 물어본다.(true/false)








































    }
}
