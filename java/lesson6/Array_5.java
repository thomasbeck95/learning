package lesson6;

import java.util.Scanner;

public class Array_5 {
    public static void main(String[] args) {
        String[][] arr = new String[2][3];

        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j ++) {
                arr[i][j] = in.nextLine();
            }
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j ++) {
                System.out.println(arr[i][j]);
            }
        }
    }
}
