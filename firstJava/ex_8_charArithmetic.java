package firstJava;

import java.util.Scanner;

public class ex_8_charArithmetic {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a character: ");
	        char ch = scanner.next().charAt(0);
	        
	        char nextChar = (char) (ch + 1);
	        System.out.println("The next character is: " + nextChar);
	        
	        scanner.close();
	    }
	}
