class Solution {
    public String capitalizeTitle(String title) {
        title= title.toLowerCase()+" ";
        StringBuilder sb = new StringBuilder();
         String word="";
        for (int i=0; i<title.length(); i++){
            char ch = title.charAt(i);
            if(ch!=' '){
                word+=ch;
            }else{
                if(word.length()==1 || word.length()==2){
                    sb.append(" ");
                    sb.append(word);
                    word="";
                }else{
                    sb.append(" ");
                  word= word.substring(0,1).toUpperCase()+word.substring(1);
                    sb.append(word);
                    word="";
                }
            }
        }
        return sb.toString().trim();
    }
}