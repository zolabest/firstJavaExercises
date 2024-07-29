package exercisesOnOperators;

import java.util.Scanner;

public class ex01_ArithmeticOperators {
    public static void main(String[] args) {
    	
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        double num1 = scan.nextDouble();
        
        System.out.print("Enter second number: ");
        double  num2 = scan.nextDouble();

        System.out.println("Sum: " + (num1 + num2));
        System.out.println("Difference: " + (num1 - num2));
        System.out.println("Product: " + (num1 * num2));
        System.out.println("Quotient: " + (num1 / num2));
        System.out.println("Remainder: " + (num1 % num2));
    }
}

