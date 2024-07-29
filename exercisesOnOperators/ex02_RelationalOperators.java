package exercisesOnOperators;

import java.util.Scanner;

public class ex02_RelationalOperators {
    public static void main(String[] args) {
    	
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter 1st number: ");
        int num1 = scan.nextInt();
        
        System.out.print("Enter 2nd number: ");
        int num2 = scan.nextInt();

        if (num1 == num2) {
            System.out.println("The numbers are equal.");
        } else if (num1 > num2) {
            System.out.println("The 1st number is greater.");
        } else {
            System.out.println("The 2nd number is greater.");
        }
    }
}
