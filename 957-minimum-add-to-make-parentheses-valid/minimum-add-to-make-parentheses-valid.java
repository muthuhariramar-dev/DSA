class Solution {
    public int minAddToMakeValid(String s) {
       if(s.isEmpty()) return 0;
        Stack<Character> stack = new Stack<>();
        
        int count =0;
        for(int i = 0; i< s.length();i++){
            char c = s.charAt(i);
            if(c == '(' || c == '{' || c == '[' ){
                stack.push(c);
            }else{
                if(!stack.isEmpty()){
                if(c == ')' && stack.peek() == '(') stack.pop();
                else if(c == '}' && stack.peek() == '{') stack.pop();
                else if(c == ']' && stack.peek() == '[') stack.pop();
                 else count++; 
                } else {
                    count++; 
                }

                
            }
        }

        return stack.size()+ count;
     
    }
}