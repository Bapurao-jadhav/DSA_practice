class Solution {
    public String removeTrailingZeros(String num) {
        int j =0;
        for(int i = num.length()-1;i>=0; i--){
            int ch= num.charAt(i) -'0';
            if(ch==0){
                continue;
            }else{
                j=i;
                break;
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int i =0; i<=j; i++){
            char ch = num.charAt(i);
            sb.append(ch);
        }

        return sb.toString();
    }
}