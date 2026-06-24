class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
      Arrays.sort(nums);
      List<List<Integer>> res = new ArrayList<>();

    for(int i =0; i< nums.length; i++){
        if(nums[i] < 0) break;
        if(l<r && nums[i] == nums[i-1]) continue;
    }

    while(l<r){
        int sum = nums[i] + nums[l] + nums[r];
        if(sum <0){
            l++;
        }
        else if (sum>0){
            r--;
        }
        else{
            if(l<r && nums[i] == nums[i-1]){
            l++;
            r--;
            }
        }

    }
    return new int[sum];
    }
}