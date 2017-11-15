import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class queensAttack {
    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int rQueen = in.nextInt();
        int cQueen = in.nextInt();
	int count = 0;
	Map<Integer, Integer> blocker = new HashMap<Integer, Integer>();
        for(int a0 = 0; a0 < k; a0++){
            int rObstacle = in.nextInt();
            int cObstacle = in.nextInt();
	    blocker.put(rObstacle, cObstacle);
    }
	//Horizontal
	count += (n - 1) * 2;	

	//Diagnols

	//Odd
	if(n % 2 != 0){
		count += (n - rQueen) + (n - cQueen);
		count += (rQueen - 1) + (n - cQueen);
	} else {
		
	}

	System.out.println(count);
	}
}
