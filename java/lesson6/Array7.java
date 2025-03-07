package lesson6;

import java.util.Arrays;
import java.util.Scanner;

public class Array7 {
    public static void main(String[] args) {
        int[][] arr = new int[2][3];
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < 2; i++) {
            for (int j = 0 ; j < 3; j++) {
                int value = Integer.valueOf(in.nextLine());
                if (value >= 0 && value <= 5) {
                    arr[i][j] = -1;
                } else {
                    arr[i][j] = value;
                }
            }
        }
        System.out.println(Arrays.deepToString(arr));
    }
}
