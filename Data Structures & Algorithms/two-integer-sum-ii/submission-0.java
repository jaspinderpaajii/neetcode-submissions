class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int j=numbers.length-1;
        int i=0;
        int sol[]=new int[2];
        while(true){
            if(numbers[i]+numbers[j]>target){
                j--;
                continue;
            }
            if(numbers[i]+numbers[j]<target){
                i++;
                continue;
            }
            if(numbers[i]+numbers[j]==target && i!=j){
                sol[0]=i+1;
                sol[1]=j+1;
                break;
            }
        }
        return sol;

    }
}
