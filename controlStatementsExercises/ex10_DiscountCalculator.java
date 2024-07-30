package controlStatementsExercises;

import java.util.Scanner;

public class ex10_DiscountCalculator {
    public static void main(String[] args) {
    	
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter total bill amount: ");
        double billAmount = scan.nextDouble();
        double discount = 0;

        if (billAmount > 500) {
            discount = 0.20;
        } else if (billAmount > 200) {
            discount = 0.10;
        }

        double discountAmount = billAmount * discount;
        double finalAmount = billAmount - discountAmount;

        System.out.println("Discount: " + (discount * 100) + "%");
        System.out.println("Final amount after discount: " + finalAmount);
    }
}

