import java.util.Scanner;

public class SquareArrays {
    // Tính tổng đường chéo của ma trận vuông
    public void findCrossLive() {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhập vào hàng ngang của mảng ");
        int row = sc.nextInt();
        int[][] a = new int[row][row];

        int count=0;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row; j++) {
                System.out.printf("nhập vào các giá trị của mảng A[%d][%d] ", i, j);
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Đường chéo của mảng hai chiều vuông");
        for (int i = 0; i < row; i++) {
            System.out.println("\t" + a[i][i]);
            count+=a[i][i];
        }
        System.out.println("Đường chéo của mảng hai chiều vuông "+count);
    }
    //sắp xếp tăng dần của hàng thử 2
    public void sortASC()
    {

        int[][] arr = {{1, 2, 9}, {3, 4, 6},{5, 6, 8}};
        int[] matrix = arr[1];

            int temp = matrix[0];
            System.out.println("\nDãy số được sắp xếp tăng dần: ");
            for (int s = 0 ; s < matrix.length ; s++) {
                for (int z = s + 1; z < matrix.length; z++) {
                    if (matrix[s] > matrix[z]) {
                        temp = matrix[z];
                        matrix[z] = matrix[s];
                        matrix[s] = temp;

                    }
                }
                System.out.println(matrix[s]);
            }
        }




}
