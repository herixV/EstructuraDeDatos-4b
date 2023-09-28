public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

       Coin coin=new Coin();
       System.out.println(coin);


       // variables primitivas
       int num1=5;
       int num2=12;

        System.out.println("variabler Primitivas");

       num2=num1;
       num1=10;

       System.out.println("num1" + num1);
       System.out.println("num2" + num2);

       //Variables de tipo objeto
       Numero n1=new Numero();
       n1.numero=5;

       Numero n2=new Numero();
       n1.numero=12;

       System.out.println("Variables de objeto");
       System.out.println("n1=" + n1.numero);
       System.out.println("n2=" + n2.numero);

       n2=n1;
       n1.numero=10;
    }
}
