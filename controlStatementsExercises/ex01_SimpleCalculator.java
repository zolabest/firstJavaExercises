package controlStatementsExercises;

import java.util.Scanner;

public class ex01_SimpleCalculator {

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter the 1st number: ");
        double num1 = scan.nextDouble();
        
        System.out.println("Enter the 2nd number: ");
        double num2 = scan.nextDouble();
        
        System.out.println("Choose an operation: 1. add, 2. subtract, 3. multiply, 4. divide");
        int chooseOperation = scan.nextInt();
        
        double result = 0;
        
        switch (chooseOperation) {
            case 1:
                result = num1 + num2;
                break;
            case 2:
                result = num1 - num2;
                break;
            case 3:
                result = num1 * num2;
                break;
            case 4:
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Cannot divide by zero");
                    return;
                }
                break;
            default:
                System.out.println("Invalid operation");
                return;
        }
        
        System.out.println("Result: " + result);
    }
}

