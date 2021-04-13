package loopsAdvanced;

import java.util.ArrayList;
import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int decimal = scanner.nextInt();
        ArrayList<Integer> binary = new ArrayList<>();
        if(decimal == 0)
            System.out.print(0);
        while(decimal != 0) {
            binary.add(decimal % 2);
            decimal/= 2;
        }
        for (int i = binary.size() - 1; i >= 0; i--) {
            System.out.print(binary.get(i));
        }
    }
}
