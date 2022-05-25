class Solution {
    public int mostWordsFound(String[] str) {
        int words =0 ;
        for(int i=0;i<str.length;i++)
        {
            String s = str[i];
            //System.out.println(s.charAt(i));
            
            int cnt =1;
            for(int j=0;j<s.length();j++)
            {
              //  char c = s.charAt(j);
                if(s.charAt(j)==' ')
                    cnt++;
                
            }
            if(cnt>words)
                    words=cnt;
                cnt=1;
        }
        return words;
    }
}