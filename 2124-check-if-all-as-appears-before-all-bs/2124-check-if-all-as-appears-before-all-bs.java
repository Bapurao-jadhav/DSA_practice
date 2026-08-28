class Solution {
    public boolean checkString(String s) {
        int indexA=0;
        int indexB=-1;
        for (int i =0; i<s.length(); i++){
            char ch = s.charAt(i);
           
            if(ch=='a'){
                indexA=i;
            }else{
                indexB=i;
            }
             if(indexB>=0){
            if(indexA > indexB){
                return false;
            }
            }
        }
        return true;
    }
}