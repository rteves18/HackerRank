import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class climbingTheLeaderboard {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
	int rankNum = 0;
        int n = in.nextInt();
        int[] scores = new int[n];
        for(int scores_i=0; scores_i < n; scores_i++){
	    int temp = in.nextInt();
//	    System.out.println("rankNum: " + rankNum);	
//	    System.out.println("input: " + temp);	
	    if(scores_i != 0){
//	    System.out.println("scores[rankNum-1]: " + scores[rankNum-1]);	
	}
	    if(scores_i == 0){ 
		scores[scores_i] = temp;
		if(n > 1)
		rankNum +=1;
		}
	    else if(scores[rankNum-1] !=temp){
            	scores[rankNum] = temp;
		rankNum += 1;
	    }
        }
//	for(int x : scores)
//		System.out.println(x);
        int m = in.nextInt();
        int[] alice = new int[m];
        for(int alice_i=0; alice_i < m; alice_i++){
            alice[alice_i] = in.nextInt();
        }
	int[] rank = new int[m];
	int counter = 0;
	int j = 0;
	boolean rankFound = false;
	for(int i =0; i < m; i++){
		rankFound = false;
		while(!rankFound){
	    		System.out.println("rankNum: " + rankNum);	
	    		System.out.println("counter: " + counter);	
			j = rankNum-counter;	
			if(j < 0){
				System.out.println(1);
				rankFound = true;
				break;
			}
			if(alice[i] == scores[j]){
				System.out.println(j+1);
				counter += 1;
				rankFound = true;
			} else if(alice[i] < scores[j]){
				System.out.println(j+2);
				rankFound = true;
			} else if(alice[i] > scores[j])
				counter += 1;
		}
//		System.out.println("Finding next rank..");
	}	
    }
}
