class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> indices = new HashMap<>();
        for (int i = 0; i < nums.length;i++){
            indices.put(nums[i],i);
        }
        for(int i = 0; i < nums.length; i++){
            if(int diff = target - nums(i)){
                return (indices.contains(i) && indices.get(i)!=0);
            }
        }
        return indices[i];
    }
}
