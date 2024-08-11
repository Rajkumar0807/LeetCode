
class Solution {
    public ListNode reverseList(ListNode head) 
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
        int j=0,k=arr.length-1;
        while(j<k)
        {
            int tem=arr[j];
            arr[j]=arr[k];
            arr[k]=tem;
            j++;
            k--;
        }
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