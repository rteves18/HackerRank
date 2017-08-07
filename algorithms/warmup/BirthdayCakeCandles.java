mport java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BirthdayCakeCandles {

    static int birthdayCakeCandles(int n, int[] ar) {
        // Complete this function
        int max = ar[0];
        int counter = 1;
       for(int i = 1; i < n; i++){
           if(max < ar[i]){
               max = ar[i];
               counter = 1;
           } else if(max == ar[i]){
               counter++;
           }
       }
        return counter;
    }
            

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = birthdayCakeCandles(n, ar);
        System.out.println(result);
    }
}

