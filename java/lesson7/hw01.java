package lesson7;

// # 1.
// # Take 10 integer inputs from user and print the following:
// # list of positive numbers
// # list of negative numbers
// # list of odd numbers
// # list of even numbers
// # list of 0s.

import java.util.Arrays;
import java.util.Scanner;

public class hw01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[10];
        int countPos = 0;
        int countNeg = 0;
        int countOdd = 0;
        int countEven = 0;
        int countZero = 0;


        for (int i = 0 ; i < arr.length; i++) {
            int value = Integer.valueOf(in.nextLine());
            arr[i] = value;
        }

        for (int i = 0; i < arr.length; i++) {
            boolean isPos = arr[i] >= 0;
            boolean isEven = arr[i] % 2 == 0;
            boolean isZero = arr[i] == 0;

            if (isPos) {
                countPos++;
            } else {
                countNeg++;
            }

            if (isEven) {
                countEven++;
            } else {
                countOdd++;
            }

            if (isZero) {
                countZero++;
            }
        }

            int[] arrPos = new int[countPos];
            int[] arrNeg = new int[countNeg];
            int[] arrZero = new int[countZero];
            int[] arrOdd = new int[countOdd];
            int[] arrEven = new int[countEven];

        countPos = 0;
        countNeg = 0;
        countOdd = 0;
        countEven = 0;
        countZero = 0;


        for (int i = 0; i < arr.length; i++) {
            boolean isPos = arr[i] >= 0;
            boolean isEven = arr[i] % 2 == 0;
            boolean isZero = arr[i] == 0;

            if (isPos) {
                arrPos[countPos] = arr[i];
                countPos++;
            } else {
                arrNeg[countNeg] = arr[i];
                countNeg++;
            }

            if (isEven) {
                arrEven[countEven] = arr[i];
                countEven++;
            } else {
                arrOdd[countOdd] = arr[i];
                countOdd++;
            }

            if (isZero) {
                arrZero[countZero] = arr[i];
                countZero++;
            }
        }

        System.out.println(Arrays.toString(arrEven));
        System.out.println(Arrays.toString(arrOdd));
        System.out.println(Arrays.toString(arrPos));
        System.out.println(Arrays.toString(arrNeg));
        System.out.println(Arrays.toString(arrZero));
    }
}
