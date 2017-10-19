import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class sherlockAndSquares {

   public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i = 0; i < t; i++){
                int start = in.nextInt();
                int end = in.nextInt();
                System.out.println((int)Math.Floor(Math.Sqrt(end)) - (int)Math.Ceiling(Math.Sqrt(start)) + 1);
        }
    }
}
