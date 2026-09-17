class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        PriorityQueue<int[]> pq = new PriorityQueue<>
                       ((a, b) -> a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]);

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            pq.add(new int[] { entry.getValue(), entry.getKey() });
            if (pq.size() > k)
                pq.poll();
        }
        int res[]=new int[k];
        int j=0;
        while (!pq.isEmpty()) {
            res[j]=pq.poll()[1];
            j++;
        }
        return res;
    }
}
