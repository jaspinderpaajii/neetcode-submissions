class Solution {
    public boolean isPalindrome(String s) {
        int k=0;
        StringBuilder sb1 = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                sb1.append(s.charAt(i));
            }
            else{
                continue;
            }
        } 
        String ns=sb1.toString().toLowerCase();
        int j=ns.length()-1;
        while(k<j){
            int ci=ns.charAt(k);
            int cj=ns.charAt(j);
            if(ci!=cj){
            return false;
            }
            k++;
            j--;
        }
        return true;
    }
}
