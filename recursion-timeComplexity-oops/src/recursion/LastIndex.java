package recursion;

import java.util.Scanner;

public class LastIndex {
    public static int lastIndex(int[] input, int x) {
        return lastIndexHelper(input, input.length - 1, x);
    }

    public static int lastIndexHelper(int[] ints, int lIndex, int x) {
        if(lIndex == -1)
            return -1;
        if(ints[lIndex] == x)
            return lIndex;
        return lastIndexHelper(ints, lIndex - 1, x);
    }

    static Scanner s = new Scanner(System.in);

    public static int[] takeInput(){
        int size = s.nextInt();
        int[] input = new int[size];
        for(int i = 0; i < size; i++){
            input[i] = s.nextInt();
        }
        return input;
    }

    public static void main(String[] args) {
        int[] input = takeInput();
        int x = s.nextInt();
        System.out.println(LastIndex.lastIndex(input, x));
    }
}
