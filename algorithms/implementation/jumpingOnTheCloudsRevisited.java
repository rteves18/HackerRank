import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class jumpingOnTheCloudsRevisited {
    public static void main(String args[] ) throws Exception {
	Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int c[] = new int[n];
	int energy = 100;
        for(int c_i=0; c_i < n; c_i++){
            c[c_i] = in.nextInt(); 
        }
	for(int i = 0; i < n; i+=k){
		energy -= 1;			
		if(c[i] == 1) energy -= 2;
	}
	System.out.println(energy);
    }
}
