package com.epam.rd.autotasks.matrices;

import java.util.Arrays;

public class MultiplyMatrix {

  public static int[][] multiply(int[][] matrix1, int[][] matrix2) {
    int R1 = matrix1.length;
    int R2 = matrix2.length;
    int C2 = matrix2[0].length;
    int C1 = matrix1[0].length;
    int[][] rslt = new int[R1][C2];

    System.out.println();
    int i, j, k;
    for (i = 0; i < R1; i++) {
      for (j = 0; j < C2; j++) {
        rslt[i][j] = 0;
        for (k = 0; k < R2; k++) {
          rslt[i][j] += matrix1[i][k] * matrix2[k][j];
        }
        System.out.print(rslt[i][j] + " ");
      }
      System.out.println();
    }

    return rslt;
  }

  public static void main(String[] args) {

    System.out.println("Test your code here!\n");

    int[][] matrix1 = {
        {0, 12345},
        {4509, 0},
        {3, 567}};

    int[][] matrix2 = {
        {653, 0, 25353},
        {0, 61, 6}};

    int[][] rslt = multiply(matrix1, matrix2);
    System.out.println(Arrays.deepToString(rslt).replace("],", "]\n"));

  }
}












