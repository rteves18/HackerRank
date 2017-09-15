import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class kangaroo {

 static String kangaroo(int x1, int v1, int x2, int v2) {
    // Complete this function
    // x1+m*v1=x2+mv2 => m=(x1-x2)/(v2-v1) , m is steps and
    //m should not be negetive and 
    //remainder should be zero
    int x=x1-x2;
    int v=v2-v1;
    String answer = "NO";
    if(v!=0){
        answer  = x%v==0 && x/v>0 ? "YES" : "NO";
        return answer;
    } else 
        return answer;
    
} 

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        String result = kangaroo(x1, v1, x2, v2);
        System.out.println(result);
    }
}

