package fundamentals;

import java.util.Scanner;
import static java.lang.Math.round;

public class TotalSalary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int basic = scanner.nextInt();
        char grade = scanner.next().charAt(0);
        double totalSalary = 0;
        double hra = 0.2 * basic;
        double da = 0.5 * basic;
        double pf = (11.0 / 100) * basic;
        int allow = 0;
        if(grade == 'A')
            allow = 1700;
        else if(grade == 'B')
            allow = 1500;
        else
            allow = 1300;
        totalSalary = hra + da + basic - pf + allow;
        System.out.println(round(totalSalary));
    }
}
