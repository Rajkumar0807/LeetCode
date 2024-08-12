
class Solution {
    public ListNode middleNode(ListNode head) 
    {
        ListNode temp=head;
        ListNode sl=head;
        while(temp!=null&&temp.next!=null)
        {
            sl=sl.next;
            temp=temp.next.next;

        }
        return sl;
        
        
    }
}