import java.util.Scanner;
public class Main {
    public static void main (String [] args) {

       // sumPositiveNumbers();
        //System.out.printf("Tổng số nguyên dương %f",sumFloatNumber());
       // int n=6780;
       // System.out.printf("Vị trí đổi của số %d là số %d",n,inverse_num(n));
        ShowTriangle show = new ShowTriangle();
        show.showTriangle();
    }
    public static void sumPositiveNumbers()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số n");
       int n=sc.nextInt();
       int sum =0;
       int i=0;

        while(i<n)
        {
            if (n<=0)
            {
                System.out.printf("%d không phải số nguyên dương, yêu cầu nhập lại",n);
                n=sc.nextInt();
            }
            else {
                i++;
                System.out.println(i);
            }

        }
        for(int j=0; j<=n;j++)
        {
            sum+=j*j;

        }
        System.out.printf("Tổng số nguyên dương %d",sum);
    }

    public static Float sumFloatNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số n");
        int n=sc.nextInt();
        float sum=0;
        for (int i=0; i<=n; i++)
        {
            if (n<=0)
            {
                System.out.printf("%d không phải số nguyên dương, yêu cầu nhập lại",n);
                n=sc.nextInt();

            }
            else
            {
               //sum+=1.0/i;
                sum += 1.0*(2*i + 1)/(2*i + 2);
            }
        }
        return sum;
    }
    public static int inverse_num(int n) {
        int inverse_num = 0;
        while(n > 0) {
            inverse_num = n%10 + inverse_num*10;
            n = n/10;
        }
        return inverse_num;
    }



}
