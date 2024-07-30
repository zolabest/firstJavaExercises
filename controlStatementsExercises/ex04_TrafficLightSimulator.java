package controlStatementsExercises;

import java.util.Scanner;

public class ex04_TrafficLightSimulator {
    public static void main(String[] args) {
    	
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter a traffic light color (red, yellow, green): ");
        String color = scan.next();

        switch (color.toLowerCase()) {
            case "red":
                System.out.println("Stop");
                break;
            case "yellow":
                System.out.println("Caution");
                break;
            case "green":
                System.out.println("Go");
                break;
            default:
                System.out.println("Invalid color");
        }
    }
}
