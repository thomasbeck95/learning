package lesson6;

public class Array_Problem4 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        for (int i = 0 ; i < 5; i++ ) {
            arr[i] = (i+ 1) * (i+1);
        }

        for (int n : arr) {
            System.out.println(n);
        }
    }
}
