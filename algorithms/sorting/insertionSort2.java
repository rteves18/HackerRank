import java.io.*;
import java.util.*;

public class Solution {

    public static void insertionSortPart2(int[] ar)
    {      
            for(int i=0; i < ar.length; i++){
		int key = ar[i];
		int counter = i-1;
	    	while(counter >= 0 && ar[counter] >= key){
			ar[counter+1] = ar[counter];
			counter--;
		}
		ar[counter+1] = key;
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
