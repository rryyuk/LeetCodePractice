package March_6;

public class Q61RotateList {
    public static class ListNode {
        public int val;
        public ListNode next;
        public ListNode() {}
        public ListNode(int val) { this.val = val; }
        public ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public static ListNode rotateList(ListNode head, int k) {
        ListNode temp = head;
        if (head == null || k == 0) {
            return head;
        }
        int length = 0;
        while(temp.next!= null) {
            length++;
            temp = temp.next;
        }
        temp.next = head;

        k =  k%(length+1);
        int rotation = length - k;

        temp = head;


        while(rotation != 0) {
            temp = temp.next;
            rotation--;
        }
        head = temp.next;
        temp.next = null;

        return head;
    }
     public static void main(String[] args) {
        ListNode c = new ListNode(4,null);
        ListNode b = new ListNode(3,c);
        ListNode a = new ListNode(2,b);
        ListNode head = new ListNode(1,a);
         System.out.print(head.val);
         System.out.print(head.next.val);
         System.out.print(head.next.next.val);
         System.out.print(head.next.next.next.val);
         System.out.println();
         head = rotateList(head,2);


        System.out.print(head.val);
        System.out.print(head.next.val);
        System.out.print(head.next.next.val);
        System.out.print(head.next.next.next.val);
     }
}
