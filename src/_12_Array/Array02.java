package _12_Array;

public class Array02 {
    public static void main(String[] args) {
        // 배열 순회
//      //  String[] countries = {"a", "b", "c", "d", "e"};
//        // 반복문(for) 순회
//        for (int i = 0; i < 5; i++) {
//            System.out.println(countries[i]); //i가 01234이렇게 도니까 순회를 하면서 출력해준다.
//        }
//
//        //반복문(for)순회하는데 배열길이
//        for (int i = 0; i < countries.length; i++) {
//            System.out.println(countries[i]); //이렇게 하면 배열의 길이를 안세도 된다.
//        }
//        //enhanced for (for-each) /향상된 for문
//        for (String country : countries) {
 //           System.out.println(country);
//        }

        //본인이 좋아하는 음식 5가지 배열에 저장하고
        //향상된 for문을 이용해서 출력해보기
        //내가 좋아하는 음식 1번: ***
        //내가 좋아하는 음식 1번: ***
        String[] foods = {"a", "b", "c", "d", "e"};
        int i = 0;
        for (String food : foods) {
            i++;
           System.out.println("내가 좋아하는 음식 " + i + "번" + food);
        }





    }
}

