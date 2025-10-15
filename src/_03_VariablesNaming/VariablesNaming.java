package _03_VariablesNaming;

public class VariablesNaming {
    public static void main(String[] args) {
     //변수명 짓는법
        //예약어 사용불가 ( public, static, void, int, double,float)를 단독으로 사용할 수 없다.

        String carBrandName = "KIA";
                String carModelname = "EV6";
                String carEnginType = "electric";
                String carColor = "red";

                int carpassengerCapacity = 5;
                int carModelYear = 2025;

                //boolean 의 변수명
                boolean isEmpty = false;

                //상수
                final String countryCode = "KR";  //final은 바꿀 수 없다.
                //countryCode를 US로 바꾸면 대입할 수 없다고 뜬다 .

                // 상수는 변수명을 대문자로 짓는다.
                final String COUNTRY_CODE = "KR";


                //생년월일 => 상수 선언, 이름 => 변수 선언
                //제 이름은 ***입니다. 생년월일은 ***입니다.
                //int birth = 970420;
                //String na = "김영환";

            //System.out.println("제 이름은 " + na +" 입니다. 생년월일은 " + birth + " 입니다." );

            final String BIRTH_YEAR_MONTH_DAY = "19970420";
            String name = "김영환";
            System.out.println("제 이름은 " + name +" 입니다. 생년월일은 " + BIRTH_YEAR_MONTH_DAY + " 입니다." );




    }
}

