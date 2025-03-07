
import java.util.Arrays;
import java.util.stream.IntStream;

public class Ex02 {
    public static void main(String[] args) {
        System.out.println("Arg index 0:" + args[0]);
        System.out.println("Arg index 1: " + args[1]);
        int[] nums = {3,5,7,9,10};
        int sum = IntStream.of(nums).sum();

        System.out.println(sum);
    }
}