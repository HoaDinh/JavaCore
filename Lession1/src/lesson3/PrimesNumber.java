package lesson3;
import java.util.Scanner;
import java.lang.Math;

public class PrimesNumber {

        public boolean isPrimeNumber(int n) {

            // so nguyen n < 2 khong phai la so nguyen to
            if (n < 2) {
                return false;
            }
            // check so nguyen to khi n >= 2
            int squareRoot = (int) Math.sqrt(n);
            for (int i = 2; i <= squareRoot; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;

    }

    public boolean isPrimeNumberlessOnehundred(int n) {

        // so nguyen n < 2 khong phai la so nguyen to
        if (n < 2) {
            return false;
        }
        // check so nguyen to khi n >= 2
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;

    }
}
