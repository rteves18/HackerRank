/*

A kidnapper wrote a ransom note but is worried it will be traced back to him. He found a magazine and wants to know if he can cut out whole words from it and use them to create an untraceable replica of his ransom note. The words in his note are case-sensitive and he must use whole words available in the magazine, meaning he cannot use substrings or concatenation to create the words he needs.

Given the words in the magazine and the words in the ransom note, print Yes if he can replicate his ransom note exactly using whole words from the magazine; otherwise, print No.

Input Format

The first line contains two space-separated integers describing the respective values of  (the number of words in the magazine) and  (the number of words in the ransom note). 
The second line contains  space-separated strings denoting the words present in the magazine. 
The third line contains  space-separated strings denoting the words present in the ransom note.

Output Format

Print Yes if he can use the magazine to create an untraceable replica of his ransom note; otherwise, print No.

Sample Input 0
6 4
give me one grand today night
give one grand today

Sample Output 0
Yes

Sample Input 1
6 5
two times three is not four
two times two is four

Sample Output 1
No

*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ransomNote {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        String magazine[] = new String[m];
        Map<String, Integer> ransomHm = new HashMap<String, Integer>();
        Map<String, Integer> magHm = new HashMap<String, Integer>();
        for(int magazine_i=0; magazine_i < m; magazine_i++){
            magazine[magazine_i] = in.next();
        }
        String ransom[] = new String[n];
        for(int ransom_i=0; ransom_i < n; ransom_i++){
            ransom[ransom_i] = in.next();
        }
        
        for (String str : ransom){
            if(!ransomHm.containsKey(str))
                ransomHm.put(str, 1);
            else
                ransomHm.put(str, ransomHm.get(str)+1);
        }
        
        for(String str : magazine){
            if(ransomHm.containsKey(str) && ransomHm.get(str) != 0)
                ransomHm.put(str, ransomHm.get(str)-1);
        }
       
        int finalCount = 0;
        for (Map.Entry<String, Integer> word : ransomHm.entrySet()){
           finalCount += word.getValue(); 
        }
        
        if(finalCount == 0) System.out.println("Yes");
        else System.out.println("No");
    }
}

