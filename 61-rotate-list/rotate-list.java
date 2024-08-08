
class Solution {
    public ListNode rotateRight(ListNode head, int k) 
    {
           if(head==null) return head;
           if(head.next==null) return head;
            ListNode temp=head;
            int c=0;
            
             ListNode t=null;
             while(temp!=null)
             {
                c++;
                temp=temp.next;
             }
             k=k%c;
           
        for(int i=1;i<=k;i++)
        {
              t=head;
           
             while(t.next.next!=null)
            {
                t=t.next;
            }
            t.next.next=head;
            head=t.next;
            t.next=null;
            
        }
        return head;
        
    }
}