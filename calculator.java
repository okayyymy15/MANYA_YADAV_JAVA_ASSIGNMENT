import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        Scanner calc= new Scanner(System.in);
        System.out.println("--calculator--");
        System.out.println("enter a no.:");
        int a=calc.nextInt();
        System.out.println("enter another no.:");
        int b=calc.nextInt();
        int add =a+b;
        int subtraction=a-b;
        int multiplication= a*b;
        int division= a/b;
        int modulas= a%b;

        System.out.println("addition:" + add );
        System.out.println("subtraction:" + subtraction);
        System.out.println("multiplication:" + multiplication);
        System.out.println("division:" + division );
        System.out.println("modulas:" + modulas);
//        System.out.println("--prod of 2 floating no.--");
//        System.out.print("enter a no.:");
//        double x= calc.nextDouble();
//        System.out.println("enter another no.:");
//        double y=calc.nextDouble();
//        System.out.println("product is:" + x*y );




    }
}
