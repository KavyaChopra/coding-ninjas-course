package fundamentals;

import java.util.Scanner;

public class Solution2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char name = scanner.next().charAt(0);
        if((int) name >= 97 && (int) name <= 122)
            System.out.println(0);
        else if((int) name >= 65 && (int) name <= 90)
            System.out.println(1);
        else
            System.out.println(-1);
    }
}
