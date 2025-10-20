package _12_Array;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Array03 {
    public static void main(String[] args) {
         //정렬
//        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9}; //순회하지않고 전체를 출력하기
//        System.out.println(Arrays.toString(nums));
//
//        //sort()
//        Arrays.sort(nums); // 오름차순 정렬
//        System.out.println(Arrays.toString(nums));
//
//
//        //내림차순 정렬인것처럼
//        //근데 사실은 오름차순을 그냥 역순화한 것
//        //12345만 자리만 바꿔주면 되니 반만 반복이 되면 되니까
//        for (int i = 0; i < nums.length / 2; i++) { //이러면 반만 돈다.
//        int temp = nums[i]; // 1을 temp에 담아 둔다.
//        nums[i] = nums[nums.length - i - 1];
//        nums[nums.length -i -1] = temp;
//        }
//        System.out.println(Arrays.toString(nums));
//
//        //
//        /*Inter[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//         * */
//
//        //내림차순
//        Arrays.sort(nums, Comparator.reverseOrder());
//        //Comparator.reverseOrder()는 Interger이여야 한다.
//        System.out.println(Arrays.toString(nums));
//
//        /*
//        * int와 Integer는 같지 않다. 같은 정수 타입을 사용하긴 하나 int는 primitive type 즉 원시적인 자료형
//        * Integer는 클래스로 이루어져 있으면 Wrapper Class
//        * 같은 정수지만 int는 연산만 가능한 반명 Integer는 다양한 기능을 사용할 수 있다.
//        * 그래서 double은 Double, float - Float등등 존재한다.
//        * */


//        //문제 평균 구하기
//        int sum = 0; //총합을 저장하기 위한 변수
//        float average = 0F; //평균을 저장하기 위한 변수
//        int[] scores = {100, 88, 100, 100, 90};
//
//        for (int i = 0; i < scores.length; i++) {
//            sum += scores[i];
//        }
//        average = sum/(float) scores.length;
//
//        System.out.println("총합: " + sum);
//        System.out.println("평균: " + average);
//
//        for(int score : scores) {
//            sum += score;
//        }
//
//        //최대, 최솟값 구하기
//        int[] scores2 = {79, 88, 34, 54, 34, 97, 23, 12};
//
//        int max = scores2[0]; //배열의 첫 번째 값으로 최대값을 초기화
//        int min = scores2[0]; //배열의 첫 번째 값으로 최솟값을 초기화
//
//        for (int i = 1; i < scores2.length; i++) {
//            if (scores2[i] > max) {
//                max = scores2[i];
//            } else if (scores2[i] < min) {
//                min = scores2[i];
//            }
//        }
//        System.out.println();
//        System.out.println("최댓");


//        //요일 출력
//        char[] weeks = {'월', '화', '수', '목', '금', '토', '일'};
//        //1 ~ 7까지 숫자를 입력받아서 요일을 출력하도록
//        //범위를 벗어나면 잘못입력하셨습니다. 출력
        Scanner scanner = new Scanner(System.in);
//        System.out.println("1 ~ 7까지 숫자 입력: ");
//        int num = scanner.nextInt();
//        for (int i = 0; i < weeks.length; i++) {
//            if (num >= 1 && num <= 7) {
//                System.out.println(weeks[num - 1]);
//            } else {
//                System.out.println("잘못 입력하셨습니다.");
//            }
//

            //값 target이 처음 나타나는 인덱스를 찾고, 없으면 -1을 출력하기
            //찾을 target은 1 ~ 10까지 입력받기
            int[] a = {4, 2, 7, 2, 3, 6, 4};
            System.out.print("찾을 숫자를 입력하세요");
            int target = scanner.nextInt();
            int idx = -1;
            for (int i = 0; i < a.length; i++) {
                if (a[i] == target) {
                    idx = i;
                    break;
                }
            }
            System.out.println("찾는 인덱스: " + idx);
        }
    }

