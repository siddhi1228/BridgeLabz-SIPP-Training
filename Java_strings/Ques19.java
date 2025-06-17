package Java_strings;

import java.util.*;

public class Ques19 {

    static int[][] randomPCM(int students) {
        Random rnd = new Random();
        int[][] pcm = new int[students][3];
        for (int i = 0; i < students; i++)
            for (int j = 0; j < 3; j++)
                pcm[i][j] = 40 + rnd.nextInt(61); // 40‑100
        return pcm;
    }

    static double round2(double v) { return Math.round(v * 100) / 100.0; }

    static Object[][] buildReport(int[][] pcm) {
        Object[][] rep = new Object[pcm.length][7];
        for (int i = 0; i < pcm.length; i++) {
            int total = pcm[i][0] + pcm[i][1] + pcm[i][2];
            double avg = total / 3.0;
            double perc = round2(total / 3.0);
            char grade = perc >= 90 ? 'A' :
                         perc >= 75 ? 'B' :
                         perc >= 60 ? 'C' :
                         perc >= 40 ? 'D' : 'F';

            rep[i][0] = pcm[i][0];
            rep[i][1] = pcm[i][1];
            rep[i][2] = pcm[i][2];
            rep[i][3] = total;
            rep[i][4] = round2(avg);
            rep[i][5] = perc;
            rep[i][6] = grade;
        }
        return rep;
    }

    public static void main(String[] args) {
        int[][] pcm = randomPCM(5);          // 5 students
        Object[][] rep = buildReport(pcm);

        System.out.printf("Phy Chem Math Total Avg  %%   Grade%n");
        System.out.println("--------------------------------------");
        for (Object[] r : rep)
            System.out.printf("%-4d %-4d %-4d %-5d %-5.2f %-5.2f %c%n",
                              r[0], r[1], r[2], r[3], r[4], r[5], r[6]);
    }
}

