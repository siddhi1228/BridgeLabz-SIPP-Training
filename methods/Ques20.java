package methods;

import java.util.Scanner;

public class Ques20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        if (year < 1582) {
            System.out.println(" Year must be >= 1582.");
        } else {
            boolean isLeap = isLeapYear(year);
            System.out.println(year + (isLeap ? " is a Leap Year." : " is not a Leap Year."));
        sc.close();
        }
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
