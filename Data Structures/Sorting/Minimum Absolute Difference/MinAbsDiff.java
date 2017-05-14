import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        Arrays.sort(a);
        int diff = Integer.MAX_VALUE;
        for(int i=0;i<a.length-1;i++){
           if(Math.abs(a[i]-a[i+1]) < diff){
               diff = Math.abs(a[i]-a[i+1]);
           }
        }
        System.out.println(diff);
    }
}
