import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class permutationEquation {
    public static void main(String args[] ) throws Exception {
	Scanner in = new Scanner(System.in);
	int n = in.nextInt();
	int[] p = new int[n];
	for(int i = 0; i < n; i++){
		p[i] = in.nextInt();	
	}
	for(int x = 0; x < n; x++){
		int p1 = p[x];
		int p2 = p[p1];
		int answer = p[p2]; 
		System.out.println(answer);
	}
    }
}
