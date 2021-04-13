package twoDArrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LargestRowOrColumn {
    public static void findLargest(int mat[][]) {
        int maxRowSum = Integer.MIN_VALUE;
        int indexRowSum = 0;
        int maxColSum = Integer.MIN_VALUE;
        int indexColSum = 0;
        for (int i = 0; i < mat.length; i++) {
            int rowSum = 0;
            for (int j = 0; j < mat[0].length; j++)
                rowSum += mat[i][j];
            if (rowSum > maxRowSum) {
                maxRowSum = rowSum;
                indexRowSum = i;
            }
        }
        for (int i = 0; i < mat[0].length; i++) {
            int colSum = 0;
            for (int j = 0; j < mat.length; j++)
                colSum+= mat[j][i];
            if(colSum > maxColSum) {
                maxColSum = colSum;
                indexColSum = i;
            }
        }
        if(maxColSum > maxRowSum)
            System.out.println("column " + indexColSum + " " + maxColSum);
        else
            System.out.println("row " + indexRowSum + " " + maxRowSum);
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

            LargestRowOrColumn.findLargest(mat);
            System.out.println();

            t -= 1;
        }
    }
}
