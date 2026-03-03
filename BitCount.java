public class BitCount {
    public static void main(String[] args) {
        int positiveNumber = 10;
        int negativeNumber = -1;
        int zero = 0;

        // Using Integer.bitCount()
        int count1 = Integer.bitCount(positiveNumber);
        int count2 = Integer.bitCount(negativeNumber);
        int count3 = Integer.bitCount(zero);

        // Printing the results
        System.out.println("For the number: " + positiveNumber);
        System.out.println("Binary representation: " + Integer.toBinaryString(positiveNumber));
        System.out.println("Number of set bits: " + count1); // Output: 2

        System.out.println("\nFor the number: " + negativeNumber);
        System.out.println("Binary representation: " + Integer.toBinaryString(negativeNumber));
        System.out.println("Number of set bits: " + count2); // Output: 32

        System.out.println("\nFor the number: " + zero);
        System.out.println("Binary representation: " + Integer.toBinaryString(zero));
        System.out.println("Number of set bits: " + count3); // Output: 0
    }
}

