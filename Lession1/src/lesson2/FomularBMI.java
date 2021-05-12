package lesson2;

public class FomularBMI {
    //BMI = (cân nặng )/(chiều cao x 2)
    double scn=0;
   public void fomulaBMIbyMyself(double cn, double cc)
    {
        double bmi = cn/(cc*2);

                if (bmi < 18.5)
                {
                    scn=18.5-bmi;
                    System.out.println("Thiếu cân " +scn  );
                }
                else if (bmi <=18.5 && bmi >=24.9 )
                {
                    System.out.println("Cân đối");
                }
                else
                {
                    scn=bmi-24.9;
                    System.out.println("Thừa cân " + scn);
                }


    }
}
