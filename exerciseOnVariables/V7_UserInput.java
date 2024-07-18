package exerciseOnVariables;

import java.util.Scanner;

public class V7_UserInput {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String userInput = scanner.nextLine();

	        System.out.println("You entered: " + userInput);
	    }
	}

