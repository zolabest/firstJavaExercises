package firstJava;

import java.util.Scanner;
public class ex_5_booleanLogic {

		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter a number: ");
		        int number = scanner.nextInt();
		        
		        boolean isEven = (number % 2 == 0);
		        boolean isLessThan100 = (number < 100);
		        
		        if (isEven && isLessThan100) {
		            System.out.println("The number is even and less than 100.");
		        } else {
		            System.out.println("The number is not both even and less than 100.");
		        }
		        
		        scanner.close();
		    }
		}


	

