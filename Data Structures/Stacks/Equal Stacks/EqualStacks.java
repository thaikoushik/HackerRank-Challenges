import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int n3 = in.nextInt();
        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;
        int min = 0;
        Stack<Integer> st1 = new Stack<Integer>();
        Stack<Integer> st2 = new Stack<Integer>();
        
        Stack<Integer> st3 = new Stack<Integer>();
        
        int h1[] = new int[n1];
        for(int h1_i=0; h1_i < n1; h1_i++){
            h1[h1_i] = in.nextInt();
            sum1 = sum1+h1[h1_i];
           // st1.push(h1[h1_i]);
        }
        int h2[] = new int[n2];
        for(int h2_i=0; h2_i < n2; h2_i++){
            h2[h2_i] = in.nextInt();
            sum2 = sum2 + h2[h2_i];
               // st2.push(h2[h2_i]);
        }
        int h3[] = new int[n3];
        for(int h3_i=0; h3_i < n3; h3_i++){
            h3[h3_i] = in.nextInt();
            sum3 = sum3 + h3[h3_i];
            //st3.push(h3[h3_i]);
        }
        
        for(int i=h1.length-1;i>=0;i--){
            st1.push(h1[i]);
        }
        for(int i=h2.length-1;i>=0;i--){
            st2.push(h2[i]);
        }
        for(int i=h3.length-1;i>=0;i--){
            st3.push(h3[i]);
        }
        
        min = Math.min(sum1, Math.min(sum2,sum3));
        while(!((sum1 == sum2) && (sum2 == sum3)) ){
            if((sum1>min)){
                sum1 = sum1 - st1.peek();
                st1.pop();
                
                min = Math.min(sum1,min);
               // System.out.println(min);
            } else if(sum2 > min){
                sum2 = sum2 - st2.peek();
                st2.pop();
                
                min = Math.min(sum2,min);
            } else if(sum3 > min){
                sum3 = sum3 - st3.peek();
                st3.pop();
                
                min = Math.min(sum3,min);
            }
            
        }
        System.out.println(sum2);
    }
}
