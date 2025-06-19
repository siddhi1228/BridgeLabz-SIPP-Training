package methods;

import java.util.*;

public class Ques28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[][] scores = generateScores(n);
        double[][] results = calculateResults(scores);

        System.out.println("Physics\tChemistry\tMath\tTotal\tAverage\tPercentage");
        for (int i = 0; i < n; i++) {
            for (int val : scores[i]) System.out.print(val + "\t");
            for (double val : results[i]) System.out.print(Math.round(val * 100.0) / 100.0 + "\t");
            System.out.println();
            sc.close();
        }
    }

    public static int[][] generateScores(int n) {
        int[][] scores = new int[n][3];
        Random rand = new Random();
        for (int i = 0; i < n; i++)
            for (int j = 0; j < 3; j++)
                scores[i][j] = 40 + rand.nextInt(60); // 40 to 99
        return scores;
    }

    public static double[][] calculateResults(int[][] scores) {
        double[][] results = new double[scores.length][3]; // total, avg, %
        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            results[i][0] = total;
            results[i][1] = total / 3.0;
            results[i][2] = (total / 300.0) * 100;
        }
        return results;
    }
}
