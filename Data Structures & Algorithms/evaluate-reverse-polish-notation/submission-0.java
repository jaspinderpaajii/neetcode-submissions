class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer>s=new Stack<>();
        for(int i=0;i<tokens.length;i++){
            if(tokens[i].equals("+")){
                int op1=s.pop();
                int op2=s.pop();
                s.push(op1+op2);
            }
            else if(tokens[i].equals("-")){
                int op1=s.pop();
                int op2=s.pop();
                s.push(op2-op1);
            }
            else if(tokens[i].equals("*")){
                int op1=s.pop();
                int op2=s.pop();
                s.push(op1*op2);
            }
            else if(tokens[i].equals("/")){
                int op1=s.pop();
                int op2=s.pop();
                s.push(op2/op1);
            }
            else{
                int no= Integer.parseInt(tokens[i]);
                s.push(no);
            }
        }
        return s.pop();
    }
}
