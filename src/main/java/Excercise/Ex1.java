package Excercise;

public class Ex1 {

    public static void main(String[] args) {
        // 1. 4 int variables
        // 2. Check if sum 2 first are even
        // 3. Check if sum 2 left are even
        // 4. If all sums are eve, type that all numbers are even

        int a1 = 387;
        int a2 = 43861;
        int b1 = 6;
        int b2 = 129898;

        int sumA = a1 + a2;
        int sumB = b1 + b2;

        System.out.println(sumA);
        System.out.println(sumB);

        if (sumA % 2 == 0 && sumB % 2 == 0) {
            System.out.println("All numbers are even");
        } else {
            System.out.println("Not all numbers are even");
        }
    }
}
