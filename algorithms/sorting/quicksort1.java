import java.io.*;
import java.util.*;

public class quicksort1 {

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int n = in.nextInt();
	int[] arr = new int[n];
	for(int i=0; i < n; i++){
	arr[i] = in.nextInt();	
	}
	for(int x : arr)
		System.out.print(x);
    }
}
