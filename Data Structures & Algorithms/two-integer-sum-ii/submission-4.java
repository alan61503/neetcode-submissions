class Solution {
    public int[] twoSum(int[] numbers, int target) {
        for(int i = 0; i < numbers.length; i++){
            int l = i;
            int r = numbers.length -1;
            int tmp = l - target;
            while(l<=r){
                if(numbers[tmp] == target){
                    return new int[0] {l + 1,tmp + 1};
                }
                elif(numbers[tmp] <= target){
                    l += 1;
                }
                else{
                    r +=1;
                }

            }
        }
        return new int[0]
    }
}
