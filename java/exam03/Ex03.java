//
//import java.io.FileWriter;
//import java.io.PrintWriter;
//import java.nio.file.Paths;
//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class Ex03 {
//    public static void main(String[] args) {
//        String keyword = args[0];
//        String fileName = args[1];
//
//        try {
//            FileWriter file = new FileWriter("text.txt");
//            PrintWriter out = new PrintWriter(file);
//            Scanner in = new Scanner(Paths.get(fileName));
//
//            while (in.hasNextLine()){
//                String line = in.nextLine();
//                if (line.contains(keyword)) {
//                    out.println(line);
//                }
//            }
//            out.close();
//
//        } catch (Exception e) {
//
//        }
//
//    }
//
//    public static void reverse(){
//
//        Scanner in = new Scanner(System.in);
//        System.out.println("PLEASE ENTER TEXT. ENTER A BLANK LINE WHEN YOU ARE FINISHED:");
//
//        ArrayList<String> list = new ArrayList<>();
//        while (true) {
//            String line = in.nextLine();
//
//            if (line.equals("")){
//                break;
//            }
//
//            list.add(line);
//        }
//
//        System.out.println("YOUR INPUT REVERSED: ");
//        for (String line: list) {
//            StringBuffer buff = new StringBuffer(line);
//            System.out.println(buff.reverse());
//        }
//    }
//}
