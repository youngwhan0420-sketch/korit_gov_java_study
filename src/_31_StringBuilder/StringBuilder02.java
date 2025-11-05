package _31_StringBuilder;

public class StringBuilder02 {
    public static void main(String[] args) {
        final int lengths = 50000;

        long startTime1 = System.currentTimeMillis(); //시작

        String str = "";
        for(int i = 0; i < lengths; i++) {
            str = str + "*";
        }

        long endTime1 = System.currentTimeMillis(); //끝
        long duration1 = endTime1 - startTime1;


        //StringBuffer
        long startTime2 = System.currentTimeMillis();//시작

        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < lengths; i++) {
            sb.append("*");
        }

        long endTime2 = System.currentTimeMillis(); //끝
        long duration2 = endTime2 - startTime2;


        //StringBuilder
        long startTime3 = System.currentTimeMillis(); //시작
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < lengths; i++){
            sb2.append("*");
        }

        long endTime3 = System.currentTimeMillis(); //끝
        long duration3 = endTime3 - startTime3;
        System.out.println("String: " + startTime1);
        System.out.println("StringBuffer: " + startTime2);
        System.out.println("StringBuilder: " + startTime1);
    }
}
