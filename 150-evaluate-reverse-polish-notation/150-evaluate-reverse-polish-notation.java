class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> stack=new Stack<>();
        int s=0,f=0;
        for(String string:tokens){
            switch(string){
                case "+":
                     s=Integer.parseInt(stack.pop());
                     f=Integer.parseInt(stack.pop());
                    stack.push(Integer.toString(f+s));
                break;
            case "-":
                     s=Integer.parseInt(stack.pop());
                     f=Integer.parseInt(stack.pop());
                    stack.push(Integer.toString(f-s));
                break;
            case "/":
                     s=Integer.parseInt(stack.pop());
                     f=Integer.parseInt(stack.pop());
                    stack.push(Integer.toString(f/s));
                break;
            case "*":
                     s=Integer.parseInt(stack.pop());
                     f=Integer.parseInt(stack.pop());
                    stack.push(Integer.toString(f*s));
                break;
            default:
                stack.push(string);
            }
        }
        return Integer.parseInt(stack.pop());
    }
}