class Solution {
    public String reverseWords(String s) {
        int n=s.length();
        String temp="";
        String str="";
        for(int i=0;i<n;i++){
            if(s.charAt(i)==' '){
                str=str+temp+" ";
                temp="";
            }
            else{
                temp=s.charAt(i)+temp;
            }
        }
        str=str+temp;
        return str;
    }
}