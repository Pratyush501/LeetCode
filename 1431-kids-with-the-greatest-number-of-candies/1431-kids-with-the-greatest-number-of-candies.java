
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        
        List<Boolean> myList = new ArrayList<Boolean>(); 
        int a=Integer.MIN_VALUE;
        for(int i=0;i<candies.length;i++)
            if(candies[i]>a)
                a=candies[i];
        for(int i=0;i<candies.length;i++)
        {
            int b = candies[i]+extraCandies;
            if(b>=a)
                myList.add(true);
            else
                myList.add(false);
        }
      
        
        
        return myList;
    }
}