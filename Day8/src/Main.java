import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
       /* transpotArrays();
        sumArrars();
        SquareArrays sqr = new SquareArrays();
       sqr.findCrossLive();
       sqr.sortASC();*/
        FindNumbers numbers= new FindNumbers();
        numbers.changeValue();
        numbers.sumPrimeNumber();


    }
    static void sumArrars()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào hàng ngang của mảng ");
        int row = sc.nextInt();
       /* System.out.printf("nhập vào hàng dọc của mảng  ");
        int col = sc.nextInt();*/
        int[][] a = new int[row][row];
        int[][] b = new int[row][row];
        int[][] c = new int[row][row];
        int tong=0;
        for (int i=0; i<row;i++)
        {
            for (int j=0; j<row;j++)
            {
                System.out.printf("nhập vào các giá trị của mảng A[%d][%d] ",i,j);
                a[i][j] = sc.nextInt();
                System.out.printf("nhập vào các giá trị của mảng B[%d][%d] ",i,j);
                b[i][j] = sc.nextInt();


            }

        }

        System.out.println("mảng A");
        for (int i=0; i<row;i++)
        {
            for (int j=0; j<row;j++)
            {
                System.out.printf("\t %d",a[i][j]);

            }
            System.out.println("\n");
        }
        System.out.println("mảng B");
        for (int i=0; i<row;i++)
        {
            for (int j=0; j<row;j++)
            {

                System.out.printf("\t %d",b[i][j]);
                c[i][j] = a[i][j]+b[i][j];
            }
            System.out.println("\n");
        }

        System.out.printf("\ntổng 2 mảng:\n %d, %d", row, row);
        print(c);
    }

    static void transpotArrays() {
       /* Scanner sc = new Scanner(System.in);
        System.out.printf("Nhập vào hàng ngang của mảng ");
        int row = sc.nextInt();
        System.out.printf("nhập vào hàng dọc của mảng  ");
        int col = sc.nextInt();*/
        int column=2;
        int row=3;
        int[][] arr = {{1, 2}, {3, 4},{5,6}};
        int[][] transpose = new int[column][row];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                transpose[j][i]=arr[i][j];


            }
        }
        System.out.printf("\nCác phần tử trong ma trận chuyển vị:\n %d, %d", row, column);
        print(transpose);
    }
    public static void print(int[][] matrix) {
        for(int[] row : matrix) {
            for (int column : row) {
                System.out.print(column + "    ");
            }
            System.out.println();
        }
    }
}


