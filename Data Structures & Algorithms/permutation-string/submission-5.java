class Solution {
    public boolean checkInclusion(String s1, String s2) {
        char[] s1Arr = s1.toChar();
        Arrays.sort(s1Arr);
        String sortedS1 = new s1Arr.toString();

        for(int = 0; i < s2.length(); i++){
            for(int j = i; j < s2.length(); j++){
                char[] s2Arr = s2.toChar(i, j +1);
                Arrays.sort(s2Arr);
                String sortedS1 = new s2Arr.toString();

                if(sortedS1.equals(sortedS2)){
                    return true;
                }
            }
        }
        return false;
    }
}
