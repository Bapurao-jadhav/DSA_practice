class Solution {
    public String largestOddNumber(String num) {
        int no= (num.charAt(num.length()-1))-'0';
        if(no%2!=0){
            return num;
        }
        
            boolean isEven=true;
        for(int i =0; i<num.length();i++){
            int n =  num.charAt(i)-'0';
            if(n%2!=0){
                isEven=false;
                break;
            }
        }
        if(isEven){
            return "";
        }
        int index=0;
        for(int i = num.length()-1; i>=0; i--){
            int n=  num.charAt(i)-'0';
            if(n%2!=0){
                index=i;
                break;
            }
        }
        String res="";
        int i=0;
        while(i<=index){
            int n = num.charAt(i)-'0';
            res=res+n;
            i++;
        }

        return res;
    }
}