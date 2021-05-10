public class App {
    int a =10;
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int b =10;
       App m = new App ();
        m.Show();
        Caculator c = new Caculator();
        c.display();

        //System.out.println(c.divide());
    }
    public void Show(){
       // main m = new  main();
        System.out.println(a);

    }
}
