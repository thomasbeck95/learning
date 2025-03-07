package lesson6;

import java.util.Arrays;
import java.util.Scanner;

public class Array6 {
    public static void main(String[] args) {
        int[][] arr1 = new int[2][3];
        int[][] arr2 = new int[2][3];
        int[][] arr3 = new int[2][3];

        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j ++) {
                arr1[i][j] = Integer.valueOf(in.nextLine());
            }
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j ++) {
                arr2[i][j] = Integer.valueOf(in.nextLine());
            }
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j ++) {
                arr3[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        System.out.println(Arrays.deepToString(arr3));
    }
}
