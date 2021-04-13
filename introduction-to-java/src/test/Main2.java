package test;

import java.util.Scanner;
import static java.lang.Math.pow;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int numCopy = num;
        int numCopy2 = num;
        int lengthNum = 0;
        while(numCopy2 != 0) {
            numCopy2/= 10;
            lengthNum++;
        }
        int sumDigitsPow = 0;
        while (numCopy != 0) {
            sumDigitsPow+= pow(numCopy % 10, lengthNum);
            numCopy/= 10;
        }
        System.out.print(sumDigitsPow == num);
    }
}
