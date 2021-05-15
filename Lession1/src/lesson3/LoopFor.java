package lesson3;

public class LoopFor {
    public  void showFor (){
        int count=0;
        int sum=0;
        for (int i=50; i>=0; i--)
        {
            if(i%2==0) {
                System.out.println("phần tử thứ i " + i);
                //i++;
                count++;
                sum = sum +i;
                System.out.println("Có tổng " +count+" số chẵn");

            }
        }
        System.out.println("Tổng các số chẵn " +sum);
    }
    public  void showLetter (){

        for (int i=1; i<100; i++)
        {
            if(i%3==0) {

                if(i%5==0)
                {
                    System.out.format("\nFizzBuzz %s",i);
                }
                else System.out.format("\nFizz %s" ,i);
            }
            else
            {
                if (i%5==0)
                {
                    System.out.format("\nBuzz %s" ,i);
                }
                else {
                        System.out.format("\nkhong gi %s",i);

                }
            }



        }

    }

}
