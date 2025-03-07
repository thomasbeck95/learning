package lesson5;
import java.util.*;
import java.nio.file.Paths;

public class TextRead {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Cmd line argument required");
            return;
        }
        String name = args[0];
        try {
            Scanner in = new Scanner(Paths.get(name));
            while (in.hasNextLine()) {
                System.out.println(in.nextLine());
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
