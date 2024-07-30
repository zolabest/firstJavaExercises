package controlStatementsExercises;

import java.util.Scanner;

public class ex08_AgeGroupClassification {
    public static void main(String[] args) {
    	
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter your age: ");
        int age = scan.nextInt();

        if (age >= 0 && age <= 12) {
            System.out.println("Child");
        } else if (age >= 13 && age <= 19) {
            System.out.println("Teenager");
        } else if (age >= 20 && age <= 59) {
            System.out.println("Adult");
        } else if (age >= 60) {
            System.out.println("Senior");
        } else {
            System.out.println("Invalid age");
        }
    }
}
