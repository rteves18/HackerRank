import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class designerPDFviewer {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] h = new int[26];
        for(int h_i=0; h_i < 26; h_i++){
            h[h_i] = in.nextInt();
        }
        String word = in.next();
	int maxHeight = 0;
	for(char letter : word.toCharArray()){
		if(maxHeight < h[letter - 'a'])
			maxHeight = h[letter - 'a'];
	}
	System.out.println(word.length() * maxHeight);
    }
}
