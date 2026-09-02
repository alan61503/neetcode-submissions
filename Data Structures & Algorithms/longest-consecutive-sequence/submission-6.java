class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> arr = new HashSet<>();
        int res = 0;
        for(int  i =0 ; i < nums.length; i++){
            arr.put(nums[i]);
        }
      int prev = nums[0];
        for(int i =0; i < nums.length; i++){
            if(set.contains(nums[i]+1)){
                res++;
            }
            
       prev=nums[i]
            }
        }
        

        return res;
    }

