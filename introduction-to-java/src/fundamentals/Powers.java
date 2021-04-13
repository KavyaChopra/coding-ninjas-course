package fundamentals;

import java.util.Scanner;

public class Powers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int base = scanner.nextInt();
        int power = scanner.nextInt();
        int res = 1;
        while(power != 0) {
            res = base * res;
            power-= 1;
        }
        System.out.println(res);
    }
}
