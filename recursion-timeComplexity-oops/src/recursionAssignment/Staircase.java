package recursionAssignment;

import java.util.Scanner;

public class Staircase {
    public static int staircase(int n) {
//        2 -> {{2}, {11}} = 2
//        3 -> {{111}, {12}, {21}, {3}} = 4
//        4 -> {{1111}, {121}, {22}, {13}, {211}, {31}, {112}} = 7
        if(n == 1)
            return 1;
        if(n == 2)
            return 2;
        if(n == 3)
            return 4;
        if(n <= 0)
            return 0;
        return staircase(n - 1) + staircase(n - 2) + staircase(n - 3);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(Staircase.staircase(n));
    }
}
