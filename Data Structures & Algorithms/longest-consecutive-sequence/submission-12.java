class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> arr = new HashSet<>();
        int res = 0;
        for(int  i =0 ; i < nums.length; i++){
            arr.add(nums[i]);
        }
        int arr1 = new int[nums.length];
        int index=0;
        for(int i =0; i < nums.length; i++){
            if(arr.contains(nums[i]+1)){
                arr1[index++]=nums[i];
            }
            
     
            }
            for(int i=0;i<=index;i++){
                res++;
            }
            return res;
        }
        

        
    }

