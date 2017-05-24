import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ClimbingtheLeaderboard {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] scores = new int[n];
        for(int scores_i=0; scores_i < n; scores_i++){
            scores[scores_i] = in.nextInt();
        }
        int[] ranks = getRanks(scores);
        int m = in.nextInt();
        //int[] alice = new int[m];
        for(int alice_i=0; alice_i < m; alice_i++){
            //alice[alice_i]
            int alice = in.nextInt();
            ranksOfAlice(scores,ranks,alice);
        }
    }
        // your code goes here
        static int[] getRanks(int[] scores){
            int[] ranks = new int[scores.length];
            int rank = 1;
            for(int i=0;i<ranks.length;i++){
                if(i>0 && scores[i] != scores[i-1]){
                    rank++;
                }
                ranks[i] = rank;
            }
            return ranks;
        }
    
    static void ranksOfAlice(int[] scores, int[] ranks, int aliceV){
        int l=0,u=scores.length-1;
        int rank =1;
        while(l<=u){
            int m = (l+u)/2;
            if(aliceV == scores[m]){
                rank = ranks[m];
                break;
            } else if(aliceV < scores[m]){
                rank = ranks[m] + 1;
                l = m+1;
            } else {
                u = m-1;
            }
        }
        System.out.println(rank);
    }
        
    }

