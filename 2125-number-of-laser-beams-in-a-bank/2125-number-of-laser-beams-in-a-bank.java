class Solution {
    public int numberOfBeams(String[] bank) {
        int cnt1=0;
        int cnt2=0;
        int nob=0;
        int n = bank.length;
        for(int i=0;i<n;i++)
        {
            
            //long temp=Integer.parseInt(bank[i]);
            //System.out.println(temp);
            char arr[] = bank[i].toCharArray();
            for(int j=0;j<arr.length;j++)
            {
                if(arr[j]=='1')
                    cnt2++;
            }
           
            
            if(cnt2!=0)
            {
                nob=nob+cnt1*cnt2;
                cnt1=cnt2;
                cnt2=0;
            }
            
               
        }
        
        
        
        return nob;
    }
}