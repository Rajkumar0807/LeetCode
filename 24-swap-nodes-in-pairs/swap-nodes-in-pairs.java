
class Solution {
    public ListNode swapPairs(ListNode head)
    {
        if(head==null||head.next==null)
        {
            return head;
        }
        ListNode t1=head;
        ListNode t2=head.next;
        ListNode t3=head;
        head=t2;
       
        int i=0;
        while(t1!=null)
        {
            t1.next=t2.next;
            t2.next=t1;
            if(i>0)
            {
                t3.next=t2;
                t3=t3.next.next;
            }
            i++;
          if(t1.next==null)  break;
            t1=t1.next;
           if(t1.next==null) break;
            t2=t1.next;
           

        }
        return head;
        
    }
}