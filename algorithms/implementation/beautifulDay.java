import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class beautifulDay {

    static int reverse(int input){
	int reversedNum = 0;
	while (input != 0) {
    		reversedNum = reversedNum * 10 + input % 10;
    		input = input / 10;   
	}
	System.out.println(reversedNum);
	return reversedNum;
    }

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int i = in.nextInt();
	int j = in.nextInt();
	int k = in.nextInt();
	int counter = 0;
	for(int y = i; y <= j; y++){
	int top = Math.abs(y - reverse(y));
	double bottom = top * 1.0 / k;
	System.out.println(bottom);
	if(bottom % 1 == 0)
		counter++;
	}
	System.out.println(counter);
    }
}
