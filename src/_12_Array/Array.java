package _12_Array;

public class Array {
    public static void main(String[] args) {
        //배열은 같은 자료형 데이터를 연속된 공간에 저장하는 고정 크기 컨테이너이다.

        //배열을 쓰지 않으면
        String country1 = "d";
        String country2 = "f";
        String country3 = "g";
        String country4 = "h";
        String country5 = "k";
        //공통점은 문자열 String자료형을 쓴다. 배열을 쓰지 않고 변수들을 쓴다면 같은 역할의 변수가 늘어나 비효율적이다.

        //1.선언 + 공간 할당
       // String[] countries = new String[5];//스트링 배열
        //5개의 공간을 할당 받는다.
        //2. 선언 형태만 바뀐 동일 문법
//        String countries[] = new String[5];
//
//        //값 채우기(인덱스)
//        countries[0] = "a";
//        countries[1] = "b";
//        countries[2] = "c";
//        countries[3] = "d";
//        countries[4] = "e";
//        //countries[5] = "f"; //5번 인덱스에 넣게되면 범위를 벗어났다는 에러가 뜬다.
//        //할당된 공간의 크기보다 더 넣게 되면 ArrayIndexOutOfBounds예외 발생
//        System.out.println(countries); //출력을 했는데 결과가 이상하게 뜬다.
//        //출력시도하면 메모리 주소를 출력하게 되는데 Array라는 클래스를 직접적으로 출력을하면 주소가 나온다.
//

        //3.선언과 동시에 값을 나열 할 수 있다.
       // String[] countries = new String[] {"a", "b", "c", "d", "e"};

        //4. 선언과 동시에 값 나열 하는데 new생략 가능
        String[] countries = {"a", "b", "c", "d", "e"};

        //5.배열의 값 변경 하는 법
        countries[2] = "Swiss";
        System.out.println(countries[2]);
        //인덱스로 접근하면 출력이 잘 된다.

        //배열의 길이 => 할당된 공간 크기
        System.out.println(countries.length);

        int[] numbers = {1, 2, 3}; //길이가 3칸인 numbers
        boolean[] booleans = {true, false, true, false};
        double[] doubles = {12.3, 15.2,3.14};
        float[] floats = {3.14F,5.6F};
        long[] longs = {45L,234L,564L};



    }
}
