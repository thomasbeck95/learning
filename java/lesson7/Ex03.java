package lesson7;

public class Ex03 {
    public static void main(String[] args) {
        int[][] A = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int sumRow = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sumRow+= A[i][j];
            }
            System.out.println("Row sum =" + sumRow);
            sumRow = 0;
        }
    }
}
