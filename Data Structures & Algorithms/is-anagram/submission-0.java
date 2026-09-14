class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> smap=new HashMap<Character,Integer>();
        HashMap<Character,Integer> tmap=new HashMap<Character,Integer>();
        if(s.length()!=t.length()){
            return false;
        }
        for(int i=0;i<s.length();i++){
            if(!smap.containsKey(s.charAt(i))){
                smap.put(s.charAt(i),1);
            }
            else{
                smap.put(s.charAt(i),smap.getOrDefault(s.charAt(i),0)+1);
            }
            if(!tmap.containsKey(t.charAt(i))){
                tmap.put(t.charAt(i),1);
            }
            else{
                tmap.put(t.charAt(i),tmap.getOrDefault(t.charAt(i),0)+1);
            }
        }
        return smap.equals(tmap);
    }
}
