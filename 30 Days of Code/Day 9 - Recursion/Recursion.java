import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int fac = sc.nextInt();    
        System.out.println(factorial(fac));
        sc.close();
    }
        public static int factorial(int fact){
          int sum =1;
            while(fact>0){
            sum *= fact;
            fact--;
            }
        return sum;
      }
}
