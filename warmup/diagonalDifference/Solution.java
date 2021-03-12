import java.util.*;
import java.io.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.Math;

public class Solution {
    public static final int MAXMATRIX = 100;

    public static void main(String[] args) {

        // Read in the size of the (N x N) matrix
        // int matrixSize = Integer.parseInt(System.console().readLine());XS

        int diag1 = 0;
        int diag2 = 0;

        Scanner in = new Scanner(System.in);
        System.out.print("How big is the matrix?XS ");
        int matrixSize = in.nextInt();
        int matrix[][] = new int[matrixSize][matrixSize];
        for (int i = 0; i < matrixSize; i++) {
            for (int j = 0; j < matrixSize; j++) {
                // System.out.println("matrix[" + i + "][" + j + "]");
                matrix[i][j] = in.nextInt();
            }
        }

        for (int k = 0; k < matrixSize; k++) {
            diag1 = diag1 + matrix[k][k];
        }
        System.out.println("Size of matrix before: " + matrixSize);

        for (int m = 0; m < matrixSize; m++) { // diag2 = diag2 +
            diag2 = diag2 + matrix[m][(matrixSize - 1) - m];
        }

        System.out.println("Diagonal Difference beween" + diag1 + " and " + diag2 + " is: " + Math.abs(diag1 - diag2));

    }

}