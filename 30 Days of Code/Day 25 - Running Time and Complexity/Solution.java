import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. */
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            int x = sc.nextInt();
            System.out.println(isPrime(x)? "Prime":"Not prime");
        }
        sc.close();
    }
        public static boolean isPrime(int x){
            if(x<2){
                return false;
            }
            for(int i=2;i<=Math.sqrt(x);i++){
                if(x%i == 0) return false;
                
            }
            return true;
        }
    
}
