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
	Set<Integer> set = new HashSet<Integer>();
	try{
        	for(int i=0; i < n; i++){
			set.add(in.nextInt());
		} 
	} catch(Exception e) {}
	
	for(Integer x : set){
		System.out.println(x);
	}
    }
}
