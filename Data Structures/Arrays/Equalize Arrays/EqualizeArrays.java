import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] c = new int[n];
    HashMap<Integer,Integer> hs = new HashMap<Integer,Integer>();
    for(int i=0;i<n;i++){
        c[i] = sc.nextInt();
        if(!hs.containsKey(c[i])){
            hs.put(c[i],1);
        }else {
            hs.put(c[i],hs.get(c[i])+1);
        }
    }
    Map.Entry<Integer,Integer> maxint = null;
    for(Map.Entry<Integer,Integer> entry : hs.entrySet()){
        if(maxint == null || entry.getValue().compareTo(maxint.getValue()) >0){
            maxint = entry;
        }
    }
        System.out.println(n-maxint.getValue());
    }
}
