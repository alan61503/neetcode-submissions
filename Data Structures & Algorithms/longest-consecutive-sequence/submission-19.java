class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> arr = new HashSet<>();
        int res = 0;
        for(int  i =0 ; i < nums.length; i++){
            arr.add(nums[i]);
        }
        int arr1[] = new int[nums.length];
        

        for(int num : nums){
            if(!arr.contains(num-1)){
                int count = 0;
                int current =num;

                while(arr.contains(current + 1)){
                    count++;
                    current++;
                }
                res=Math.max(res,count);

            }
        }

            return res;
        }
        

        
    }

