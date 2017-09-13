/*
A flock of  birds is flying across the continent. Each bird has a type, and the different types are designated by the ID numbers 1, 2, 3, 4, and 5.

Given an array of  integers where each integer describes the type of a bird in the flock, find and print the type number of the most common bird. If two or more types of birds are equally common, choose the type with the smallest ID number.

Input Format

The first line contains an integer denoting  (the number of birds). 
The second line contains  space-separated integers describing the respective type numbers of each bird in the flock.

Output Format

Print the type number of the most common bird; if two or more types of birds are equally common, choose the type with the smallest ID number.

Sample Input 0
6
1 4 4 4 5 3

Sample Output 0
4
*/


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MigratoryBirds {

    static int migratoryBirds(int n, int[] ar) {
        int max = 0;
        int maxType = 0;
        int[] type = new int[5];
        for(int i=0; i < n; i++){
            type[ar[i]-1]++;
            if(type[ar[i]-1] > max){
                max = type[ar[i]-1];
                maxType = ar[i];
            } else if(type[ar[i]-1] == max){
                if(maxType > ar[i])
                    maxType = ar[i];
            }
            
        }
        /*
        for(int i : type){
            System.out.println(i);
        }
        */
        return maxType;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = migratoryBirds(n, ar);
        System.out.println(result);
    }
}
