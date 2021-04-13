package arrays;

public class FindUnique {
    public static int findUnique(int[] arr) {
        int res = 0;
        boolean isDuplicate;
        for (int i = 0; i < arr.length; i++) {
            res = arr[i];
            isDuplicate = false;
            for (int j = 0; j < arr.length; j++) {
                if(j == i)
                    continue;
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if(!isDuplicate)
                return arr[i];
        }
        return res;
    }
}
