class Solution {
    public int[] plusOne(int[] digits) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        
        int cnt=1;
        
        int temp=digits[digits.length-1]+1;
        int cry =temp/10 ;
        al.add(0,temp%10);
       // System.out.println(temp%10);
        
        for(int i=digits.length-2;i>=0;i--)
        {
            temp=cry+digits[i];
            cry=temp/10;
            al.add(0,temp%10);
            cnt++;
            
        }
        if(cry!=0)
        {
            al.add(0,cry);
            cnt++;
        }
        int arr[] = new int[cnt];
        for(int i=0;i<cnt;i++)
        {
            arr[i]=al.get(i);
        }
        return arr;
    }
}