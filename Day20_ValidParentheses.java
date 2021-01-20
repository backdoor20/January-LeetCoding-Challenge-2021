class Solution {
    public boolean isValid(String s) {
        char[] ch=s.toCharArray();
        Stack<Character> stack=new Stack<>();
        for(char c:ch){
            if(c == '(' ||c== '{'||c=='[')
                stack.push(c);
            else{
                if(stack.size()>0){
                char ctop=stack.peek();
                if((c==')'&&ctop=='(')||(c==']'&&ctop=='[')||(c=='}'&&ctop=='{')){
                    stack.pop();
                }else{
                    return false;
                }
            }
            else{
                return false;
            }
        }
        }
        if(stack.size()!=0){
            return false;
        }
        return true;
    }
}