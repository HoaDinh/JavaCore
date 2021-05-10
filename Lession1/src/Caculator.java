import java.lang.Math;

public class Caculator {
    int a = 15;
    int b = 7;
    int r=15;
    double pi = Math.PI;


    void sum(){
        int c;
        c = a+b;
        System.out.println("Result " +c);
       // System.out.println(Math.PI);
    }
/*    int divide(){
        int c;
        c = b/a;
        //System.out.println("Result" +c);
        return c;
    }*/

    //Tính chu vi hình chữ nhật
    void perimeterofaRectangle ()
    {
        int p;
        p=2*(a+b);
        System.out.println("The perimeter of a Rectangle is " +p +"cm");
    }
    //Tính diện tích hình chữ nhật
    void areaofaRectangle ()
    {
      int s;
      s=a*b;
        System.out.println("The area of a Rectangle is " +s+"cm");
    }

    //Tính chu vi hình tròn
    void diameterofaCircle ()
    {
        double c;

        c=2*r*pi;
        System.out.println("The diameter of a Circle is " +c +"cm");

    }
    // tính diện tích hình tròn
    void areaofaCircle ()
    {
        double S;
        double R= Math.pow(r,2);
        S=R*pi;
        System.out.println("The area of a Circle is " +S +"cm");
    }
    void display()
    {
        Caculator c = new Caculator();
        c.sum();
        c.perimeterofaRectangle();
        c.areaofaRectangle();
        c.diameterofaCircle();
        c.areaofaCircle();
    }
}

