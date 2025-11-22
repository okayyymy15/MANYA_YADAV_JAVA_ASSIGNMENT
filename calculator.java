import java.util.Scanner;

public class calculator{
    int add(int n,int n1){
        return n+n1;
    }
    double add(double n,double n1){
        return n+n1;
    }
    int add(int n,int n1,int n2){
        return n+n1+n2;
    }
    int substract(int n,int n1){
        return n-n1;
    }
    double multiply(double n,double n1){
        return n*n1;
    }
    int divide(int n,int n1){
        if (n1 == 0) {
            System.out.println("Error: Cannot divide by zero!");
            return 0;
        }else{
        return n/n1;
    }


    }
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        calculator calc= new calculator();
        while(true){
            System.out.println("--WELCOME TO CALCULATOR APP--");
            System.out.println("Enter 1->ADDITION");
            System.out.println("Enter 2-> SUBTRACTION");
            System.out.println("Enter 3-> MULTIPLICATION");
            System.out.println("Enter 4-> DIVISION");
            System.out.println("Enter 5->EXIT");
            System.out.print("Enter your choice: ");
            int choice= input.nextInt();
            if (choice == 1) {
                System.out.print("Enter first number: ");
                int n = input.nextInt();
                System.out.print("Enter second number: ");
                int n1 = input.nextInt();
                System.out.println("SUM IS: " + calc.add(n, n1));
            }
            else if (choice == 2) {
                System.out.print("Enter first number: ");
                int n = input.nextInt();
                System.out.print("Enter second number: ");
                int n1 = input.nextInt();
                System.out.println("SUBTRACT IS: " + calc.substract(n, n1));
            }
            else if (choice == 3) {
                System.out.print("Enter first number: ");
                double n = input.nextDouble();
                System.out.print("Enter second number: ");
                double n1 = input.nextDouble();
                System.out.println("PRODUCT IS: " + calc.multiply(n, n1));

            } else if (choice == 4) {
                System.out.print("Enter first number: ");
                int n = input.nextInt();
                System.out.print("Enter second number: ");
                int n1 = input.nextInt();
                System.out.println("DIVISION IS: " + calc.divide(n, n1));

            } else if (choice == 5) {
                System.out.println("Exiting");

            } else {
                System.out.println("Invalid choice! Please try again.");
            }
        }


    }



}


