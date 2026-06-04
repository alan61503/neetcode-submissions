class Solution {
    public boolean hasDuplicate(int[] nums) {
        
        for (int i = 0; i< nums.lenght; i++){
            for (int j = i + 1; j < nums.lenght; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}