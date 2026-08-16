class Solution {
    public int scoreOfString(String s) {
        int i =1;
        int res=0;
        while (i<s.length()){
            res= res + Math.abs(s.charAt(i)-s.charAt(i-1));
            i++;
        }
        return res;
    }
}