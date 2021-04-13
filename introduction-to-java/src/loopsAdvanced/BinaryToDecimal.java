package loopsAdvanced;

import java.util.Scanner;

import static java.lang.Math.pow;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int binary = scanner.nextInt();
        int count = 0;
        int decimal = 0;
        while (binary != 0) {
            int digit = binary % 10;
            decimal = (int) (digit * pow(2, count)) + decimal;
            count++;
            binary/= 10;
        }
        System.out.println(decimal);
    }
}
