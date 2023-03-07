package March_1;

public class QInsertInLinkedListAtAPosition {
    public static class ListNode {
        public int val;
        public ListNode next;
        public ListNode() {}
        public ListNode(int val) { this.val = val; }
        public ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public static void main(String[] args) {
        ListNode c = new ListNode(4,null);
        ListNode b = new ListNode(3,c);
        ListNode a = new ListNode(2,b);
        ListNode head = new ListNode(1,a);

        ListNode tempNode = head;
        ListNode newNode = new ListNode();
        int value  = 10;
        newNode.val = value;
        int n = 4;

        if(head == null) {
            System.out.println("null");
        } else if(n == 1) {

            newNode.next = head;
            head = newNode;
        } else {
            int i = 0;
            while(i < n -1) {
                tempNode = tempNode.next;
                i++;
            }
            newNode.next = tempNode.next;
            tempNode.next = newNode;
        }
        System.out.println(head.val);
        System.out.println(head.next.val);
        System.out.println(head.next.next.val);
        System.out.println(head.next.next.next.val);
        System.out.println(head.next.next.next.next.val);


    }
}
