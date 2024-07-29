package exercisesOnOperators;

import java.util.Scanner;

public class ex06_AssignmentOperators {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double num = scan.nextDouble();

        while (num >= 1) {
            System.out.println(num);
            num /= 2;
        }
    }
}
