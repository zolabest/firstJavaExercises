package firstJava;

public class ex_3_2TypeConversion {

	public static void main(String[] args) {
	
        int intVar = 10;
        float floatVar = 3.5f;
        double doubleVar = 5.5;

        // Explicit type conversion (casting)
        int intFromFloat = (int) floatVar;
        System.out.println("intFromFloat: " + intFromFloat);

        float floatFromInt = (float) intVar;
        System.out.println("floatFromInt: " + floatFromInt);

        // Convert double to float
        float floatFromDouble = (float) doubleVar;
        System.out.println("floatFromDouble: " + floatFromDouble);

        // Convert float to double
        double doubleFromFloat = (double) floatVar;
        System.out.println("doubleFromFloat: " + doubleFromFloat);
    }
}
