class Solution {
    public int maximumWealth(int[][] arr) {
        int a=0;
        int b=Integer.MIN_VALUE;
        int row = arr.length;
        int col=arr[0].length;
      //System.out.print(row+"  "+col);
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                a+=arr[i][j];
            }
            if(a>b)
                b=a;
            a=0;
            
        }
        return b;
    }
}