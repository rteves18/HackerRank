import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class cutTheStick {

    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();	
	}
	Arrays.sort(arr);
	System.out.println(n);
	int sticks = n;
	int count = 0;
	for(int i=0; i < n-1; i++){
		if(arr[i] == arr[i+1]){
			count += 1;		
		} else if(arr[i] != arr[i+1]){
			count += 1;
			sticks = sticks - count;
			System.out.println(sticks);
			count = 0;
		}	
	}
    }
}
