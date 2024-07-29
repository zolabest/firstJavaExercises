package exercisesOnOperators;

import java.util.Scanner;

public class ex05_LogicalOperators {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scan.nextInt();

        if (num % 2 == 0 && num % 3 == 0) {
            System.out.println("The number is divisible by both 2 and 3.");
        } else {
            System.out.println("The number is not divisible by both 2 and 3.");
        }
    }
}

