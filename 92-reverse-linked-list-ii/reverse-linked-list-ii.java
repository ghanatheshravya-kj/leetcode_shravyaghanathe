class Solution 
{
    public ListNode reverseBetween(ListNode head, int left, int right) 
    {
        ListNode dummy=new ListNode(-1);
        dummy.next=head;
        ListNode prev=dummy;
        for(int i=1;i<left;i++)
        {
            prev=prev.next;
        }
        ListNode curr=prev.next;
        for(int i=0;i<right-left;i++)
        {
            ListNode NextNode=curr.next;
            curr.next=NextNode.next;
            NextNode.next=prev.next;
            prev.next=NextNode;
        }
        return dummy.next;
    }
}