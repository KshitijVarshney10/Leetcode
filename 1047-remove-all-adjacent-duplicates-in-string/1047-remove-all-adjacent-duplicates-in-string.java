class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stack=new Stack<>();
        String ans="";
        for(int i=0;i<s.length();i++){
            if(stack.isEmpty()){
                stack.push(s.charAt(i));
            }
            else{
                if(stack.peek()==s.charAt(i))
                    stack.pop();
                else
                    stack.push(s.charAt(i));
            }
        }
        while(!stack.isEmpty()){
            ans=stack.pop()+ans;
        }
        
        return ans;
    }
    
}