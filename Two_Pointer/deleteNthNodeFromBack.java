public class deleteNthNodeFromBack {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        //1st method
        // ListNode dummy = new ListNode(0);
        // dummy.next = head;
        // int len = 0;
        // ListNode l = head;

        // while(l != null){
        //     len=len+1;
        //     l=l.next;
        // } 

        // int d= len-n+1;
        // ListNode prev = dummy, curr = head;

        // int i=0;

        // while(i<(d-1)){
        //     curr = curr.next;
        //     prev = prev.next;
        //     i=i+1;
        // }

        // prev.next = prev.next.next;


        // return dummy.next;


        //2nd method

        ListNode fast=head;
        ListNode slow=head;
        for(int i=0;i<n;i++){
            fast=fast.next;
        }
        if(fast==null) return head.next;
        while(fast.next!=null){
            slow=slow.next;
            fast = fast.next;
        }
        ListNode delNode=slow.next;
        slow.next=slow.next.next;
        
        return head;
    }
}
