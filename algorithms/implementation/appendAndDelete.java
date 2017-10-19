import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class appendAndDelete {
    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String t = in.next();
        int k = in.nextInt();
	char[] sArr = s.toCharArray();
	char[] tArr = t.toCharArray();
	for(int i = 0; i < s.length(); i++){
		System.out.println("s " + sArr[i]);
		System.out.println("t " + tArr[i]);
		if(sArr[i] != tArr[i]){
			System.out.println(k);
			k = k - (t.length() - i);
			System.out.println(k);
			k = k - (s.length() - i);
			System.out.println(k);
			break;
		}
	System.out.println(k);
	}
	String answer = "";
	answer = k == 0 ? "Yes" : "No";
	System.out.println(answer);
    }
}
