class Solution {
    public int trap(int[] height) {
        if(heigth == null || heigth.length == 0){
            return 0;
        }
        int n = heigth.length;
        int res = 0;

        for( int i =0; i < n; i++){
            int leftMax = heigth[i];
            int rightMax = heigth[i];

            for(int j = 0; j<i; j++){
                leftMax = Math.max(leftMax, heigth[j]);
            }
            for( int j = i +1; j<n; j++){
                rightMax = Math.max(rightMax, heigth[j]);
            }
            res += Math.mim(leftMax, rightMax) - heigth[i];
        }
        return res;
    }
}
