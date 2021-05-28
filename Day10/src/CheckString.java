import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class CheckString {
    public boolean checkStringInclude()
    {
        String str1 ="Anh yêu em hơn yêu Java";
        String str2 ="Java";
        if (str1.contains(str2)==true)
            return true;

        return false;
    }
    public void removeCharacter() {
        String str="aaabccacdeefb675556689";
        String temp="";
        for (int i=0; i<str.length();i++)
        {
            if (temp.indexOf(String.valueOf(str.charAt(i)))==-1)
            {

                temp=temp.concat(String.valueOf(str.charAt(i)));

            }
        }
        System.out.println(temp);
    }
    public void checkEmail(){
        String regex = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\\\.[A-Z]{2,6}$";

        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Scanner scan = new Scanner(System.in);
        boolean check=true;
        do {
            System.out.println("Nhập email của bạn vào đây nhé");
            String email = scan.nextLine();
            Matcher matcher = pattern.matcher(email);
            check = matcher.matches();

        }while(check==false);
        System.out.printf("Email của bạn đã nhập %b",check);
    }
}
