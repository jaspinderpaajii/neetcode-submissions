class Solution {
    public boolean isValid(String s) {
        Stack<Character>st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char t=s.charAt(i);
            if(t=='(' || t=='{' || t=='['){
                st.push(t);
            }
            else if(!st.isEmpty()){
                if(t==')' && st.peek()=='(' ||t=='}' && st.peek()=='{' ||t==']' && st.peek()=='['){
                st.pop();
            }
            else
                st.push(t);
            
            }

            else{
                return false;
            }
        }
        return st.isEmpty();
    }
}
