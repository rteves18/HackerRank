import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MinMaxSum {
    
    static int Max(int[] arr){
        int max = arr[0];      
        for(int i = 1; i < arr.length; i++){
            max = max > arr[i] ? arr[i-1] : arr[i];
        }
        return max;
    }
    
    static int Min(int[] arr){
        int min = arr[0];      
        for(int i = 1; i < arr.length; i++){
           min =  min < arr[i] ? arr[i-1] : arr[i];
        }
        return min;
    }
    
    static int[] sumArray(int[] arr){
        int[] sumArr = new int[5];
        int temp;
        for(int i = 0; i < 5; i++){
            temp = 0;
            for(int j = 0; j < 5; j++){
                if(j != i)
                temp += arr[j];
                //System.out.println(temp);
            }
            sumArr[i] = temp;
        }
        //System.out.println(sumArr);
        return sumArr;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for(int arr_i=0; arr_i < 5; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        System.out.println(arr);
        sumArray(arr);
        //System.out.println(summ);
        //Max(summ);
        //Min(summ);
        //System.out.println(Max(summ) + " " + Min(summ));
    }
}
