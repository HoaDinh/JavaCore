package lesson3;

import java.util.Scanner;

public class OperatingString {
    public static final char SPACE = ' ';
    public static final char TAB = '\t';
    public static final char BREAK_LINE = '\n';
    public  void  findValue()
    {
        String str ="You only live once, but if you do it right, once is enough";

        System.out.println( str.charAt(1));

        int leng = str.length();
        System.out.println("Index của ký tự O là ");
        for (int i=0; i<leng;i++)
        {
            if (str.charAt(i)=='o')
            {
                System.out.println(i);
            }
        }

    }
    public int findNumberinString( )
    {
        String str="";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi \n");
        str=scanner.nextLine();
        if (str == null) {
            return -1;
        }
        int count = 0;
        int size = str.length();
        boolean notCounted = true;
        for (int i = 0; i < size; i++) {
            if (str.charAt(i) != SPACE && str.charAt(i) != TAB
                    && str.charAt(i) != BREAK_LINE) {
                if(notCounted) {
                    count++;
                    notCounted = false;
                }
            } else {
                notCounted = true;
            }
        }
        return count;
    }
}

