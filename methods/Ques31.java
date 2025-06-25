package methods;

import java.util.*;

public class Ques31 {
    public static void main(String[] args) {
        int[] otps = new int[10];
        for (int i = 0; i < 10; i++) {
            otps[i] = generateOTP();
            System.out.println("OTP " + (i + 1) + ": " + otps[i]);
        }

        if (isUnique(otps)) {
            System.out.println("All OTPs are unique.");
        } else {
            System.out.println("Some OTPs are duplicates.");
        }
    }

    public static int generateOTP() {
        return 100000 + (int)(Math.random() * 900000); // 6-digit OTP
    }

    public static boolean isUnique(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            if (!set.add(num)) return false;
        }
        return true;
    }
}

