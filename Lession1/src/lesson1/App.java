package lesson1;

import lesson2.CaculatorDaysInMonth;
import lesson2.FomularBMI;

public class App {
    int a = 10;

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int b = 10;
        App m = new App();
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
        day.findTriangle(0, 2, 5);


        //System.out.println(c.divide());
    }

    public void Show() {
        // main m = new  main();
        System.out.println(a);

    }
}
