import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class equalizeTheArray {
    public static void main(String args[] ) throws Exception {
	Scanner in = new Scanner(System.in);
	int n = in.nextInt();
	int[] arr = new int[n];
	int[] freq = new int[1000];
	int maxCount = 0;
	int maxNum = 0;
	for(int i = 0; i < n; i++){
		arr[i] = in.nextInt();
		freq[arr[i]]++;
		//max num and curent num the same
		if(maxNum == arr[i]){
			maxCount++;
		//current count is more than maxCount
		} else if(freq[arr[i]] > maxCount){
			maxNum = arr[i];
			maxCount = freq[arr[i]];
		}
	}
	System.out.println(n - maxCount);
	
    }
}
