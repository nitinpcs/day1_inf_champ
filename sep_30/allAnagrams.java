import java.util.*;

class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        if(p.length() > s.length()) return list;
        int[] freq = new int[26];
        char[] str = s.toCharArray();
        for(int i=0; i<p.length(); i++){
            freq[str[i]-'a']++;
            freq[p.charAt(i)-'a']--;
        }
        int c=0;
        for(int i : freq){
            if(i != 0){
                c=0;
                break;
            }
            else{
                c=1;
            }
        }
        if(c == 1) list.add(0);
        int len = p.length();
        for(int i=len;i<str.length; i++){
            if(isAnagram(str, len, freq, i)){
                list.add(i-len+1);
            }
        }
        return list;
    }
    boolean isAnagram(char[] str, int len,int[] freq,int i){
        freq[str[i]-'a']++;
        freq[str[i-len]-'a']--;
        for(int j : freq){
            if(j != 0){
                return false;
            }
        }
        return true;
    }
}