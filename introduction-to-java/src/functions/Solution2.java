package functions;

public class Solution2 {
    public static boolean checkMember(int n) {
        int f1 = 1, f2 = 1, f3 = 0;
        for (int i = 0; i < 30; i++) {
            f3 = f2 + f1;
            f1 = f2;
            f2 = f3;
            if(f3 == n)
                return true;
            if(f3 > n)
                return false;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(checkMember(5));
    }
}
