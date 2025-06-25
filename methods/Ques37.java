package methods;

import java.util.*;

public class Ques37 {
    public static void main(String[] args) {
        int[][] matrix2x2 = generateMatrix(2, 2);
        System.out.println("Matrix:");
        printMatrix(matrix2x2);

        System.out.println("Transpose:");
        printMatrix(transpose(matrix2x2));

        int det2 = determinant2x2(matrix2x2);
        System.out.println("Determinant (2x2): " + det2);

        if (det2 != 0) {
            double[][] inv = inverse2x2(matrix2x2);
            System.out.println("Inverse:");
            printMatrix(inv);
        } else {
            System.out.println("Inverse not possible (Det = 0)");
       
        }
    }

    public static int[][] generateMatrix(int r, int c) {
        int[][] mat = new int[r][c];
        Random rand = new Random();
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                mat[i][j] = rand.nextInt(10);
        return mat;
    }

    public static int[][] transpose(int[][] mat) {
        int[][] result = new int[mat[0].length][mat.length];
        for (int i = 0; i < mat.length; i++)
            for (int j = 0; j < mat[0].length; j++)
                result[j][i] = mat[i][j];
        return result;
    }

    public static int determinant2x2(int[][] mat) {
        return mat[0][0] * mat[1][1] - mat[0][1] * mat[1][0];
    }

    public static double[][] inverse2x2(int[][] mat) {
        double det = determinant2x2(mat);
        double[][] result = new double[2][2];
        result[0][0] = mat[1][1] / det;
        result[0][1] = -mat[0][1] / det;
        result[1][0] = -mat[1][0] / det;
        result[1][1] = mat[0][0] / det;
        return result;
    }

    public static void printMatrix(int[][] mat) {
        for (int[] row : mat) {
            for (int val : row) System.out.print(val + "\t");
            System.out.println();
        }
    }

    public static void printMatrix(double[][] mat) {
        for (double[] row : mat) {
            for (double val : row) System.out.printf("%.2f\t", val);
            System.out.println();
        }
    }
}

