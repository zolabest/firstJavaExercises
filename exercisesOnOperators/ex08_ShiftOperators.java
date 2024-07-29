package exercisesOnOperators;

import java.util.Scanner;

public class ex08_ShiftOperators {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scan.nextInt();

        int leftShift = num << 2;
        int rightShift = num >> 2;

        System.out.println("Left shift by 2: " + leftShift);
        System.out.println("Right shift by 2: " + rightShift);
    }
}
