import java.io.*;
import java.util.*;

public class utopianTree {

    static int grow(int a, int b){
	int x = b == 0 ? a*2 : a+1;
	System.out.println("step: " + x);
	return x;
    }

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int t = in.nextInt();
	int height = 1;
	int[] results = new int[t];
	for(int j = 0; j < t; j++){
		int cycles = in.nextInt();
		for(int i = 0; i <= cycles; i++){
			if(i == 0)
				height = 1;
			else if(i % 2 == 1)
				height *= 2;
			else
				height += 1;
		}
		results[j] = height;
		height = 1;
	}
	for(int x : results)
		System.out.println(x);
    }
}
