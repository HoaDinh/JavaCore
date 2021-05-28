import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main (String [] args) {
        CheckString check = new CheckString();
       // System.out.println(check.checkStringInclude());
        check.checkEmail();
        /*Random rand = new Random();
        // loop for
        final long startTime = System.nanoTime();
        for (int i=0; i<100;i++)
        {
            int number = rand.nextInt(100);
            if (number>90)
                break;
            else System.out.println(number);
        }
       final  long endTime = System.nanoTime();

        System.out.println("Total execution time loop for: " + (endTime - startTime));

        final long startTime1 = System.currentTimeMillis();
       int number1=0;
        while (number1<=90)
        {
            number1 = rand.nextInt(100);

                System.out.println(number1);

        }
         final long endTime1 = System.nanoTime();

        System.out.println("Total execution time loop while: " + (endTime1 - startTime1));

        final long startTime2 = System.currentTimeMillis();
        int number2=0;
        do
        {
            number2 = rand.nextInt(100);

                System.out.println(number2);


        }while (number2<=90);
        final long endTime2 = System.nanoTime();

        System.out.println("Total execution time loop do while: " + (endTime2 - startTime2));*/

        /*Scanner scan = new Scanner(System.in);
        System.out.println("Nhập vào tên của bạn");
        String name= scan.nextLine();
        System.out.println("Nhập vào tuổi của bạn");
        int age= Integer.valueOf(scan.nextLine()) ;

        System.out.println("Nhập vào địa chỉ của bạn");
        String address= scan.nextLine();

        Main main = new Main();
        main.inputName(name,age,address);*/


    }
    public  void inputName( String name, int age, String address)
    {
        System.out.printf("Tôi tên là %s năm nay %d tuổi, tôi đang ở %s",name,age,address);
    }
}
