package recursion;

import java.util.Scanner;

public class CheckNum {
    public static boolean checkNumber(int[] input, int x) {
        if(input.length == 0)
            return false;
        int[] temp = new int[input.length - 1];
        System.arraycopy(input, 1, temp, 0, input.length - 1);
        return (input[0] == x || checkNumber(temp, x));
    }

    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int n = s.nextInt();
        int input[] = new int[n];
        for(int i = 0; i < n; i++) {
            input[i] = s.nextInt();
        }
        int x = s.nextInt();
        System.out.println(CheckNum.checkNumber(input, x));
    }
}
