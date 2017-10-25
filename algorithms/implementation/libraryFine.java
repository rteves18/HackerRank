import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class libraryFine {
    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        int d1 = in.nextInt();
        int m1 = in.nextInt();
        int y1 = in.nextInt();
        int d2 = in.nextInt();
        int m2 = in.nextInt();
        int y2 = in.nextInt();
        int answer = 0;
        if(y2 < y1) answer = 10000;
        else if(y2 > y1) answer = 0;
        else if(m2 < m1) answer = 500 * (m1 - m2);
        else if(m2 > m1) answer = 0;
        else if(d2 < d1) answer = 15 * (d1 - d2);
        else if(d2 >= d1) answer = 0;
        System.out.println(answer);
        }
}
