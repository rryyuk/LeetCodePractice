package March_6;

public class QImplementQueueUsingLinkedList {
    public static class ListNode {
        public int val;
        public ListNode next;

        public ListNode() {
        }

        public ListNode(int val) {
            this.val = val;
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static ListNode front;
    public static ListNode rear;

    public static void enqueue(int data) {
        ListNode insertingData = new ListNode(data);
        if (front == null) {
            front = rear = insertingData;
        }
        rear.next = insertingData;
        rear = insertingData;

    }

    public static int dequeue() {
        if (front == null) {
            System.out.println("Empty queue");
        }
        int element = front.val;
        front = front.next;
        return element;
    }

    public static void display() {
        ListNode temp = front;
        if (temp == null) {
            System.out.println("Empty queue");
        } else {
            while (temp != null) {
                System.out.print(temp.val + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        enqueue(1);
        enqueue(2);
        enqueue(3);
        enqueue(4);
        display();
        dequeue();
        display();
    }
}
