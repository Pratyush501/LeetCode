class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n= nums.length;
        ArrayList<Integer> al = new ArrayList<Integer>();
        for(int i=0;i<n;i++)
        {
            al.add(0);
        }
        for(int i=0;i<n;i++)
        {
            al.set(nums[i]-1,al.get(i)+1);
        }
        int i=0;
        int t=1;
        int c=0;
        while(i<al.size())
        {
            if(al.get(i)>0){
                t++;
                al.remove(i);
            }
                    
            else
            {
               al.set(c,t); 
                i++;
                t++;
                c++;
            }
                
        }
        return al;
        
    }
}
    