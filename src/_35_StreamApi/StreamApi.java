package _35_StreamApi;

import java.util.Arrays;
import java.util.List;

/*
* 컬렉션과 배열에 저장된 데이터를 선언형으로 처리하기 위한 추상화된 반복 프레임워크
* 데이터로부터 메소드 체이닝 형태로 여러 연산을 연결해 수행할 수 있게 해준다.
*
* 간결성
* 메소드 체이닝으로 인한 가독성 향상 및 간결해짐
* 함수형 프로그래밍
* */
public class StreamApi {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("김영", "김일", "김이", "김삼", "김사", "최오", "최육", "박팔");

        //filter() => 말그대로 어떠한 조건을 통해 거르는 것
        List<String> namesWithKim = names.stream() //스트림 형태로 바꾸고
                .filter(name -> name.startsWith("김")) //필더로 바꾸고 이 필터에 람다식으로 구현한다. 이러면 각각 요소에 김이라는 문자에 요소를 확인한다. 이조건이 false일 경우 걸러진다.걸러진 결과값을
                .toList(); //리스트 자료형으로 리스트에 넣어준다. 리스트가 꼭 있어야 한다.
        System.out.println("nameWithKim: " + namesWithKim);

        List<Integer> numbers =
                Arrays.asList(1, 2, 3, 4, 5); //이렇게 넣어다 치자
        //Map이라는걸 할껀데 얘는
        //내부요소들에게 각각 메소드를 적용하는 형태다
        List<Integer> multiNumbers = numbers.stream() //스트림을 이용하면 모든 요소의 적용할 수 있다.
                .map(number -> number * 2)
                .toList();
        System.out.println("multiNumbers: " + multiNumbers);

        List<String> englishNames =
                Arrays.asList("alice", "anya", "smith", "pascal", "bacon", "herry", "");
        //a로 시작하는 애들은 거르고 모두 다 대문자로 변경하면서 정렬까지
        List<String> result = englishNames.stream() //그럼 순서가 필터가 오고 맵 오고 sort쓴다.
                .filter(name -> name.startsWith("a"))
                .map(String::toUpperCase) // name -> name.toUpperCase()와 같다. ::두개는 해당 타입 클래스의 메소드를 직접 호출해서 각각 요소에 적용
                .sorted()
                .toList();
        System.out.println("result: " + result);
        result.forEach(name -> System.out.println(name));
        result.forEach(System.out::println);

        //englishNames에서 이름이 5글자 초과 되는 이름의 갯수
        //일반적으로 for을 이용한 결과
        //스트림을 이용한 결과
        int count1 = 0;
        for (int i = 0; i < englishNames.size(); i++) {
            if (englishNames.get(i).length() >5) {
                count1++;
            }

        }
        System.out.println("이름 길이가 5초과: " + count1);

        //ㅅ트르임을 이용한결고가
        long count2 = englishNames.stream().filter(name -> name.length() > 5).count();//카운트를 롱타입으로 나온다.
        System.out.println(count2);


    }
}
//필터와 맵의 차이는