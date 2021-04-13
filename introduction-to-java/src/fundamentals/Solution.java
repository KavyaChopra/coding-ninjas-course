package fundamentals;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char name = scanner.next().charAt(0);
//      takes the first character from the string entered
        int mark1 = scanner.nextInt();
        int mark2 = scanner.nextInt();
        int mark3 = scanner.nextInt();
        System.out.println(name);
        System.out.println((mark1 + mark3 + mark2) / 3);


    }
}
