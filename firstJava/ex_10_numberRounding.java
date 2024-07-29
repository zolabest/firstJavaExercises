package firstJava;

import java.util.Scanner;

public class ex_10_numberRounding {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a double value: ");
	        double number = scanner.nextDouble();
	        
	        int truncatedValue = (int) number;
	        int roundedValue = (int) Math.round(number);
	        
	        System.out.println("Truncated value: " + truncatedValue);
	        System.out.println("Rounded value: " + roundedValue);
	        
	        scanner.close();
	    }
	}
