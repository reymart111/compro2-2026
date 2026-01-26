import java.util.Scanner;

public class act2 {

    // Problem 1: Sum Elements by Column
    public static double sumColumn(double[][] m, int columnIndex) {
        double sum = 0;

        for (int row = 0; row < m.length; row++) {
            sum += m[row][columnIndex];
        }

        return sum;
    }

    // Problem 2: Sum the Major Diagonal
    public static double sumMajorDiagonal(double[][] m) {
        double sum = 0;

        for (int i = 0; i < m.length; i++) {
            sum += m[i][i];
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[][] matrix1 = new double[3][4];

        System.out.println("Enter a 3-by-4 matrix row by row:");
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                matrix1[i][j] = input.nextDouble();
            }
        }

        for (int col = 0; col < matrix1[0].length; col++) {
            System.out.println("Sum of the elements at column " + col +
                    " is " + sumColumn(matrix1, col));
        }

        double[][] matrix2 = new double[4][4];

        System.out.println("Enter a 4-by-4 matrix row by row:");
        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2[i].length; j++) {
                matrix2[i][j] = input.nextDouble();
            }
        }

        System.out.println("Sum of the elements in the major diagonal is "
                + sumMajorDiagonal(matrix2));

        input.close();
    }
}
