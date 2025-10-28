package _21_Objects;

public class Main {
    public static void main(String[] args) {
        //예를 들어 teaxher을 만들었다.친다
        //여기서 출력하면 나오는게 주소가 나오는데 teacher.toString 해줘도 변화가 없다.
        //안에 속성들이 보이게 해줄려며고 커스텀을 해보자.
        //보이게 할려면 오버라이딩 해주면 된다.

//        //하나더 만들어 보자
//        teacher teacher1 = new Teacher("박화목", "웹개발");
//        teacher teacher2 = new Teacher("박화목", "웹개발");
//        //이퀄스로 비교ㅕ했을때 참조주소가 달라서 false가 나온다.
//        System.out.println(teacher1.hashCode());
//        System.out.println(teacher2.hashCode());
//        //이퀄스가 같으면 해쉬코드가 달라야 한다.
        //이퀄스를 고치면 해쉬코드도 고쳐줘야 한다.

        //1112같ㄱ 해주면 다르게 나오지만 커스텀한걸 적용햇거 다시해보면 true가 나온다.

    }

}
