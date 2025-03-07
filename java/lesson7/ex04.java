package lesson7;


// # Write a program to segregate the odd
// # and the even number from a list and add them to 2 different lists. Print these 2 new lists
// # Sample list: [1, 2, 3, 4, 5, 6, 7, 8, 9]
// # Sample Output:
// # Even numbers
// # [2,4,6,8]
// # Odd numbers
// # [1,3,5,7,9]

import java.util.ArrayList;
import java.util.Arrays;

public class ex04 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int countEven = 0;
        int countOdd = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                countEven++;
            } else {
                countOdd++;
            }
        }

        int[] arrEven = new int[countEven];
        int[] arrOdd = new int[countOdd];

        int indexEven = 0;
        int indexOdd = 0;

        for (int a : arr) {
            if (a % 2 == 0) {
                arrEven[indexEven] = a;
                indexEven++;
            } else {
                arrOdd[indexOdd] = a;
                indexOdd++;
            }
        }

        System.out.println(Arrays.toString(arrEven));
        System.out.println(Arrays.toString(arrOdd));
    }
}
