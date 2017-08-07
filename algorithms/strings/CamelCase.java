iimport java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CamelCase {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int counter = 1;
        for(char c : s.toCharArray()) {
            if(Character.isUpperCase(c))
                counter++;
        }
    System.out.println(counter);
    }
}

