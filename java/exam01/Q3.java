package exam01;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int value;

    while (true) {
        String line = in.nextLine();
        if (line.equals("")) {
            System.out.println("0-9 please");
        }
        value = Integer.valueOf(line);
        if (value >= 0 && value <= 9) {
            break;
        }
    }

    switch (value){
        case 0:
            System.out.println("zero");
            break;
        case 1:
            System.out.println("one");
            break;
        case 2:
            System.out.println("two");
            break;
        case 3:
            System.out.println("three");
            break;
        case 4:
            System.out.println("four");
            break;
    }

    }
}
