import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SuperReducedString {

    static String super_reduced_string(String s){
        // Complete this function
       String str = s;
        //System.out.println(str);
        int counter = 0;
        String result[] = new String[str.length()];
        for(int i = 0; i < str.length(); i += 2){
            if(i == str.length() - 1) {
                //handle final element here...
                String a = Character.toString(str.charAt(i));
                //System.out.println("a: " + a);
                result[counter] = a;
                break;
            }
                String a = Character.toString(str.charAt(i));
                String b = Character.toString(str.charAt(i+1));
        //System.out.println("a: " + a);
        //System.out.println("b: " + b);
            if(!a.equals(b)){
                result[counter] = a; 
                result[counter+1] = b; 
                counter += 2;
            }
        }
        String output="";
        for(String strng: result){
           if(!result.equals(null))
           output=output+strng;
        }
        output = output.replace("null","");
        return output;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = super_reduced_string(s);
        System.out.println(result);
    }
}

