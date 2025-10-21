package _14_Method;

public class MethodEx {

    public static int max(int a, int b, int c){
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;

        }
        return max;
    }
   public static boolean isEven(int num) {
//        if (num % 2 ==0) {
//            return true;
//        }
//        return false;
        return num % 2 == 0; //같으면 true 틀리면 false
    }
    public static int abs(int n) {//
         //어떻게 해야 절댓값 구할수 있을지
         return n < 0 ? -n : n; //n이 참이면 음수
    }

    public static boolean contains(int[] a, int target) {  // contains는 1. 배열 2. 찾고자 하는 숫자 정수 가들어간다.
        //a라는 배열안에 target가 들어있는지 확인해야 하니 for 문 돌리는데
        for (int i = 0; i < a.length; i++) { //a의 배열의 길이만큼 돌려야 하니
            if (a[i] == target) { //안의 내용이 if의 요소가 target이랑 같은데 있으면 return true; 없으면 return false.
                //안만났다는 뜻은 없다는 뜻이니까 다 돌아도 아우밍ㄹ도 일어나지 않고 return false로랃ㄴ다.
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        //최댓값 구하기 (세 수를 전달)
        //max(3, 7, 5) => 7










        //홀짝 판단
        //isEven(8) => 짝수면 true, 홀수면 false
        System.out.println(isEven(8)); //8은 짝수니까 true가 나온다.


        //삼항연산자 이용해서 절댓값 구하기sou
        System.out.println(abs(8));


        //포함 여부 (선형탐색)
        //contains([1, 3, 5], 3) => true, 없으면 false
        //배열안에 찾고자 하는 숫자가 있으면 true없으면 false
        int[] nums = {1, 3, 7, 9};
        System.out.println(contains(nums, 7)); //nums에 7이 있어서 트루가 나온다. 8넣으면 false





    }
}
