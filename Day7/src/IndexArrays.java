import java.util.Scanner;
public class IndexArrays {
    //Tìm số lớn nhất, nhỏ nhất trong mảng và index
    public static void findMaxMinNumber()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số phần tử mảng\n");
       int size = sc.nextInt();
        int array[] = new int[size];
        int maxValue =0;
        int minValue =0;
        int indexMax=0;
        int indexMin=0;
        for(int i=0; i<size;i++)
        {
            System.out.printf("\nNhập phần tử thứ %d ",i);
            if (i==1)
            {
             maxValue =array[0];
             minValue =array[0];
            }
            array[i]=sc.nextInt();
            if(maxValue<array[i])
            {
                maxValue=array[i];
                indexMax=i;

            }
            if(minValue>array[i])
            {
                minValue=array[i];
                indexMin=i;
            }

        }
        System.out.printf("Giá trị lớn nhất trong mảng là %d với index là %d",maxValue,indexMax);
        System.out.printf("\nGiá trị nhỏ nhất trong mảng là %d với index là %d",minValue,indexMin);

    }
    public static void findMaxSecond()
    {
        int array [] = {0,8,6,9,4,9};
        int max = array[0];
        int second=0;
        int index=0;

        for (int i=0;i<array.length; i++)
        {
            if(array[i]>=max)
            {
                second=max;
                max=array[i];
            }
            else if(array[i]>second)
            {
                second=array[i];
                index=i;
            }
        }
        System.out.printf("\nSố lớn thứ hai trong chuỗi là %d với index bằng %d",second,index);
    }

}
