package twoDArrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SpiralPattern {
    public static void spiralPrint(int[][] matrix) {
        if(matrix.length == 0) {
            return;
        }
        int rowStart = 0, rowEnd = matrix.length - 1;
        int columnEnd = matrix[0].length - 1, columnStart = 0;
        int counter = 0;
        int sizeOfArray = matrix.length * matrix[0].length;
        while(counter != sizeOfArray) {
            for (int j = columnStart; j <=   columnEnd; j++) {
                System.out.print(matrix[rowStart][j] + " ");
                counter++;
            }
            rowStart++;
            for (int i = rowStart; i <= rowEnd; i++) {
                System.out.print(matrix[i][columnEnd] + " ");
                counter++;
            }
            columnEnd--;
            for (int i = columnEnd; i >= columnStart; i--) {
                System.out.print(matrix[rowEnd][i] + " ");
                counter++;
            }
            rowEnd--;
            for (int i = rowEnd; i >= rowStart; i--) {
                System.out.print(matrix[i][columnStart] + " ");
                counter++;
            }
            columnStart++;
        }
    }

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static int[][] take2DInput() throws IOException {
        String[] strRowsCols = br.readLine().trim().split("\\s");
        int n_rows = Integer.parseInt(strRowsCols[0]);
        int m_cols = Integer.parseInt(strRowsCols[1]);

        if (n_rows == 0) {
            return new int[0][0];
        }


        int[][] mat = new int[n_rows][m_cols];

        for (int row = 0; row < n_rows; row++) {
            String[] strNums;
            strNums = br.readLine().trim().split("\\s");

            for (int col = 0; col < m_cols; col++) {
                mat[row][col] = Integer.parseInt(strNums[col]);
            }
        }

        return mat;
    }


    public static void main(String[] args) throws NumberFormatException, IOException {
        int t = Integer.parseInt(br.readLine().trim());

        while(t > 0) {

            int[][] mat = take2DInput();

            SpiralPattern.spiralPrint(mat);
            System.out.println();

            t -= 1;
        }
    }
}
