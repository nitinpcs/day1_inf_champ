class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()) return false;
        int[] freq = new int[26];
        char[] str = s2.toCharArray();
        int m = s1.length();
        for(int i=0; i<m; i++){
            freq[str[i]-'a']++;
            freq[s1.charAt(i)-'a']--;
        }
        int c=0;
        for(int ele : freq){
           if(ele != 0){
            c=1;
            break;
           } 
           else{
            c=0;
           }
        }
        if(c==0) return true;
        for(int i=m; i<str.length; i++){
            if(isValid(freq,str,i,m)){
                return true;
            }
        }
        return false;
    }
    public boolean isValid(int[] freq, char[] str,int i,int m){
        freq[str[i-m]-'a']--;
        freq[str[i]-'a']++;
        for(int ele : freq){
            if(ele != 0) return false;
        }
        return true;
    } 
}