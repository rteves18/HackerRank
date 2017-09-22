import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class insertionSort1 {
    


    public static void insertIntoSorted(int[] ar) {
        // Fill up this function
        boolean sorted = false;
        int temp = ar[ar.length-1];
            for(int i=ar.length-1; i > 0; i--){
                if(ar[i-1] > temp){
                    ar[i] = ar[i-1];
		    if(i-1==0)
			ar[0] = temp;
		}
                else if(ar[i-1] < temp){
                    ar[i] = temp;
                    sorted = true;
                }
                printArray(ar);
                if(sorted) break;
            }
        }
    


/* Tail starts here */
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
         for(int i=0;i<s;i++){
            ar[i]=in.nextInt();
         }
         insertIntoSorted(ar);
    }


    private static void printArray(int[] ar) {
      for(int n: ar){
         System.out.print(n+" ");
      }
        System.out.println("");
   }
        

   
}
