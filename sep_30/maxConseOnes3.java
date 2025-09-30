class Solution {
    public int longestOnes(int[] nums, int k) {
        int left=0,right=0;
        int zero = 0;
        int max = 0;
        while(left < nums.length && right < nums.length){
            if(nums[right] == 0){
                zero++;
            }
            while(zero > k){
                if(nums[left] == 0) zero--;
                left++;
            }
            max = Math.max(max, right-left+1);
            right++;
        }
        return max;
    }
}
