package exerciseOnVariables;

public class V6_SwappingVariables {

	    public static void main(String[] args) {
	        int a = 10;
	        int b = 20;

	        System.out.println("Before Swap: a = " + a + ", b = " + b);

	        // Swapping without using a third variable
	        a = a + b; // a = 30
	        b = a - b; // b = 10
	        a = a - b; // a = 20

	        System.out.println("After Swap: a = " + a + ", b = " + b);
	    }
	}
