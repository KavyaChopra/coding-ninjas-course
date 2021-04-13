package arrays;

public class ArrangeArray {
    public static void arrange(int[] arr, int n) {
        int i = 0;
        int max_even;
        if (n % 2 == 0) {
            max_even = n;
            for (i = 0; i < n / 2; i++)
                arr[i] = 2 * i + 1;
        } else {
            max_even = n - 1;
            for (i = 0; i <= n / 2; i++)
                arr[i] = 2 * i + 1;
        }
        while (max_even >= 2) {
            arr[i] = max_even;
            max_even -= 2;
            i++;
        }
        for (int j = 0; j < n; j++)
            System.out.print(arr[j] + " ");
    }

}
