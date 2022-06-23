class Solution {
    public int minAddToMakeValid(String s) {
       int arr[] = new int[s.length()];
        Stack<Character> st = new Stack<>();
        int cnt=0;
        int j=-1;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='[')
            {
                st.push(s.charAt(i));
            }
            else
            {
                
                if(st.isEmpty()==true)
                    cnt++;
                else if(s.charAt(i)==')' && st.peek()=='(')
                    st.pop();
                else if(s.charAt(i)=='}' && st.peek()=='{')
                    st.pop();
                else if(s.charAt(i)==']' && st.peek()=='[')
                    st.pop();
                else
                    cnt++;
            }
            //if(st.isempty==)
            
  
                
        }
        return cnt+st.size();
    }
}