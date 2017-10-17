import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class findDigits {
    public static void main(String args[] ) throws Exception {
	Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
	    int counter = 0;
            int n = in.nextInt();
	    int num = n;
	    while(num != 0){
		int last_digit = num % 10;
		if(last_digit != 0 && n % last_digit == 0) 
			counter++;
		num = num / 10;
		
	    }
	System.out.println(counter);
        }
    }
}
