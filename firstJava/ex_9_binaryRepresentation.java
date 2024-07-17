package firstJava;

import java.util.Scanner;

public class ex_9_binaryRepresentation {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter an integer: ");
	        int number = scanner.nextInt();
	        
	        String binaryString = Integer.toBinaryString(number);
	        System.out.println("Binary representation: " + binaryString);
	        
	        scanner.close();
	    }
	}
