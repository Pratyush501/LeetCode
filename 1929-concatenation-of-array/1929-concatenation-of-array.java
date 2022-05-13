class Solution {
    public int[] getConcatenation(int[] nums) {
        int a=2*nums.length;
        int arr[] = new int[a];
        
        System.arraycopy(nums,0,arr,0,nums.length);
        System.arraycopy(nums,0,arr,nums.length,nums.length);
        return arr;
    }  
}