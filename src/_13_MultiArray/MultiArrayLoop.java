package _13_MultiArray;

public class MultiArrayLoop {
    public static void main(String[] args) {
        //다차원 배열의 순회
//        String[][] seats = new String[][]
//                {
//                        {"A1", "A2", "A3", "A4", "A5"},
//                        {"B1", "B2", "B3", "B4", "B5"},
//                        {"C1", "C2", "C3", "C4", "C5"}
//                };
//        for (int i = 0; i < 3; i++) {  //행부터 도는데 3개니까
//            for (int j = 0; j < 5; j++) {  //열
//                System.out.print(seats[i][j] + " ");
//            }
//            System.out.println(); //개행
//        }
//        for (int i = 0; i < seats.length; i++) {
//            for (int j = 0; j < seats[i].length; j++) {
//                System.out.print(seats[i][j] + " ");
//            }
//            System.out.println();
//            };

//        String[][] seats2 = {
//                {"A1", "A2", "A3"},
//                {"B1", "B2", "3B"},
//                {"C1", "C2", "C3", "C4", "C5"}
//        };
//        for (int i = 0; i < seats2.length; i++) {
//            for (int j = 0; j < seats2[i].length; j++) {
//                System.out.print(seats2[i][j] + " ");
//            }
//            System.out.println();
//        }

        //아이맥스 영화관
        //세로 10칸 가로 15칸
//        String[][] imaxSeats = new String[10][15];
//        String[] eng = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};
//            for (int i = 0; i < imaxSeats.length; i++) {
//                for (int j = 0; j < imaxSeats[i].length; j++) {
//                    imaxSeats[i][j] = eng[i] + (j + 1);
//                }
//                System.out.println();
//            }
//
//            imaxSeats[3][7] = "__";
//            imaxSeats[5][3] = "__";
//            imaxSeats[7][5] = "__";
//            imaxSeats[7][6] = "__";



            //다차원 배열 합 구하기
        //3x3크기 1부터 홀수 차례대로 넣고 출력해서 확인 후 총합 구하기
//        String[][] mul = new String[3][3];
//                String[] num = {"1", "3", "5"};
//        for (int i = 0; i < mul.length; i++) {
//            for (int j= 0; j < mul[i].length; j++) {
//                System.out.print(mul[i][j] + " ");
//            }
//            System.out.println();
//        }

        int[][] arr = new int[3][3];
        int num = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = num;
                num += 2;
            }
        }






        //각 행 합, 각 열 합, 전체 합
        int[][] a = {
                {1, 2, 3},
                {4, 5, 6}
        };
        int n = a.length;
        int m = a[0].length;
        int [] rowSum = new int[n];
        int [] colSum = new int[m];
        int total = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
            }
        }



        //A+B, A-B 값 구하기
        int[][] A = {{1, 2}, {3, 4}};
        int[][] B = {{5, 6}, {7, 8}};










    }
}
