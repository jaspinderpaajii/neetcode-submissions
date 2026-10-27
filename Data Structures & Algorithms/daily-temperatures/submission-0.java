class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer>s=new Stack<>();
        int []x=new int[temperatures.length];
        s.push(0);
        for(int i=0;i<x.length;i++){
            x[i]=0;
        }
        for(int i=1;i<temperatures.length;i++){
            while(temperatures[i]>temperatures[s.peek()]){
                int ind=s.pop();
                x[ind]=i-ind;
                if(s.isEmpty()){
                    break;
                }
            }
            s.push(i);
        }
        return x;
    }
}
