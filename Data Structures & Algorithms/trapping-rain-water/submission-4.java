class Solution {
    public int trap(int[] heigth) {
        int n = heigth.length;
        if(n ==0){
            return 0;
        }

        int[] leftMax = new int[n];
        int[] rightMax = new int[n];

        leftMax[0] = heigth[0];
        for(int i = 1;i<n; i++){
            leftMax[i] = Math.max(leftMax[i-1], heigth[i]);
        }
        rightMax[n-1] = heigth[n-1];
        for(int i = n-2; i>= 0;i--){
            rightMax[i] = Math.max(rightMax[i+1], heigth[i]);
        }
        int res = 0;
        for(int i = 0; i < n; i++){
            res += Math.min(leftMax[i], rightMax[i]) - heigth[i];
        }
        return res;
    }
}
