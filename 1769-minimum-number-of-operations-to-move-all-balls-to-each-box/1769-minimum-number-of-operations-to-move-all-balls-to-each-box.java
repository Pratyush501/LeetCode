class Solution {
    public int[] minOperations(String boxes) {
        int n= boxes.length();
        
        char arr[] = new char [n];
        for(int i=0;i<n;i++)
        {
            arr[i]=boxes.charAt(i);
            
        }
        int ans [] = new int [n];
        for(int i=0;i<n;i++)
        {
            int count=0;
            for(int j=0;j<n;j++)
            {
                if(arr[j]=='1')
                    count=count+Math.abs(j-i);
            }
            ans[i]=Math.abs(count);
            
        }
        return ans;
    }
}