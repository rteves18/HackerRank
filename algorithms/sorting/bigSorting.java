import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class bigSorting {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] unsorted = new String[n];
        for(int unsorted_i=0; unsorted_i < n; unsorted_i++){
            unsorted[unsorted_i] = in.next();
        }
	
	Array.sort(unsorted, new Comparator<String>() {
		@Override
		public int compare(String a, String b) {
			return StringAsIntegerCompare(a,b);
		}
	});
	
	StringBuilder output = new StringBuilder("");
	for(String num : unsorted)
		output.append(num+"\n");
	System.out.println(output);
	}	
	
	static int StringAsIntegerCompare(String s1, String s2){
		if(s1.length() > s2.length()) return 1;	
		if(s1.length() < s2.length()) return -1;	
		for(int i= 0; i < s1.length(); i++){
			if((int)s1.charAt(i) > (int)s2.charAt(i)) return 1;
			if((int)s1.charAt(i) < (int)s2.charAt(i)) return -1;
		}
		return 0;
	}
    }
}
