/*
Given an array of integers, calculate which fraction of its elements are positive, which fraction of its elements are negative, and which fraction of its elements are zeroes, respectively. Print the decimal value of each fraction on a new line.

Input Format

The first line contains an integer, N, denoting the size of the array. 
The second line contains N space-separated integers describing an array of numbers (a0, a1, ... an-1).

Output Format

You must print the following  lines:

A decimal representing of the fraction of positive numbers in the array compared to its size.
A decimal representing of the fraction of negative numbers in the array compared to its size.
A decimal representing of the fraction of zeroes in the array compared to its size.
Sample Input

6
-4 3 -9 0 4 1         
Sample Output

0.500000
0.333333
0.166667

*/

import java.io.*;
import java.util.*;

public class PlusMinus {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        double[] num = new double[n];
        double pos, neg, zer;
        pos = 0;
        neg = 0;
        zer = 0;
        for(int i = 0; i < n; i++){
            num[i] = in.nextLong();
            if(num[i] > 0) pos++;
            if(num[i] == 0) zer++;
            if(num[i] < 0) neg++;
            
        }
        System.out.println(pos/n);
        System.out.println(neg/n);
        System.out.println(zer/n);
    }
}
