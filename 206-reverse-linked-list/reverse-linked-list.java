class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode curr=head; 
        ListNode prev=null;
        while(curr!=null)
        {
            ListNode NextNode=curr.next;
            curr.next=prev;
            prev=curr;
            curr=NextNode;
        }
        return prev;
    }
}