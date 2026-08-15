class Solution {
    public String toLowerCase(String s) {
        String str="";
        for(int i =0; i<s.length(); i++){
            char ch= s.charAt(i);
            if(ch>=65 && ch <=90){
                ch+=32;
            }
            str+=ch;
        }
        return str;
    }
}