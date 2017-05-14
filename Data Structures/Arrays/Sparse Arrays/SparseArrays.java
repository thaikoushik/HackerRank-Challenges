import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] stra = new String[n];
        HashMap<String,Integer> hm = new HashMap<String,Integer>();
        for(int i=0;i<n;i++){
            stra[i] = sc.next();
            if(hm.containsKey(stra[i])){
                hm.put(stra[i],hm.get(stra[i])+1);
            }else{
                hm.put(stra[i],1);
            }
        }
        int q = sc.nextInt();
        String[] qu = new String[q];
        for(int i=0;i<q;i++){
            qu[i] = sc.next();
            if(hm.containsKey(qu[i])){
                System.out.println(hm.get(qu[i]));
            }else{
                System.out.println(0);
            }
        }
        
        
    }
}
