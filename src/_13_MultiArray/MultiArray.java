package _13_MultiArray;

public class MultiArray {
    public static void main(String[] args) {
        //다 차원 배열(2차원)

        //영화관 좌석
        //A1 ~ A15
        //B1 ~ B15
        //C1 ~ C15
        String[] seatA = {"A1", "A2", "A3", "A4", "A5"};
        String[] seatB = {"B1", "B2", "B3", "B4", "B5"};
        String[] seatC = {"C1", "C2", "C3", "C4", "C5"};

        //2차원 배열 선언 => 3 X 5
        String[][] seats = new String[][]
        {
            {"A1", "A2", "A3", "A4", "A5"},
            {"B1", "B2", "B3", "B4", "B5"},
            {"C1", "C2", "C3", "C4", "C5"}
        };
        //B3 접근
        System.out.println(seats[1][2]);
        //C4 접근
        System.out.println(seats[2][3]);

        //첫줄게 3칸, 두번 째 줄 4칸, 세번째 줄5칸
        String[][] seats2 = {
                {"A1", "A2", "A3"},
                {"B1", "B2", "3B"},
                {"C1", "C2", "C3", "C4", "C5"}
        };
        System.out.println(seats2[0][4]);

        String[][][] multiArray = new String[][][]{
                {{}, {}, {}},
                {{}, {}, {}},
                {{}, {}, {}}
        };
    }
}
