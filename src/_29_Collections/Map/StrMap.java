package _29_Collections.Map;

import java.util.*;

public class StrMap {
    public static void main(String[] args) {
        /*
        * Map - 키(Key) / 값(Value)의 쌍으로 이루어진 데이터들의 집합
        * Key는 중복될 수 없고, value는 중복이 가능하다.
        * Key값은 고유해야하고 value는 상관없다.
        * */
        Map<String, String> strMap1 = new HashMap<>();

        strMap1.put("kor2025001", "김영환");//Integer로하면 put괄호 안에는 인티저가 들어간다.
        strMap1.put("kor2025002", "김영환");
        strMap1.put("kor2025003", "김영환");
        strMap1.put("kor2025004", "김영환");
        strMap1.put("kor2025005", "김영환");

        System.out.println(strMap1);

        //Map은 순회를 직접적으로 할 수 없다. => 직접 foreach를 돌릴 수 없다.
        //왜냐하면 순회하기 위해서는 Iterable이라는 인터페이스를 구현한 클래스여야 하는데
        //Collection은 Iterable 인터페이스를 상속받고 Map이 이것으로 구현이 되어있어야 하는데
        //그렇지 않음
        //그럼에도 순회하려면 다른 방법을 사용해야함
        System.out.println(strMap1.keySet()); //세트인데 키들로만 되서 출력된다.순서도 없다. 키만 => set형태로 변환
        System.out.println(strMap1.entrySet());// 세트이면서 키벨류 한쌍 씩 가지고 온다. 키 값 전체를 set형태로 반환
        List<String> keyList = new ArrayList<>(strMap1.keySet());
        Collections.sort(keyList);
        for (String key : strMap1.keySet()) {
            System.out.println("키: " + key + ", 값: " + strMap1);
        }

        for (Map.Entry<String, String> entry : strMap1.entrySet()) {
            System.out.println(entry.getKey());//키들만 나온다. value하면 값들만 나온다.
            System.out.println("[Entry]" + entry.getKey() + " => " + entry.getValue());
        }
        strMap1.put("kor2025005", "김영환"); //같은키를 써서 수정하면 키가 새로 수정된다.
        //Map의 특징 중 하나로 하나의 Key에는 하나의 value만 가능
        //만약에 key가 동일하게 들어간다면 Value값은 최신 것으로 덮어쓰기 된다.

        strMap1.replace("kor2025002", "아아아"); //그럼 아아아로 바뀐다.


        //특정 키의 존재 여부를 아는 방법
        boolean searchKeyFlag1 = strMap1.containsKey("kor2025006");
        System.out.println(searchKeyFlag1);

        //특정 값의 존재 여부
        boolean searchValueFlag2 = strMap1.containsValue("김영환");
        System.out.println(searchValueFlag2);

        Set<Map.Entry<String, String>> entrySet1 = new HashSet<>(strMap1.entrySet());
        System.out.println(entrySet1);
        List<Map.Entry<String, String>> entryList = new ArrayList<>(entrySet1);
        System.out.println(entryList);

        //Map은 정렬이 불가능하지만 가능하게 해보기
        //Map은 빠른 탐색 및 검색을 위해 만들어진(설계된) 것 이기 때문에 그래서 정렬은 고려하지 않고 만듦 => 그래서 순서도 보장하지 않는다.
        //그럼에도 정렬할려면 이렇게 해야한다.
        Collections.sort(entryList, Map.Entry.comparingByValue());
        System.out.println("값 기준 정렬: " + entryList); //리슽트로 정렬하는거지만 값기준이나 키기준으로 정렬이 가능하다.
        Collections.sort(entryList, Map.Entry.comparingByKey());
        System.out.println("키 기준 정렬: " + entryList);
        Collections.sort(entryList, Map.Entry.comparingByKey(Comparator.reverseOrder()));
        System.out.println("키 기준 내림차순 정렬: " + entryList);

    }
}
