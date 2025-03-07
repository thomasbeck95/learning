package lesson7;

// # 1.
// # Take 10 integer inputs from user and print the following:
// # list of positive numbers
// # list of negative numbers
// # list of odd numbers
// # list of even numbers
// # list of 0s.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class hw01b {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> arrPos = new ArrayList<>();
        ArrayList<Integer> arrEven = new ArrayList<>();
        ArrayList<Integer> arrNeg = new ArrayList<>();
        ArrayList<Integer> arrOdd = new ArrayList<>();
        ArrayList<Integer> arrZero = new ArrayList<>();

        while (true) {
            String line = in.nextLine();
            if (line.equals("")) {
                break;
            }
            int value = Integer.valueOf(line);
            arr.add(value);
            if (value % 2 == 0) {
                arrEven.add(value);
            } else {
                arrOdd.add(value);
            }
            if (value >= 0) {
                arrPos.add(value);
            } else {
                arrNeg.add(value);
            }
            if (value == 0) {
                arrZero.add(value);
            }
        }

        System.out.println(arr.toString());
        System.out.println(arrEven);
    }
}
