class Solution {
    public int singleNumber(int[] arr) {
        ArrayList<Integer> al = new ArrayList<>();
        ArrayList<Integer> al2 = new ArrayList<>();
        HashSet<Integer> hs = new HashSet<>();
        int  d = arr[0];
        for(int i=0;i<arr.length;i++)
        {
            hs.add(arr[i]);
            al2.add(arr[i]);
        }
        if(arr.length==hs.size())
            return d;
        
        for(Integer x : hs)
        {
            int temp = x;
            int a = al2.indexOf(temp);
            int b = al2.lastIndexOf(temp);
            if(a==b)
            {
                al.add(temp);
                d=temp;
            }
        }
        
        return d;
    }
}