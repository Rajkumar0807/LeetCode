
class Solution {
    public int getDecimalValue(ListNode head) 
    {
        int sum=0;
    String s="";
        ListNode temp=head;
        while(temp!=null)
        {
            s=s+temp.val;
            temp=temp.next;
        }
        int j=0;
        for(int i=s.length()-1;i>=0;i--)
        {
            int n=s.charAt(i)-48;
            if(n!=0)
            {
            sum=sum+n*(int)Math.pow(2,j);
            }
            j++;
        }
        return sum;
       
    }
   
}