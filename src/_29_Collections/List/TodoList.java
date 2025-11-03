//package _29_Collections.List;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;
//import java.util.Scanner;
//
//public class TodoList {
//    public static void main(String[] args) {
//        /*문제 TodoList
//         * 1. todolist를 담을 리스트 생성
//         * 2. 사용자한테 투두를 입력받을건데 몇개 입력할건지 count변수에 입력받기
//         * 3. count만큼 반복해서 사용자에게 투두를 입력받아 리스트에 추가
//         * 4. 그 다음 향상된 for문 사용해서 할 일 목록 쭉 출력
//         * 5. 목록 출력 뒤 특정 투두를 포함여부를 확인하기 위해서 searchTodo라는 변수에
//         * 찾을 투두 입력받기 그리고 포함여부 확인 후 여부 출력
//         * 6. 포함여부 확인 후 삭제할 투두를 입력받아 삭제하기
//         * 7. 투두들을 오름차순 정렬 후 전체 출력
//         * 8. 이번엔 투두들을 내림차순 정렬 후 전체 출력
//         * 9. 전체 투두들의 갯수 출력하기
//         * */
//        Scanner scanner = new Scanner(System.in);
//        List<String> strList1 = new ArrayList<>();
//
//
//        System.out.println("할 일을 몇 개 입력 하시겠습니까?: ");
//        int count = scanner.nextInt();
//
//        for (int i = 0; i < count; i++) {
//            System.out.println((i + 1) + "번쨰 할 일을 입력하세요: ");
//            String todo = scanner.nextLine();
//            todoList.add(todo);
//        }
//        for(String todo : todoList) {
//            System.out.println(" - " + todo);
//        }
//
//        System.out.println("포함 여부를 확인할 할 일을 입력하세요: ");
//        String searchTodo = scanner.nextLine();
//        boolean contains = todoList.contains(searchTodo);
//        System.out.println("-> " + searchTodo + "포함 여부: " + contains);
//
//        System.out.println("삭제할 일을 입력하세요: ");
//        String deleteTodo = scanner.nextLine();
//        boolean removed = todoList.remove(deleteTodo);
//        System.out.println(" -> " + deleteTodo + "삭제 성공");
//
//        Collections.sort(strList1);
//        System.out.println("정렬된 할 일 목록: " + strList1);
//        strList1.sort(Collections.reverseOrder());
//        System.out.println(strList1);
//
//        System.out.println("총 할 일 수: " + todoList.size());
//    }
//}
