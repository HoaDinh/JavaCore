package lesson2;

import java.util.Calendar;
import java.util.Date;

public class CaculatorDayInThang {
    public void daysInThang (int thang)
    {
        Calendar cal = Calendar.getInstance();
       int nam = cal.get(Calendar.YEAR);


        switch (thang){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12: {
                    System.out.println(String.format("Tháng %s Có 31 ngày", thang));
                break;
            }
             case 4: case 6: case 9: case 11: {
                //System.out.println(String.format("Tháng %s Có 30 ngày", thang));
                System.out.format("Tháng %s Có 30 ngày", thang);
                break;
            }
            case 2: {
                if(nam%400==0 || nam%4==0 && nam%100!=0) {
                    System.out.println(String.format("Tháng %s Có 29 ngày", thang));
                }
                else {
                    System.out.println(String.format("Tháng %s Có 28 ngày", thang));
                }
                break;
            }
            default: {
                System.out.println(String.format("tháng không hợp lệ"));
                break;
            }

        }
    }
    public  void giaiPTBac2( double a, double b, double c) {

        double x1, x2;

        //Kiểm tra các giá trị nhập vào
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình vô nghiệm!");
            } else {
                System.out.format("Phương trình có một nghiệm: x = %2f" , (-c / b));
            }
            return;
        }
// giai phuong trinh (b2 - 4ac)
        double delta = b * b - 4 * a * c;

        // check if determinant is greater than 0
        if (delta > 0) {

            // two real and distinct roots
            x1 = (-b + Math.sqrt(delta)) / (2 * a);
            x2 = (-b - Math.sqrt(delta)) / (2 * a);

            System.out.format("Phương trình có 2 nghiệm x1 = %.2f và x2 = %.2f", x1, x2);
        }

        // check if delta is equal to 0
        else if (delta == 0) {

            // two real and equal roots
            // determinant is equal to 0
            // so -b + 0 == -b
            x1 = x2 = -b / (2 * a);
            System.out.format("Phương trình có nghiệm kép x1 = x2 = %.2f;", x1);
        }

        // if delta is less than zero
        else {

            System.out.println("Phương trình vô nghiệm");

        }
    }
    public  void findTriangle(double a, double b, double c)
    {
        if(a + b >c && a + c >b  &&  b + c > a)

            System.out.println("\nĐây là hình tam giác cmnr");

        else
            System.out.println("Đây không phải là hình tam giác");


    }

}
