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
        //System.out.println(c.divide());
        /*PrimesNumber pri = new PrimesNumber();
        pri.isPrimeNumber();
        pri.isPrimeNumberlessOnehundred();*/
       /* FibonaciNumber fi = new FibonaciNumber();
        fi.isFibonacciLessOneHundred();*/
       /* FindInteger find = new FindInteger();
        find.finPositiveAndNegative();*/
        OperatingString s = new OperatingString();
        System.out.println(s.findNumberinString());


    }

    public void Show() {
        // main m = new  main();
        System.out.println(a);

    }
}
