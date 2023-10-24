
class Solution {
    public Node copyRandomList(Node head) {
        if(head == null) {
            return null;
        }
        Node current = head;

        while(current != null) {
            Node temp = current.next;
            current.next = new Node(current.val);
            current.next.next = temp;
            current = temp;
        }
        current = head;

        while(current != null) {
            if(current.next != null){
                if(current.random == null) {
                    current.next.random = null;
                } else {
                    current.next.random = current.random.next;
                }
            }
            current = current.next.next;
        }

        Node temp1 = head; 
        Node clonedHead = head.next;
        Node temp2 = clonedHead;

        while(temp1 != null) {
            temp1.next = temp1.next.next;

            if(temp2.next != null) {
                temp2.next = temp2.next.next;
            } else {
                temp2.next = null;
            }
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return clonedHead;
        // changes will be made

    }
}
