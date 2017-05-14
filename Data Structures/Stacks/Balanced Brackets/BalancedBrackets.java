import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            String s = in.next();
            
            char[] a = s.toCharArray();
        Stack<Character> st = new Stack<Character>();
        for(int i=0;i<a.length;i++){
            if(st.isEmpty()){
                st.push(a[i]);
            } else if(st.peek() == '{' && a[i] == '}'){
                st.pop();
            } else if(st.peek() == '[' && a[i] == ']'){
                st.pop();
            } else if(st.peek() == '(' && a[i] == ')'){
                st.pop();
            } else {
                st.push(a[i]);
            }
        }
        System.out.println(st.isEmpty() ? "YES": "NO");
        }
        
    }
}
