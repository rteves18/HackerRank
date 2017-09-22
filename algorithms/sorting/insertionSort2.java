import java.io.*;
import java.util.*;

public class Solution {

    public static void insertionSortPart2(int[] ar)
    {      
            for(int i=0; i < ar.length; i++){
	    if(ar[i] > ar[i+1]){
		int right = ar[i+1];
		int left = ar[i];
		int counter = i;
	    	while(left >= right && counter >= 0){
			ar[counter+1] = left;
			ar[counter] = right;
			if(counter !=1)
				counter--;
			if(counter >= 0){
				left = ar[counter];
				right = ar[counter+1];
			}
		}
	    }
	    printArray(ar);
            }
    }  
    
    
      
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       int s = in.nextInt();
       int[] ar = new int[s];
       for(int i=0;i<s;i++){
            ar[i]=in.nextInt(); 
       }
       insertionSortPart2(ar);    
                    
    }    
    private static void printArray(int[] ar) {
      for(int n: ar){
         System.out.print(n+" ");
      }
        System.out.println("");
   }
}
