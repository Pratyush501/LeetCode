class Solution {
    public int[] decompressRLElist(int[] arr) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        for(int i=0;i<arr.length;i=i+2)
        {
            for(int j=0;j<arr[i];j++)
                al.add(arr[i+1]);
        }
        int a[] = new int [al.size()];
        for(int i=0;i<al.size();i++)
            a[i] = al.get(i);
        return a;
    }
}