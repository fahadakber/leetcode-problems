package com.fahad;

/*
48. Rotate Image
Problem Type - Medium
You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).

You have to rotate the image in-place, which means you have to modify the input 2D matrix directly.
DO NOT allocate another 2D matrix and do the rotation.

Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [[7,4,1],[8,5,2],[9,6,3]]

Input: matrix = [[5,1,9,11],[2,4,8,10],[13,3,6,7],[15,14,12,16]]
Output: [[15,13,2,5],[14,3,4,1],[12,6,8,9],[16,7,10,11]]

Constraints:

    n == matrix.length == matrix[i].length
    1 <= n <= 20
    -1000 <= matrix[i][j] <= 1000

 */

public class RotateImage {
    public void rotate(int[][] matrix) {

        //transpose(matrix);
        transpose2(matrix);
        //reflect(matrix);
        reflect2(matrix);


    }

    private void transpose(int[][] matrix) {
        int n = matrix.length;
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n ;j++){
                int tmp = matrix[j][i];
                matrix[j][i] = matrix[i][j];
                matrix[i][j] = tmp;
            }
        }
    }

    private void reflect(int[][] matrix){
        int n = matrix.length;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n / 2; j++){
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[i][n-j-1];
                matrix[i][n-j-1] = tmp;
            }
        }
    }

    private void transpose2(int[][] matrix) {
        int n = matrix.length;
        for(int i = n - 1; i >= 0; i--){
            for(int j = i - 1; j >= 0 ;j--){
                int tmp = matrix[j][i];
                matrix[j][i] = matrix[i][j];
                matrix[i][j] = tmp;
            }
        }
    }
    private void reflect2(int[][] matrix){
        int n = matrix.length;
        for(int i = n - 1; i >= 0; i--){
            for(int j = n-1; j >= n / 2; j--){
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[i][n-j-1];
                matrix[i][n-j-1] = tmp;
            }
        }
    }
}
