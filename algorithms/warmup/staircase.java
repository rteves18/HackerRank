/*
Consider a staircase of size n=4:

   #
  ##
 ###
####
Observe that its base and height are both equal to n, and the image is drawn using # symbols and spaces. The last line is not preceded by any spaces.

Write a program that prints a staircase of size n.

Input Format

A single integer, n, denoting the size of the staircase.

Output Format

Print a staircase of size n using # symbols and spaces.
*/

import java.io.*;
import java.util.*;

public class staircase {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        for(int j=0;j<num;j++){
            for(int i=1;i<=num;i++){
                System.out.print(i<num-j?" ":"#");
            }
            System.out.println("");
        }
    }
}
