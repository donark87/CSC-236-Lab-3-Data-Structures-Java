//Donark Patel
//CSC 236
//Lab 3A
//Date: 10/14/2018
//This application adds polynomial
import java.util.Scanner;

public class PolynomialDemo {

    public static void main (String[]args)
    {
        int choice,
                coefficient,
                exponent,
                terms;

        Scanner keyboard = new Scanner(System.in);

        Polynomial p1 = new Polynomial();
        Polynomial p2 = new Polynomial();

        do{
            System.out.println("\nEnter 1 to type in 1st Polynomial\n"+
                    "Enter 2 to type in 2nd Polynomial\n"+
                    "Enter 3 to exit.");
            choice = keyboard.nextInt();
            if(choice == 1)
            {
                System.out.println("Enter 0 to finish");
                System.out.println("How many terms does the polynomial have?");
                terms = keyboard.nextInt();
                for(int i = 0; i < terms; i++)
                {
                    System.out.println("Enter coefficient: ");
                    coefficient = keyboard.nextInt();
                    System.out.println("Enter exponent: ");
                    exponent = keyboard.nextInt();
                    p1.addPolyNodeLast(coefficient,exponent);
                }
                System.out.println("Polynomial 1: " + p1);
            }
            else if(choice == 2)
            {
                System.out.println("\nEnter 0 to finish");
                System.out.println("How many terms does the polynomial have?");
                terms = keyboard.nextInt();
                for(int i = 0; i < terms; i++)
                {
                    System.out.println("Enter coefficient: ");
                    coefficient = keyboard.nextInt();
                    System.out.println("Enter exponent: ");
                    exponent = keyboard.nextInt();
                    p2.addPolyNodeLast(coefficient,exponent);
                }
                System.out.println("Polynomial 2: " + p2 + "\n\n");
                System.out.println("("+p1+") " + " + " +" ("+ p2+")");
                System.out.println("\nAnswer: " + p1.addPolynomials(p2));
                System.out.println();
            }
        }while(choice != 3);

    }
}
