package recursion;

import java.util.Scanner;

public class FirstIndex {
    public static int firstIndex(int[] input, int x) {
        return firstIndexHelper(input, 0, x);
    }

    public static int firstIndexHelper(int[] input, int sIndex, int x) {
        if(sIndex == input.length)
            return -1;
        if(input[sIndex] == x)
            return sIndex;
        else
            return firstIndexHelper(input, sIndex + 1, x);
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
        System.out.println(FirstIndex.firstIndex(input, x));
    }
}
