import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class magicSquare {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] s = new int[3][3];
	int x, y;
        for(int s_i=0; s_i < 3; s_i++){
            for(int s_j=0; s_j < 3; s_j++){
                s[s_i][s_j] = in.nextInt();
		if(s[s_i][s_j] == 1){
			x = s_i;
			y = s_j;                 
			System.out.println(x + " " + y);
		}
            }
        }
        //  Print the minimum cost of converting 's' into a magic square
	/*
        for(int i=0; i < 3; i++){
            for(int j=0; j < 3; j++){
	*/	
    }
}
