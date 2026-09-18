class Solution {
    public boolean isPalindrome(String s) {
        Stack <Character> stack= new Stack<>();
        int first = 0;
        for (int i=0;i<s.length();i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                stack.push(Character.toLowerCase(s.charAt(i)));
            }
        }
        while(!stack.isEmpty()){
           
             if (!Character.isLetterOrDigit(s.charAt(first))) {
                first++;
                continue;
            }

            if (stack.peek()==Character.toLowerCase(s.charAt(first))){
                stack.pop();
                first++;       
            }
            // if (!stack.isEmpty() && stack.peek()!=Character.toLowerCase(s.charAt(first))){
            //     return false;
            // }          
            else{
                return false;
            }

        }
      
        return true;
    }
}
