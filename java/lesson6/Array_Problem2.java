package lesson6;

import java.util.ArrayList;
import java.util.Scanner;

public class Array_Problem2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Scanner in = new Scanner(System.in);

        while (true) {
            String value = in.nextLine();
            if (value.equals("q")) {
                break;
            }
            list.add(value);
        }

        System.out.println(list);
    }
}
