package exercisesOnOperators;

public class ex12_TypeCastOperator {
    public static void main(String[] args) {
        double num = 10.5;
        int narrowedNum = (int) num; // Narrowing conversion
        System.out.println("Narrowing conversion: " + narrowedNum);

        int num2 = 100;
        double widenedNum = num2; // Widening conversion
        System.out.println("Widening conversion: " + widenedNum);
    }
}
