package arrays;

public class DuplicateNum {
    public static int duplicateNum(int[] arr) {
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(i == j)
                    continue;
                if(arr[i] == arr[j])
                    return arr[i];
            }
        }
        return res;
    }
}
