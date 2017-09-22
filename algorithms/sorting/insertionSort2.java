import java.io.*;
import java.util.*;

public class insertionSort2 {

    public static void insertionSortPart2(int[] ar)
    {      
            for(int i=1; i < ar.length; i++){
		int key = ar[i];
		int counter = i;
	    	while(counter >= 1 && ar[counter-1] >= key){
			ar[counter] = ar[counter-1];
			counter--;
		}
		ar[counter] = key;
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
