class Solution {
    public String replaceDigits(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i =0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch>=48 && ch<=57){
                char prev= s.charAt(i-1);
                ch=(char)(prev + (ch - '0'));
                sb.append(ch);
            }else{
                sb.append(ch);
            }
        }

        return sb.toString();
    }
}