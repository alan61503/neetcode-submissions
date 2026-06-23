class Solution {
    public int[] twoSum(int[] numbers, int target) {
        for(int i = 0; i < numbers.length; i++){
            int l = numbers[i];
            int r = numbers.length -1;
            int tmp = target - numbers[i];
            while( l <= r){
                int mid = l + (r-l) / 2;
                if(numbers[mid] == tmp){
                    return int new[] {mid+1, tmp +1};
                }
                else if(numbers[mid] < tmp){
                    l = +1;
                }
                else{
                    r = +1;
                }
            }
        }
        return int new[0];
    }
}
