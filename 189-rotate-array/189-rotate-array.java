class Solution {
    public void rotate(int[] nums, int k) {
        int i=0;
        k=k%nums.length;
        int j=nums.length-1;
        while(i<j)
        {
            int temp = nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }
        int l=k;
         j=nums.length-1;
        while(l<j)
        {
            int temp = nums[l];
            nums[l]=nums[j];
            nums[j]=temp;
            l++;
            j--;
        }
        i=0;
        j=k-1;
         while(i<j)
        {
            int temp = nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }
        
       
    }
}