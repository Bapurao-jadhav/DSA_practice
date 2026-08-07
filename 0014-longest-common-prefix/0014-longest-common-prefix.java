class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 1)
            return strs[0];

        String curr = strs[0];

        for (int j = 1; j < strs.length; j++) {
            String next = strs[j];
            String res = "";

            int len = Math.min(curr.length(), next.length());

            for (int k = 0; k < len; k++) {
                if (curr.charAt(k) == next.charAt(k)) {
                    res = res + curr.charAt(k);
                } else {
                    break; 
                }
            }

            curr = res;

            if (curr.isEmpty()) return "";
        }

        return curr;
    }
}