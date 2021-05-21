import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main (String [] args) {
        // floadArrays();
        // printArray();
        // findEvenNumber();
        int[] arr = {1, 9, 0, 7, 10, 6, 8};
        sortASC(arr);
        sortDesc(arr);
        /*for (int i = 0; i < 7; i++){
            System.out.printf(" %d\t", arr[i]);
            }*/

       //IndexArrays.findMaxMinNumber();
       IndexArrays.findMaxSecond();


       /* int arrs[] = { 12, 11, 13, 5, 6, 7 };
        int n = arrs.length;

        HeapSort ob = new HeapSort();
        ob.sort(arrs);

        System.out.println("Sorted array is");
       ob.printArray(arrs);*/


    }
    static void floadArrays()
    {

        float fltarray [] = {0.5f,2.9f,4f,5f};
        for (int i=0; i<fltarray.length;i++)
        {
            System.out.format("%s",fltarray[i]);



        }


    }
    static void printArray()
    {
        int count=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số phần tử mảng \n");
        int length = scanner.nextInt();
        int array[] = new int[length];
        for (int i=0; i<array.length;i++)
        {
            System.out.println("\nnhập phần tử ở vị trí " +i);
            array[i]=scanner.nextInt();

            if(i==2)
            {
                System.out.println("phần tử thứ 2 là"+array[i]);
                count+=array[i];
            }



        }
        System.out.printf("\nTổng các phần tử trong mảng là " +count);



    }
    static void findEvenNumber()
    {
        int count=0;
        int array[]={1,6,3,9,5,0,4};
        for (int i=0; i<array.length;i++)
        {
            if (array[i]%2==0)
            {
                System.out.printf("\nCác số chẵn là %d",array[i]);
                count+=array[i];

            }


        }
        System.out.printf("\n Tổng các số chẵn là %d",count);

    }
    public static void sortASC(int [] arr) {
        int temp = arr[0];
        System.out.println("\nDãy số được sắp xếp tăng dần: ");
        for (int i = 0 ; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;

                }
            }
            System.out.println(arr[i]);
        }
    }
    public static void sortDesc(int [] arr) {

        int temp = arr[0];
        System.out.println("\nDãy số được sắp xếp giảm dần: ");
        for (int i = 0 ; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;

                }
            }

           System.out.println(arr[i]);
        }



    }
    /*public static void quickSort(int arr[], int begin, int end) {
        if (begin < end) {
            int partitionIndex = partition(arr, begin, end);

            quickSort(arr, begin, partitionIndex-1);
            quickSort(arr, partitionIndex+1, end);
        }
    }
    private static int partition(int arr[], int begin, int end) {
        int pivot = arr[end];
        int i = (begin-1);

        for (int j = begin; j < end; j++) {
            if (arr[j] <= pivot) {
                i++;

                int swapTemp = arr[i];
                arr[i] = arr[j];
                arr[j] = swapTemp;
            }
        }

        int swapTemp = arr[i+1];
        arr[i+1] = arr[end];
        arr[end] = swapTemp;

        return i+1;
    }*/
    public static void show(int [] xyz) {
        for (int i = 0; i < xyz.length; i++) {
            System.out.print(xyz[i] + " ");
        }
    }
}
