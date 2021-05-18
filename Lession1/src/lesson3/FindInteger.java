package lesson3;
import java.util.Scanner;
//homework 10,11,13,14
public class FindInteger {
    Scanner input = new Scanner(System.in);
    public void finInteger()
    {
        int n,tong=0;
        System.out.println("Nhập vào số nguyên");

        n=input.nextInt();
        while (n>0) {
            tong+=n%10;
            n= n/10;
        }
        System.out.format("tong cac chu so cua n la %s: ",tong);
    }
    /*public static int findFactorial()
    {
        int m;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào số nguyên");
        m=input.nextInt();
        for(int i=2;i<=m;i++)
            while (m%i == 0) {
                System.out.println(i);;
                m /=  i;
            }

        return 0;
    }*/
    public static  int sumInteger()
    {
        int m;
        int tong=0;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào số nguyên");
        m=input.nextInt();
        if(m <0)
            return -1;
        for (int i=0; i<=m;i++)
            {
                if(i%3==0) {
                    tong+=i;
                }


            }
        return tong;
    }
    public void finPositiveAndNegative()
    {
        int a;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào số nguyên");
        a=input.nextInt();
        if(a==0)
            System.out.println(a);
        if(a<0)
            System.out.println("This is negative number");
        if(a>0)
            System.out.println("This is positive number");


    }
}
