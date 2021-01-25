package day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();

        System.out.println("Rows: ");
        int rows = sc.nextInt();

        int[] array = new int[rows];

        for (int i = 0; i < rows; i++) {
            array[i] = rnd.nextInt(10);
        }

        int maxSum = 0;
        int maxSumIndex = 0;
        for (int i = 0; i < rows - 2; i++) {
            int sum = 0;
            for (int j = i; j < i + 3; j++) {
                sum += array[j];
            }
            if (sum > maxSum) {
                maxSum = sum;
                maxSumIndex = i;
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println(maxSum);
        System.out.println(maxSumIndex);

    }
}
