class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i=0;
        int ms=0;
        while(i<s.length()){
            int ts=0;
            HashSet<Character> set=new HashSet<>();
            while(i+ts<s.length() && !set.contains(s.charAt(i+ts))){
                set.add(s.charAt(i+ts));
                ts++;
            }
            ms=Math.max(ts,ms);
            i++;
        }
        return ms;
    }
}
