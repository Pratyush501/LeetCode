class Solution {
    public String breakPalindrome(String s) {
       String str="";
        boolean flag = false;
        int n = s.length();
        if(n==1){
            return str;
        }
        char ch[] = s.toCharArray();
        
        int i=0;
        for(i=0;i<n/2;i++){
            if(ch[i]!='a'){
                ch[i]='a';
                flag=true;
                break;
            }
        }
        if(flag==false){
            ch[n-1]='b'; 
        }
        String string = new String(ch); 
        
        return string;
        
    }
}