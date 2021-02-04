package day8;

public class task1_1 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        String str = "";
        for (int i = 0; i < 20001; i++) {
            str += i + " ";
        }
        System.out.println(str);
        long finish = System.currentTimeMillis();
        long timeConsumedMillis = finish - start;
        System.out.printf("Execution time: %d milliseconds", timeConsumedMillis);
    }
}
