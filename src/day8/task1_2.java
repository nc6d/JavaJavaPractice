package day8;

public class task1_2 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        StringBuilder str = new StringBuilder();
        for (int i = 0; i < 20001; i++) {
            str.append(i).append(" ");
        }
        System.out.println(str);
        long finish = System.currentTimeMillis();
        long timeConsumedMillis = finish - start;
        System.out.printf("Execution time: %d milliseconds", timeConsumedMillis);
    }
}
