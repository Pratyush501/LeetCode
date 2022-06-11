class Solution {
    public int wateringPlants(int[] plants, int capacity) {
        int n = plants.length;
        int cap=capacity;
        int count=0;
        int j=-1;
        for(int i=0;i<n;i++)
        {
            if(cap>=plants[i])
                {
                    count++;
                    cap-=plants[i];
                }
            else
            {
                count=count+i-1+i-j-j;
                cap=capacity;
                cap-=plants[i];
            }
        }
        
        return count;
    }
}