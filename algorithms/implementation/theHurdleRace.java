import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class theHurdleRace {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] height = new int[n];
	int counter = 0;
        for(int height_i=0; height_i < n; height_i++){
            height[height_i] = in.nextInt();
	    if(height[height_i] > k)
		counter++;
        }
	System.out.println(counter);
    }
}
