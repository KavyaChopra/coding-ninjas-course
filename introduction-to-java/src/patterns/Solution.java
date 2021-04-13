package patterns;

public class Solution {
    public static void printFahrenheitTable(int start, int end, int step) {
        while(start <= end) {
            int celsius = ((int) ((start - 32) * (5.0 / 9)));
            System.out.println(start + " " + celsius);
            start+= step;
        }
    }

    public static void main(String[] args) {
        printFahrenheitTable(20, 100, 20);
    }
}
