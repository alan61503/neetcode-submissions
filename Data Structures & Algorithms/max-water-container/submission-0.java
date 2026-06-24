class Solution {
    public int maxArea(int[] heights) {
        int res= 0 ;
        for(int i = 0; i< heigths.length; i++){
            for(int j = i+1; j < heigths.length; j++){
                res = Math.max(res, Math.min(heigths[i],heigths[j]) *(j-i));
            }
        }
        return res;
    }
}
