import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] calories = new int[n];
        for(int calories_i=0; calories_i < n; calories_i++){
            calories[calories_i] = in.nextInt();
        }
        // your code goes here
        long miles = 0;
        Arrays.sort(calories);
        //System.out.println(Arrays.toString(calories));
        for(int i=0;i<calories.length;i++){
            //System.out.println(calories[i]);
            //System.out.println(Math.pow(i,2));
            int len = calories.length;
            int temp = calories[len - i - 1];
            miles += temp*(Math.pow(2,i));
           // System.out.println(miles);
        }
        System.out.println(miles);
   
