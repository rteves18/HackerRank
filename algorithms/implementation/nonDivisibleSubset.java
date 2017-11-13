import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class nonDivisibleSubset {
    public static void main(String args[] ) throws Exception {
	Scanner in = new Scanner(System.in);
	int n = in.nextInt();
	int k = in.nextInt();
	int count = 0;
	int[] arr = new int[n];
	Map<Integer, Integer> set = new HashMap<Integer, Integer>();
	int[] pair = new int[(k/2) + 1];
	int modNum = 0;
	boolean even = false;
	boolean noMore = true;
	if(k % 2 == 0) even = true;
	//populate hashmap of subset's mod
	for(int i = 0; i < n; i++){
		arr[i] = in.nextInt();
		modNum = arr[i] % k;	
		if(modNum  == 0 && noMore){
			count++;
			noMore = false;
		}
		if(!set.containsKey(modNum))
			set.put(modNum, 1);
		else
			set.put(modNum, set.get(modNum) + 1);
	}
/*
	for(Map.Entry<Integer, Integer> num : set.entrySet()) {
		System.out.println(num);
	}
*/
	//Calculate/populate pair array
	for(int x = 0; x < pair.length; x++){
		pair[x] = k - x;
//		System.out.println(x + ": " + pair[x]);
	}
	if(k == 1){
		System.out.println(1);
	} else {
		for(int j = 1; j < pair.length; j++){
//		System.out.println("j: " + j);
			int pairA = 0;
			int pairB = 0;
			//you can only have one 0	
			//if k is even, you can only have one of k/2
			if(j == k/2 && even &&  set.get(j) >= 1){
				count++;
//				System.out.println("count0: " + count);
				continue;
			}
			//else pick the greater of the two in each pair
			if(set.containsKey(j))
				pairA = set.get(j); 
			if(set.containsKey(pair[j]))
				pairB = set.get(pair[j]);
			if(pairA > pairB || pairA == pairB){
				count += pairA;
//				System.out.println("countA: " + count);
			} else {
				count += pairB;
//				System.out.println("countB: " + count);
			}
		} 	
	System.out.println(count);
    	}
    }	
}
