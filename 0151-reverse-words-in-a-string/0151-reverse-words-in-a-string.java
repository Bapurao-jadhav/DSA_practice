class Solution {
    public String reverseWords(String s) {
        s=" "+s.trim();
        String sen="";
       String word="";
        boolean firstSp=false;
       for(int i =s.length()-1; i>=0; i--){
        char ch = s.charAt(i);
            if (ch!=' '){
               word=ch+word;
                 firstSp=true;
            }else{
               if(firstSp)
                sen=sen+word +" ";
                word="";
                firstSp=false;
            }
       }
       return sen.trim();
    }
}