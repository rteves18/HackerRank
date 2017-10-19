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
	int char_diff = 0;
	int max_len = s.length() + t.length();
	String answer = "No";
        int k = in.nextInt();
	int diff = Math.abs(s.length() - t.length());
	if(diff == 0){
		if(k >= max_len) answer = "Yes";
		else {
			for(int i = 0; i < s.length(); i++){
				if(s.charAt(i) != t.charAt(i)){
				char_diff =  s.length() - i;
				break;
				}
			}
			if(char_diff % 2 == 0 && k % 2 == 0) answer = "Yes";
			if(char_diff % 2 != 0 && k % 2 != 0) answer = "Yes";
			if(k < char_diff * 2) answer = "No";
		}	
	} else if (diff % 2 == 0){
		if(k % 2 == 0) answer = "Yes";
	} else{
		if(k % 2 != 0) answer = "Yes";
	}
	if(k >= max_len) answer = "Yes";
	System.out.println(answer);
    }
}
