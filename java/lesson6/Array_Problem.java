package lesson6;
import java.util.Arrays;
import java.util.ArrayList;

public class Array_Problem {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,5,6,7,8,9));
        ArrayList<Integer> arr_odd = new ArrayList<Integer>();
        ArrayList<Integer> arr_even = new ArrayList<Integer>();

        for (int n : arr) {
            if (n % 2 == 0) {
                arr_even.add(n);
            } else {
                arr_odd.add(n);
            }
        }
        System.out.println(arr_even);
        System.out.println(arr_odd);
    }
}
