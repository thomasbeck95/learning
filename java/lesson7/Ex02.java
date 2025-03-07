package lesson7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Ex02 {
    // int[][] A = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}; // 2D array
    public static void main(String[] args) {
        int[][] A = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int max = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                   int item = A[i][j];
                   if (item > max) {
                       max = item;
                   }
            }
        }

        System.out.println(max);
    }
}
