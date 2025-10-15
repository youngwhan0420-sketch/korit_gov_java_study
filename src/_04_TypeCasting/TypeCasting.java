package _04_TypeCasting;

public class TypeCasting {
    public static void main(String[] args) {


        //TpyeCasting은 타입을 변환 시켜준다.
        //형변환
        //정수에서 실수로 바꾸는 방법
        //int scoreInt = 98; //scoreInt에 98을 넣었다. 얘를 float나 double로 형태를 변환해서 출력해볼려면
        //System.out.println((float) scoreInt); //이렇게 해주면 변환이 된다.
        //float scoreFloat = (float) scoreInt; //이런식으로 새로 만들어야 한다.
        // System.out.println(scoreFloat);

        //실수에서 정수로 바꾸는 방법
        //float scoreFloat = 98.3F; //얘를 int 형으로 바꾸고 싶으면
        //System.out.println((int) scoreFloat); //실수에서 정수로 바꾸기 때문에 소수점은 빼고 출력한다.

        //double scoreDouble = 88.3; //int로 변환을 할려면
        //System.out.println((int) scoreDouble); //얘도 정수 부분만 나온다.


        //double sum1 = 98 + 77.3; //을 줬다고 했을 때 이런 형태일 것이다.
        //double sum1 = (double) 98 + 77.3; // double이 적용되어있는데 생략이 되어 있다. 형태 형변환을 해줘야 하는 형변환이 있다.
        //System.out.println(sum1); //자동 형변환

        //이럴 때는 수동으로 형변환을 해줘야 한다. int라 더한값이 정수로 나와야 하니 77.3을 정수형으로 바꿔줘여 한다.
        //int sum2 = 98 + (int) 77.3; //수동으로 바꾸는 방법


        //float sum3 = 98 + 77.3F; //했을 때 98에는 자동으로 flaot 형변환이 일어났을 것이다.



        //double convertedScoreDouble = scoreInt;
        //score는 int이고 앞에 double 인데 출력했을
        // 자동으로 형변환을 일으키는
        //int -> long -> float -> double 가될때 자동으로 형변환이 일어날 수 있다.인트 --> 롱, 플로트, 더블
        //롱이 인트를 품을 수 있기 때문이다


        //수동으로 형변환을 해줘야 할 경우
        //int convertedScoreInt = scoreDouble; //빨간색으로 뜨는 이유는 위에서는 double에서 int 로 넘어가는 거지만 여기선 반대기 때문에
        //수동으로 해줘야 한다. 그래서
        //int convertedScoreInt = (int) scoreDouble; //이렇게 수동으로 바꿔줘야 한다. 버려질 수 있는 값이 있기 때문에 명시를 해줘야 한다.
        // double -> float -> long -> int (수동 형변환)


        //long scoreLong = 87L; //long으로 들어가있는 값을 넣어보면
        //convertedScoreInt = scoreLong; //안되기 때문에 수동으로 바꿔줘야 한다.
        //convertedScoreInt = (int) scoreLong;

        //float convertedScoreFloat = scoreInt; //얘는 int에서 float로 가기때문에 명시를 하지 않아줘도 된다.



        //숫자를 문자열로 바꿔보기
        //int num1 = 55; //정수 55를 문자열 55로 형태를 바꾸고 싶으면
        //String strNUm1 = String.valueOf(num1); //숫자를 문자열로 바꾸는 첫번째 방법
        //strNum1 = Integer.toString(num1); //두번째 방법 //인티저만 넣을 수 있다.

        //소수점이 있는 실수는 어떻게 될지, 첫번째 방법
        //double num2 = 55.55;
        //String strNum2 =  String.valueOf(num2);//55.55를 문자열 55.55로 바꾸고 싶을때 모든 타입을 넣을 수 있다.

        //두번 째 방법
        //strNum2 = Double.toString(num2); //더블만 넣을 수 있다


        //float num3 = 56.34F;
        //String strNum3 = String.valueOf(num3);
        //strNum3 = Float.toString(num3);

        //문자열에서 숫자로 바꾸고 싶을 때
        //int i = Integer.parseInt("34"); //이러면 Integer.parseInt 가 int 로 변환 된다.
        //double d = Double.parseDouble("34.44"); //얘도 문자열 형태의 실수지만 double로 바꿀 수 있다.
        //float f = Float.parseFloat("34.1234F");
        //System.out.println(f);


        float floatNumber = 3.141592F;
        //여기서 정수만 출력하시오
        //System.out.println((int) floatNumber);
        int result = (int) floatNumber;



    }
}