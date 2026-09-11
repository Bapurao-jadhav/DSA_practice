class Solution {
    public char repeatedCharacter(String s) {
        StringBuilder sb = new StringBuilder();

        for(int i =0; i<s.length(); i++){
            char ch =s.charAt(i);
            if(sb.indexOf(ch+"")==-1){
                sb.append(ch);
            }else{
                return ch;
            }
        }
        return 'a';
    }
}