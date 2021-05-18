package lesson3;
import java.util.Arrays;
import java.util.Scanner;

public class FibonaciNumber {
    public static int findFibonacciNumber(int n)
    {
        int f0 = 0;
        int f1 = 1;
        int fn = 1;

        if (n < 0) {
            return -1;
        } else if (n == 0 || n == 1) {
            return n;
        } else {
            for (int i = 2; i < n; i++) {
                f0 = f1;
                f1 = fn;
                fn = f0 + f1;
            }
        }
        return fn;
    }
    public void isFibonacciLessOneHundred()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập m = ");
        int m = scanner.nextInt();
        System.out.printf("số fibonacci nhỏ hơn %d là: \n", m);
        for (int i=0; i<m;i++)
        {
            {
                if(findFibonacciNumber(i)<m) {
                    System.out.print(findFibonacciNumber(i) + " ");
                }
                else return;

            }


        }

    }
    public void isFibonacci()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập n = ");
        int n = scanner.nextInt();
        System.out.printf("%d số fibonacci đầu tiên là: \n", n);
        for (int i=0; i<n;i++)
        {
            {
                System.out.print(findFibonacciNumber(i) + " ");

            }


        }

    }



}
