class Solution {
    public int scoreOfString(String s) {
        int i =0;
        int j =i+1;
        int res=0;
        while (j<s.length()){
            char ch1= s.charAt(i);
            char ch2 = s.charAt(j);
            res= res + Math.abs(ch1-ch2);
            i++;
            j++;
        }
        return res;
    }
}