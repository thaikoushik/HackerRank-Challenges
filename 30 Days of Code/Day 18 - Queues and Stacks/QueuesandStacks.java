public class Solution {
    // Write your code here.
    Stack<Character> stash = new Stack<Character>();
    Queue<Character> ques = new LinkedList<>();
    public void pushCharacter(char c){
        stash.push(c);        
    }
    public void enqueueCharacter(char c){
        ques.add(c);
    }
    public char popCharacter(){
        return stash.pop();
    }
    public char dequeueCharacter(){
        return ques.remove();
    }
