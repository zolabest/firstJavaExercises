package exercisesOnOperators;

import java.util.Scanner;

public class ex04_BitwiseOperators {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scan.nextInt();

        String binaryString = Integer.toBinaryString(num);
        System.out.println("Binary representation: " + binaryString);

        int flippedBits = ~num;
        System.out.println("Flipped bits: " + Integer.toBinaryString(flippedBits));
    }
}
