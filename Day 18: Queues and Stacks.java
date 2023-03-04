

public class Solution {
    // Write your code here.
LinkedList<Character> queue = new LinkedList();
    LinkedList<Character> stack = new LinkedList();
    
    public void pushCharacter(char ch){
        stack.push(ch);
    }
    
    public void enqueueCharacter(char ch){
        queue.add(ch);
    }
    
    public char popCharacter(){
        return stack.pop();
    }
    
    public char dequeueCharacter(){
        return queue.remove();
    }
