class Solution {
    public int[] twoSum(int[] b, int t) {
        int a[]= new int[2];
        int n=b.length;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(b[i]+b[j]==t)
                {
                    a[0]=i;
                    a[1]=j;
                }
            }
        }return a;
    }
    
}