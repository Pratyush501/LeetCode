class Solution {
    public int minPairSum(int[] arr) {
        Arrays.sort(arr);
        int n= arr.length;
        int a=0;
        for(int i=0;i<n/2;i++)
        {
            int temp=arr[i]+arr[n-i-1];
            if(temp>a)
                a=temp;
        }
            
        return a;
    }
}