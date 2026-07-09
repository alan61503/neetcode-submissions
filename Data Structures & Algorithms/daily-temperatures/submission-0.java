class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] res = new int[n];

        if(i = 0; i < n; i++){
            int count = 0;
            int j = i+1;
            while(j<n){
                if(temperature[i] > temperature[j]) break;
            }
            count++;
            j++;
            res[i] = count[i];
        }
        return res[i];
    }
}
