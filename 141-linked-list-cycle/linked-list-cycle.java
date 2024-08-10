
public class Solution {
    public boolean hasCycle(ListNode head) 
    {
        ListNode temp=head;
        List<ListNode> li=new ArrayList<>();
        while(temp!=null)
        {
            if(li.contains(temp))
            {
                return true;
            }
            else
            {
                li.add(temp);
                temp=temp.next;
            }
        }
        return false;
        
    }
}