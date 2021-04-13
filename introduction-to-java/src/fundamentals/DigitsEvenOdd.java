package fundamentals;

import java.util.Scanner;

public class DigitsEvenOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int evenSum = 0;
        int oddSum = 0;
        while(n != 0) {
            int digit = n % 10;
            if(digit % 2 == 0)
                evenSum+= digit;
            else
                oddSum+= digit;
            n = n / 10;
        }
        System.out.println(evenSum + " " + oddSum);
    }
}
