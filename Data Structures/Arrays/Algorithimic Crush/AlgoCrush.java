import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        long[] al = new long[n+1];
        for(int i=0;i<q;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int k = sc.nextInt();
            /*for(int j=a-1;j<b;j++){
                al[j] += k;
            }*/
          //  System.out.println(Arrays.toString(al));
            al[a-1] += k;
            al[b] -= k;
         //   System.out.println(Arrays.toString(al));
        }
        long max =0;
        long sum =0;
        for(int i=0;i<n;i++){
            sum += al[i];
            max = Math.max(sum,max);
            /*if(al[i]>max){
                max = al[i];
            }*/
        }
        System.out.println(max);
    }
}
