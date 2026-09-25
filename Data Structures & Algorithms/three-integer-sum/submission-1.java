class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>>ps=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            int k=nums.length-1;
            int t=-nums[i];
            int j=i+1;
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            while(j<k){{
                if(nums[j]+nums[k]<t){
                    j++;
                    continue;
                }
                if(nums[j]+nums[k]>t){
                    k--;
                    continue;
                }
                if(nums[j]+nums[k]==t){
                    List<Integer>p=new ArrayList<>();
                    p.add(nums[i]);
                    p.add(nums[j]);
                    p.add(nums[k]);
                    ps.add(p);
                    j++;
                    k--;
                    while (j < k && nums[j] == nums[j - 1])
                        j++;
                    while (j < k && nums[k] == nums[k + 1])
                        k--;
                }
            }}
        }
        return ps;
    }
}
