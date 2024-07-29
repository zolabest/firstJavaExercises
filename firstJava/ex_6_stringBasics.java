package firstJava;

import java.util.Scanner;

public class ex_6_stringBasics {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter your name: ");
	        String name = scanner.nextLine();
	        
	        System.out.println("Hello, " + name + "!");
	        System.out.println("The length of your name is: " + name.length());
	        
	        scanner.close();
	    }
	}

