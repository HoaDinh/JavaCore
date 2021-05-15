package lesson3;
import java.util.Scanner;
import java.lang.Math;

public class PrimesNumber {

        public boolean primeNumber(int n) {

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

   public void isPrimeNumber(){
       Scanner scanner = new Scanner(System.in);
       PrimesNumber pri = new PrimesNumber();
       int dem = 0; // đếm số số nguyên tố
       int i = 2;   // tìm số nguyên tố bắt dầu từ số 2
       System.out.print("Nhập n = ");
       int n = scanner.nextInt();
       System.out.printf("%d số nguyên tố đầu tiên là: \n", n);
       while (dem < n) {
           if (primeNumber(i)) {
               System.out.print(i + " ");
               dem++;
           }
           i++;
       }

   }
   public  void isPrimeNumberlessOnehundred()
    {
        Scanner scanner = new Scanner(System.in);
        PrimesNumber pri = new PrimesNumber();
        System.out.print("\nNhập m = ");
        int m = scanner.nextInt();
        System.out.printf("số nguyên tố nhỏ hơn %d là: \n", m);
       if (m >= 2) {
           System.out.print(2);
       }
       for (int j = 3; j < m; j+=2) {
           if (primeNumber(j)) {
               System.out.print(" " + j);
           }
       }
    }


}
