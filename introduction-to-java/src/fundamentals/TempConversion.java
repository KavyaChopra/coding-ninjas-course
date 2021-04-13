package fundamentals;

import java.util.Scanner;

public class TempConversion {
    public static void main(String[] args) {
//        0 <= S <= 80
//        S <= E <=  900
//        0 <= W <= 40
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        int skip = scanner.nextInt();
        while(start <= end) {
            int celsius = ((int) ((start - 32) * (5.0 / 9)));
            System.out.println(start + " " + celsius);
            start+= skip;
        }
    }
}
