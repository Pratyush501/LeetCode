class Solution {
    public int maxProfit(int[] p) {
        int n = p.length;
        int temp[] = new int[n];
        int t=0;
        temp[n-1]=p[n-1];
        Stack<Integer> st = new Stack<Integer>();
        st.push(p[n-1]);
        for(int i=n-2;i>=0;i--)
        {
          
            if(!st.isEmpty())
            {
                while(st.isEmpty()==false && p[i]>=st.peek())
                    {
                        st.pop();
                    }
            }
            
            temp[i]=(st.isEmpty() ? p[i]: st.peek());
            
            st.push(p[i]);
        }
        int profit=0;
        for(int i=0;i<n-1;i++)
        {
            if(p[i]<p[i+1])
                profit=profit + temp[i]-p[i];
        }
        
        return profit;
    }
}