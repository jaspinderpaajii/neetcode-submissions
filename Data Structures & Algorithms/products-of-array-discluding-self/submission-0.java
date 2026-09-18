class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product=1;
        int c=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                c++;
                continue;
            }
            product*=nums[i];
        }
        int sol[]=new int[nums.length];
        if(c>=2){
            for(int i=0;i<nums.length;i++){
                sol[i]=0;
            }
        }
        else if(c==1){
            for(int i=0;i<nums.length;i++){
                if(nums[i]==0){
                    sol[i]=product;
                }
                else{
                    sol[i]=0;
                }
            }
        }
        else{
            for(int i=0;i<nums.length;i++){
                sol[i]=product/nums[i];
            }
        }
        return sol;
    }
}  
