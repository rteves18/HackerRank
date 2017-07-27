/*
Given a square matrix of size N x N , calculate the absolute difference between the sums of its diagonals.

Input Format

The first line contains a single integer, N. The next N lines denote the matrix's rows, with each line containing N space-separated integers describing the columns.

Output Format

Print the absolute difference between the two sums of the matrix's diagonals as a single integer.

Sample Input

3
11 2 4
4 5 6
10 8 -12
Sample Output

15
*/

import java.io.*;
import java.util.*;
import java.lang.*;

public class DiagonalDifference {
    

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] ar;
        int first = 0;
        int second = 0;
        ar = new int[n][n];
        
        for(int row = 0; row < n; row++){
            for(int col = 0; col < n; col++){
                ar[row][col]=in.nextInt();
                if(row == col){
                    first += ar[row][col];
                } if (row + col == n - 1){
                    second +=ar[row][col];
                }
            }
        }
        
        int result = Math.abs(first - second);
        System.out.println(result);
    }
}
