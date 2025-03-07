package lesson8;

import java.util.Arrays;

public class Ex01 {
    // # Write a program to shift every element of a list to circularly right. E.g.-
// # INPUT : 1 2 3 4 5
// # OUTPUT : 5 1 2 3 4

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int temp = arr[arr.length - 1];


        for (int i = arr.length - 1 ; i > 0 ; i-- ){
            arr[i] = arr[i - 1];
        }
        arr[0] = temp;
        System.out.println(Arrays.toString(arr));
    }
}
