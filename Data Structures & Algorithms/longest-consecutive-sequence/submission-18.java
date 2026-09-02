class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> arr = new HashSet<>();
        
        for(int  i =0 ; i < nums.length; i++){
            arr.add(nums[i]);
        }
        int arr1[] = new int[nums.length];
        int count = 0;
        for(int num : nums){
            if(!arr.contains(num-1)){
                
                int current =num;

                while(arr.contains(current + 1)){
                    count++;
                    current++;
                }

            }
        }

            return count;
        }
        

        
    }

