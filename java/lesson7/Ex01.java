package lesson7;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        // Create a 2d array of size 2*3. Take user input for each index.
// Search for value -1 in the 2d array, if it exists print "2d array contains -1"
// else print "2d array doesn't contain -1"
        // In the above problem also print the count the numbers which are -1



        int[][] arr = new int[2][3];
        Scanner in = new Scanner(System.in);
        boolean found_i = false;
        int count_i = 0;

        for (int i = 0; i < 2 ; i++) {
            for (int j = 0 ; j < 3; j++) {
                int value = Integer.valueOf(in.nextLine());
                arr[i][j] = value;
            }
        }
            for (int[] ar : arr) {
                for (int a : ar) {
                    if (a == -1) {
                        found_i = true;
                        count_i++;
                    }
                }
            }
            if(found_i == true) {
                System.out.println("found -1: " + count_i);
            } else {
                System.out.println("no -1");
            }
    }
}
