import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class pickingNumbers {
    
    static int pickNum(Map<Integer, Integer> numCount, int[] a){
    int count, pairSub, compare = 0;
    for(int i = 1; i < a.length; i++){
    pairSub = Math.abs(a[i] - a[i-1]);
    if(pairSub <= 1){
	int numCount_i = numCount.get(a[i]);
	int numCount_j = numCount.get(a[i-1]);
	if(a[i-1] != a[i]) 
		compare = numCount_i + numCount_j;
	else 
		compare = numCount_i;
	if(compare > count)
		count = compare;
    	}
    }
	return count;
}

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
	Map<Integer, Integer> numCount = new HashMap<Integer, Integer>();
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
	    if(!numCount.containsKey(a[a_i]))
		numCount.put(a[a_i], 1);
	    else
		numCount.put(a[a_i], numCount.get(a[a_i])+1);
        }
	//Print HashMap
//	for(Map.Entry<Integer, Integer> num : numCount.entrySet())
//	System.out.println(num);
	Arrays.sort(a);
	int answer = pickNum(numCount, a);
	System.out.println(answer);
    }
}
