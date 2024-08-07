package exerciseOnEnum; // Ensure this matches your directory structure

// Main class to implement the methods
public class EnumExample {
    
    // Method to print all enum values using the values() method
    public static void printAllDays() {
        for (DayOfWeek day : DayOfWeek.values()) {
            System.out.println(day);
        }
    }

    // Method to compare two enum constants using compareTo()
    public static void compareDays(DayOfWeek day2, DayOfWeek day3) {
        int comparison = day2.compareTo(day3);
        if (comparison < 0) {
            System.out.println(day2 + " comes before " + day3);
        } else if (comparison > 0) {
            System.out.println(day2 + " comes after " + day3);
        } else {
            System.out.println(day2 + " is the same as " + day3);
        }
    }

    // Main method to run the examples
    public static void main(String[] args) {
        // Print all days
        printAllDays();
        
        // Compare two days
        compareDays(DayOfWeek.MONDAY, DayOfWeek.WEDNESDAY);
        compareDays(DayOfWeek.FRIDAY, DayOfWeek.FRIDAY);
        compareDays(DayOfWeek.SUNDAY, DayOfWeek.SATURDAY);
    }
}
