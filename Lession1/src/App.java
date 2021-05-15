import lesson1.Caculator;
import lesson2.*;
import lesson2.*;
import lesson3.*;
import java.util.Scanner;

public class App {
    int a = 10;

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int b = 10;
        /*App m = new App();
        m.Show();
        Caculator c = new Caculator();
        c.display();


        // tinh IBM
        FomularBMI bmi = new FomularBMI();
        bmi.fomulaBMIbyMyself(50, 150);
        //tinh pt va ngay thang
        CaculatorDaysInMonth day = new CaculatorDaysInMonth();
        day.daysInMonth(2);
        day.giaiPTBac2(0, 1, 8.9);
        day.findTriangle(0, 2, 5);*/
        Scanner scanner = new Scanner(System.in);
        PrimesNumber pri = new PrimesNumber();
        int dem = 0; // đếm số số nguyên tố
        int i = 2;   // tìm số nguyên tố bắt dầu từ số 2
        System.out.print("Nhập n = ");
        int n = scanner.nextInt();
        System.out.printf("%d số nguyên tố đầu tiên là: \n", n);
        while (dem < n) {
            if (pri.isPrimeNumber(i)) {
                System.out.print(i + " ");
                dem++;
            }
            i++;
        }
        if (n >= 2) {
            System.out.print(2);
        }
        for (int j = 3; j < n; j+=2) {
            if (pri.isPrimeNumberlessOnehundred(j)) {
                System.out.print(" " + i);
            }
        }


        //System.out.println(c.divide());
    }

    public void Show() {
        // main m = new  main();
        System.out.println(a);

    }
}
