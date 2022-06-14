class Solution {
    public int maxProfit(int[] p) {
        
        int n= p.length;
        if(n==1)
            return 0;
        int a=0;
        int b=p[n-1];
        int diff=-1;
        for(int i=n-2;i>=0;i--)
        {
            if(p[i]>b)
            {
                b=p[i];
            }
            int temp=b-p[i];
            if(temp>diff)
            {
                diff= temp;
                a=p[i];
            }
        }
        return diff;
        
    }
}