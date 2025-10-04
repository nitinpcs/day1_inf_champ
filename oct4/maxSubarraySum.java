class Solution {
    public int maxSubArray(int[] arr) {
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        for(int ele : arr){
            sum += ele;
            maxSum = maxSum < sum ? sum : maxSum;
            if(sum < 0){
                sum = 0;
            }
        }
        return maxSum;
    }
}