import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class repreatedString {
    public static void main(String args[] ) throws Exception {
	Scanner in = new Scanner(System.in);
        String s = in.next();
        long n = in.nextLong();
	long counter = s.split("a", -1).length - 1;
	long remander = n % s.length();
//	System.out.println("r: " + remander);
	String r = "";
	if(remander != 0)
		r = s.substring(0, (int) remander);
	long counterR = r.split("a", -1).length -1;
	System.out.println(counter * (n / s.length()) + counterR);
    }
}
