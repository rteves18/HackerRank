import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class catsAndMouse {

    static String whoCaughtMouse(int x, int y, int z){
    String answer;
    int distanceA = Math.abs(x - z);
    int distanceB = Math.abs(y - z); 
    if(distanceA < distanceB)
	answer = "Cat A";
    else if(distanceB < distanceA)
	answer = "Cat B";
    else
	answer = "Mouse C";
    return answer; 
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
	String[] answerArr = new String[q];
        for(int a0 = 0; a0 < q; a0++){
            int x = in.nextInt();
            int y = in.nextInt();
            int z = in.nextInt();
	    String answer = whoCaughtMouse(x, y, z);
	    answerArr[a0] = answer;
        }
	for(String ans : answerArr){
		System.out.println(ans);
	}
    }
}
