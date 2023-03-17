package March_17;

public class QSizeOfTree {
    public static class Node {
        int val;
        Node left;
        Node right;

        Node() {
        }
        Node(int val) {
            this.val = val;
        }

        Node(int val, Node left, Node right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public static int sizeOftree(Node root) {
        if(root == null) {
            return 0;
        }
        return(sizeOftree(root.left) + sizeOftree(root.right) + 1 );
    }
    public static void main(String[] args) {
        Node tree = new Node();
        Node a = new Node(1);
        a.left = new Node(2);
        a.right = new Node(3);
        a.left.left = new Node(4);
        a.left.right = new Node(5);
        System.out.print(sizeOftree(a));
    }
}
