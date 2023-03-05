package March_4;
class Node {
    int data;
    Node left;
    Node right;
    Node(int v)
    {
        this.data = v;
        this.left = this.right = null;
    }
}
public class QTreeTraversals {
    public static void Inorder(Node node)
    {
        if (node == null)
            return;

        Inorder(node.left);
        System.out.print(node.data + " ");
        Inorder(node.right);
    }
    public static void preOrder(Node node)
    {
        if (node == null)
            return;

        System.out.print(node.data + " ");
        preOrder(node.left);
        preOrder(node.right);

    }
    public static void postOrder(Node node)
    {
        if (node == null)
            return;

        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.data + " ");
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.right = new Node(2);
        root.right.left = new Node(3);


        System.out.print("Inorder Traversal: ");
        Inorder(root);
        System.out.println();

        System.out.print("Inorder Traversal: ");
        preOrder(root);

        System.out.println();
        System.out.print("Inorder Traversal: ");
        postOrder(root);
    }

}
