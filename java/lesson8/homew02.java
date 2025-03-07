package lesson8;

import java.util.Scanner;

public class homew02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;

        while (true) {
            String line = in.nextLine();

            if (line.equals("q")) {
                break;
            }
            int value = Integer.parseInt(line);
            sum += value;
        }
        System.out.println(sum);
    }
}
