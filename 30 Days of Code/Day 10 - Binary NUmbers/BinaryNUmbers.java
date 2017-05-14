import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int count = 0;
        int max = 0;
        String abc = Integer.toBinaryString(n);
        for(int i=0;i<abc.length();i++){
            if(abc.charAt(i) == '1'){
                count++;
                max = Math.max(count, max);
            }
            else{
                count = 0;
            }
           
        }
        System.out.print(max);
    }
}
