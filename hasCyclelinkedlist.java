static boolean hasCycle(SinglyLinkedListNode head) {
        if(head==null) return false;
        HashSet<SinglyLinkedListNode> h=new HashSet<>();
        while(head!=null){
            if(h.contains(head)) return true;
            h.add(head);
            head=head.next;
        }
        return false;
}
/*--------------------------------------------------------------------------------------------*/
static boolean hasCycle(SinglyLinkedListNode head) {
        if(head==null) return false;
        SinglyLinkedListNode head1=head;
        while(head.next!=null && head1.next.next!=null){
            head=head.next;
            head1=head.next.next;
            if(head==head1)return true;
        }
        return false;
}