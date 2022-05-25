class Solution {
    public int finalValueAfterOperations(String[] str) {
        int x=0;
        for(int i=0;i<str.length;i++)
        {
            if(str[i].contains("+"))
               x++;
            if(str[i].contains("-"))
                x--;
            
        }
        return x;
    }
}