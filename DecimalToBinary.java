import java.util.Scanner;

class DecimalToBinary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a Decimal Number: ");
        int decimal = input.nextInt();
        input.close();

        System.out.println("Binary representation: " + decimalToBinary(decimal));
    }

    public static String decimalToBinary(int decimal) {
        StringBuilder binary = new StringBuilder();
        for (int i = decimal; i > 0; i /= 2) {
            int remainder = i % 2;
            binary.insert(0, remainder); // Insert the remainder at the beginning of the string
        }
        return binary.toString();
    }
}