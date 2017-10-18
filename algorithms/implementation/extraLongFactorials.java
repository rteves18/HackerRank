import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class extraLongFactorials {

public static BigInteger factorial(int num){
	BigInteger one = BigInteger.ONE;
	BigInteger fact = BigInteger.valueOf(num);
	if(num == 0) return one;
	else return fact.multiply(factorial(num - 1));
}

    public static void main(String args[] ) throws Exception {
	Scanner in = new Scanner(System.in);
        int n = in.nextInt();
	System.out.println(factorial(n));
    }
}
