package lesson6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Array_Problem3 {
    public static void main(String[] args) {
        System.out.println(max(1,2,3,4));
    }

    public static int max(int a, int b, int c, int d) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(a,b,c,d));
        return Collections.max(list);
    }
}
