class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode slow=head,fast=head;
        while(fast!=null && fast.next!=null)
        {
            fast=fast.next.next;
            slow=slow.next;
        }
        ListNode sec=rev(slow);
        ListNode first=head;
        ListNode temp=sec;
        while(temp!=null)
        {
            if(first.val!=temp.val)
            return false;
            temp=temp.next;
            first=first.next;
        }
        return true;
    }
    public ListNode rev(ListNode head)
    {
        ListNode prev = null;
        while(head!=null)
        {
            ListNode Next=head.next;
            head.next=prev;
            prev=head;
            head=Next;
        }
        return prev;
    }
}