
class Solution {
    public ListNode sortList(ListNode head) 
    {
        if(head==null||head.next==null) return head;
        ListNode temp=head;
        ListNode t=head;
        int len=0;
        while(temp!=null)
        {
           len++;
           temp=temp.next;
        }
        temp=head;
        int i=0;
        int arr[]=new int[len];
        while(temp!=null)
        {
            arr[i]=temp.val;
            i++;
            temp=temp.next;
        }
        Arrays.sort(arr);
        
        i=0;
        while(t!=null)
        {
            t.val=arr[i];
            i++;
            t=t.next;
        }


        return head;
    

        
    }
}