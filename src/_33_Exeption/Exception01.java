package _33_Exeption;

/*
* 오류의 종류
* 1. Error = 시스템적 오류(JVM이 감당할 수 없는 오류) 예를들면 OutOfMemoryError, StackOverflowError
* 2. Exception = 개발자가 처리 가능한 오류 예를들면 NullPointerException, IOException
*
* 예외(Exception) = 프로그램 실행 중 발생할 수 있는 비정상적인 상황을 객체로 표현한 것, 객체로 표현한 것이기 때문에 클래스로 이루어져 있다.*/
public class Exception01 {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        //int result = a / b;
        //System.out.println(result);
        //이러면 오류가 뜨는데 메인이라는 스레드에서 익셉션이 발생헀는데 by zero(0으로 나눌 수 없다.) 알스메틱은 연산예외

        //예외 처리를 해줘야 하는 이유는 Java의 특성 상 예외가 하나라도 발생하면 전체 컴파일링을 실패로 간주

        /*
        * try - catch - finally구문 / throws 키워드
        * try {
        *   예외가 발생할 수 있는 코드
        * } catch (ExceptionType의 클래스) {
        *   예외 발생시 실행할 코드
        * } finally {
        *   예외 발생 여부와 상관없이 무조건 실행되는 코드
        * }
        * */
        try {
            int result = a / b;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("0으로 나눌 수 없습니다: " + e.getMessage()); //겟 메세지는 /by zero를 가져올 수 있다.
        } finally {
            System.out.println("프로그램 종료");
        }

        //인덱스 에러를 띄워보자
        int[] numbers = {1, 2, 3}; //123이 들어간 배열
        try {
            System.out.println(numbers[5]); //5번이 존재하지 않아 에러 터질꺼같아서 catch
        } catch (ArrayIndexOutOfBoundsException e) { //모든 예외는 익셉션을 상속받아서 모든 예외 처리가 가능해짐 exception을 쓰면
            System.out.println("예외 발생!: " + e.getMessage());
        } catch (Exception e) { //캐치 여러개 사용 가능
            throw new RuntimeException(e); //throw는 예외를 강제로 발생 시킨다. new는 새로운 생성자 런타임에 대해 새로운 생성자 만든다. e는 43에서 잡은 해당예외를 전달해준다.
            //throw - 이미 정의된 예외 클래스를 이용해서 의도적으로 예외를 던지는 역할
            //반드시 new키워드를 이용해서 예외 객체를 생성해야 한다.
        } finally {
            System.out.println("프로그램 종료");
        }
    }
}
