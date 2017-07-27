/*
Input Format

The first line contains 3  space-separated integers,a0 , a1, and a2, describing the respective values in triplet . 
The second line contains 3 space-separated integers, b0, b1, and b2, describing the respective values in triplet .

Output Format

Print two space-separated integers denoting the respective comparison points earned by Alice and Bob.

Sample Input

5 6 7
3 6 10
Sample Output

1 1 
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CompareTheTriplets {

    static int[] solve(int a0, int a1, int a2, int b0, int b1, int b2){
        // Complete this function
        int a = 0;
        int b = 0;
        
        if(a0 > b0) a++;
        else if(a0 < b0) b++;
        if(a1 > b1) a++;
        else if(a1 < b1) b++;
        if(a2 > b2) a++;
        else if(a2 < b2) b++;
        int[] res = {a,b};
        return res;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();
        int[] result = solve(a0, a1, a2, b0, b1, b2);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");
        

    }
}
