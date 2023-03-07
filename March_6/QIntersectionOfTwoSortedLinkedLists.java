package March_6;


import java.net.SocketOption;

public class QIntersectionOfTwoSortedLinkedLists {


    public static class ListNode {
        public int val;
        public ListNode next;
        public ListNode() {}
        public ListNode(int val) { this.val = val; }
        public ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static void main(String[] args) {
        ListNode c1 = new ListNode(4,null);
        ListNode b1 = new ListNode(3,c1);
        ListNode a1 = new ListNode(2,b1);
        ListNode head1 = new ListNode(1,a1);

        ListNode c2 = new ListNode(5,null);
        ListNode b2 = new ListNode(4,c2);
        ListNode a2 = new ListNode(3,b2);
        ListNode head2 = new ListNode(2,a2);

        ListNode temp1 = head1;
        ListNode temp2 = head2;

        ListNode head3 = new ListNode();
        ListNode current = head3;

        while(temp1 != null && temp2 != null) {
            if(temp1.val == temp2.val) {
                ListNode tempNewNode = new ListNode(temp1.val);
                current.next = tempNewNode;
                current = current.next;
                temp1 = temp1.next;
                temp2 = temp2.next;
            }
            else if(temp1.val > temp2.val){
                temp2 = temp2.next;
            }
            else if(temp1.val < temp2.val){
                temp1 = temp1.next;
            }
        }

        System.out.println(head3.val);
        System.out.println(head3.next.val);
        System.out.println(head3.next.next.val);
        System.out.println(head3.next.next.next.val);
        System.out.println(head3.next.next.next.next.val);


    }
}
