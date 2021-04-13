package recursionAssignment;

import java.text.DecimalFormat;
import java.util.Scanner;
import static java.lang.Math.pow;

public class GeometricSum {
    public static double findGeometricSum(int k) {
        double ratio = 0.5;
        if(k == 0)
            return 1;
        double ans = pow(ratio, k);
        return ans + findGeometricSum(k - 1);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int k = s.nextInt();
        double ans = GeometricSum.findGeometricSum(k);
        DecimalFormat dec = new DecimalFormat("#0.00000");
        System.out.println(dec.format(ans));
    }
}
