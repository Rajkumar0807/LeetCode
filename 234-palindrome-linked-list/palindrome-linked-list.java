
class Solution {
    public boolean isPalindrome(ListNode head) 
    {
        if(head.next==null) return true;
        ListNode p,q,r;
        ListNode f=head,s=head;
        while(f.next!=null&&f.next.next!=null)
        {
            f=f.next.next;
            s=s.next;
        }
         ListNode s1=s;
        
    p=s.next;q=null;r=null;
       
        while(p!=null)
        {
            r = q; 
            q = p; 
            p = p.next; 
            q.next = r;
        } 
        s1.next=q;
        s1=s1.next;
        while(s1!=null)
        {
            if(head.val!=s1.val)
            {
                return false;
            }
            head=head.next;
            s1=s1.next;
        }

        return true;
    }
}