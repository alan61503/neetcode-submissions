class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] output = new int[n-k+1];

        for(int i = 0; i <= n-k; i++){
            int maxi = nums[i];

            for(int i = 0; i < i + k; j++){
                maxi = Math.max(maxi, nums[j]);
            }
            output[i] = maxi;
        }
        return output;
        
    }
}
