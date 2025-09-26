import java.util.ArrayDeque;
import java.util.Deque;

public class slidingWindowMax {
    public static void main(String[] args) {
        slidingWindowMax obj = new slidingWindowMax();
        int[] nums = {1,3,-1,-3,5,3,6,7};
        int k = 3;
        int[] res = obj.maxSlidingWindow(nums, k);
        for(int i : res){
            System.out.print(i + " ");
        }
    }
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(nums.length == 1 || k == 1) return nums;
        int[] res = new int[nums.length-k+1];
        Deque<Integer> dq = new ArrayDeque<>();
        int  i = 0;
        while(i < k){
            while(!dq.isEmpty() && nums[dq.peekLast()] < nums[i]){
                dq.pollLast();
            }
            dq.offerLast(i++);
        }
        res[0] = nums[dq.peekFirst()];
        while(i < nums.length){
            while(!dq.isEmpty() && dq.peekFirst() < i-k+1){
                dq.pollFirst();
            }
            while(!dq.isEmpty() && nums[dq.peekLast()] < nums[i]){
                dq.pollLast();
            }
            dq.offerLast(i);
            res[i-k+1] = nums[dq.peekFirst()];
            i++;
        } 
        return res;
    }
}
