package firstJava;

import java.util.Scanner;

public class ex_7_nomericalStringToNumber {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a numerical string: ");
	        String numStr = scanner.nextLine();
	        
	        try {
	            int intValue = Integer.parseInt(numStr);
	            System.out.println("Integer value: " + intValue);
	        } catch (NumberFormatException e) {
	            System.out.println("Invalid integer format.");
	        }
	        
	        try {
	            float floatValue = Float.parseFloat(numStr);
	            System.out.println("Float value: " + floatValue);
	        } catch (NumberFormatException e) {
	            System.out.println("Invalid float format.");
	        }
	        
	        scanner.close();
	    }
	}
