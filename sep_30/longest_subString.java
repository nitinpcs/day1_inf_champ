import java.util.HashSet;
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0, right = 0;
        int max = 0;
        HashSet<Character> set = new HashSet<>();
        while(right < s.length()){
            char c = s.charAt(right);
            if(!set.contains(c)){
                set.add(c);
                max = Math.max(max,right-left+1);
                right++;
            }
            else{
                set.remove(s.charAt(left++));
            }
        }
        return max;
    }
}
