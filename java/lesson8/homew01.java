package lesson8;

public class homew01 {
    //# Write a function to check if a number is prime or not.
    public static void main(String[] args) {
        System.out.println(isPrime(4));
    }

    public static boolean isPrime(int num) {
        if (num == 1) {
            return false;
        }
        for (int i = num - 1; i >1; i-- ) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
