import java.util.Scanner;

public class FindNumbers {
    public boolean isPrimeNumber(int n) {

        // so nguyen n < 2 khong phai la so nguyen to
        if (n < 2) {
            return false;
        }
        // check so nguyen to khi n >= 2
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public void sumPrimeNumber()
    {
        Scanner scanner = new Scanner(System.in);
        int dem = 0; // đếm số số nguyên tố
        int i = 2;   // tìm số nguyên tố bắt dầu từ số 2
        System.out.print("Nhập n = ");
        int n = scanner.nextInt();
        int count=0;
        System.out.printf("%d số nguyên tố đầu tiên là: \n", n);
        while (dem < n) {
            if (isPrimeNumber(i)) {
                count+=i;
                dem++;
            }
            i++;
            System.out.printf("Tổng các số nguyên tố là %d",count);
        }

    }
    public void changeValue()
    {
        int arr[] = { 12, 23, 44, 56, 78 ,6,90};
        int index =2;
        int change=0;
        for(int i=0; i<arr.length;i++)
        {
            if(i==index) {
                arr[i] = 50;
                change=arr[i];

            }
        }
        System.out.printf("Thay đổi giá trị của phần tử thứ %d là %d",index,change);
    }
}
