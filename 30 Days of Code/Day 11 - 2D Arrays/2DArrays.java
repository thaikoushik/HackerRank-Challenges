import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
        int max = Integer.MIN_VALUE;
        int count = 0;
        for(int r = 0;r<4;r++){
            for (int c=0;c<4;c++){
                //int sums = sumIs(arr,i,j);/
                int sums = arr[r][c]+arr[r][c+1]+arr[r][c+2]+arr[r+1][c+1]+arr[r+2][c]+arr[r+2][c+1]+arr[r+2][c+2];
                max = Math.max(sums,max);
            }
        }
        System.out.print(max);
    }
       
}
