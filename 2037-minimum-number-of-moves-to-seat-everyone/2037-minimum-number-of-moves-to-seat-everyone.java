class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);
        int n = seats.length;
        int move =0;
        for(int i=0;i<n;i++)
        {
            
            int a = students[i]-seats[i];
            if(a<0)
                a=a*(-1);
            move=move+a;
            // if(i>0 && seats[i]==seats[i-1])
            //     move=move-a;
                
        }for(int j=0;j<n;j++)
            System.out.print(seats[j]+" ");
        System.out.println();
        for(int j=0;j<n;j++)
            System.out.print(students[j]+" ");
          
        return move;
    }
}