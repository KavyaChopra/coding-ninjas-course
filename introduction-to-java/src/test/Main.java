package test;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Math.pow;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int numCopy = num;
        int sumDigitsPow = 0;
        ArrayList<Integer> digitsNum = new ArrayList<>();
        while (numCopy != 0) {
            digitsNum.add(numCopy % 10);
            numCopy/= 10;
        }
        for (int i = 0; i < digitsNum.size(); i++) {
            sumDigitsPow+= pow(digitsNum.get(i), 3);
        }
        System.out.print(sumDigitsPow == num);
    }
}


