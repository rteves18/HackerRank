import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SuperReducedString {

    static String super_reduced_string(String s){
        // Complete this function
        StringBuffer sb = new StringBuffer(s);
        String str = "";
        if(sb.length() > 1){
        for(int i = 1; i < sb.length(); i++){
                if(sb.charAt(i) == sb.charAt(i-1)){
                  sb.delete(i-1, i+1); 
                  i = 0;
                }
            }
        }
        if(sb.length() == 0) {
            return "Empty String";
        } else {
            str = sb.toString();
            return str;
        } 
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = super_reduced_string(s);
        System.out.println(result);
    }
}

