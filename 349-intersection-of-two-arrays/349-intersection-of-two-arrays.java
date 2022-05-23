class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
        ArrayList<Integer> al1 =  new ArrayList<>();
        ArrayList<Integer> al2 =  new ArrayList<>();
        for(int i=0;i<nums1.length ;i++)
        {
            al1.add(nums1[i]);
        }
      //  System.out.print(al1);
        
        for(int i=0;i<nums2.length;i++)
        {
            if(al1.contains(nums2[i])==true && al2.contains(nums2[i])==false)
            {
                al2.add(nums2[i]);
                
            }
        }
        int a = al2.size();
        int arr[] = new int[a];
        for(int i=0;i<a;i++)
        {
           // System.out.print(al2.get(i)+" ");
            arr[i]=al2.get(i);
        }
        
        return arr;
    }
}