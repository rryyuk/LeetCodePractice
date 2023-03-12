package March_6;

public class QCheckIfTwoTreesAreMirror {
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
    public static boolean checkMirror(Node a, Node b)
    {
        if (a == null && b == null)
            return true;

        if (a == null || b == null)
            return false;

        if(a.val == b.val && checkMirror(a.left, b.right) && checkMirror(a.right, b.left) ) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Node tree = new Node();
        Node a = new Node(1);
        Node b = new Node(1);
        a.left = new Node(2);
        a.right = new Node(3);
        a.left.left = new Node(4);
        a.left.right = new Node(5);

        b.left = new Node(3);
        b.right = new Node(2);
        b.right.left = new Node(5);
        b.right.right = new Node(6);

        if (checkMirror(a, b) == true)
            System.out.println("true");
        else
            System.out.println("false");
    }
}
