class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null) return null;
        ListNode second=head;
        ListNode first=head;
        for(int i=1;i<=n;i++){
            second=second.next;
            if(second==null){
                head=head.next;
                return head;
            }
        }
        while(second.next!=null){
            second=second.next;
            first=first.next;
        }
        first.next=first.next.next;
        return head;
    }
}