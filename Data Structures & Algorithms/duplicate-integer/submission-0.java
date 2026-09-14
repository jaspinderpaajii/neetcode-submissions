class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer>n=new HashSet<Integer>();
        for(int i=0;i<nums.length;i++){
            if(n.contains(nums[i])){
                return true;
            }
            else{
                n.add(nums[i]);
            }
        }
        return false;
    }
}