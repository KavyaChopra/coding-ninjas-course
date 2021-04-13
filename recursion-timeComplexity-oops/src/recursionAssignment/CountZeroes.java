package recursionAssignment;

import java.util.Scanner;

public class CountZeroes {
    public static int countZerosRec(int input) {
        if(input == 0)
            return 1;
        else
            return countZeroesHelper(input);
    }

  public static int countZeroesHelper(int input) {
    if (input == 0)
      return 0;
    else if (input % 10 == 0)
        return 1 + countZeroesHelper(input / 10);
    else
        return countZeroesHelper(input / 10);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(CountZeroes.countZerosRec(n));
    }
}
