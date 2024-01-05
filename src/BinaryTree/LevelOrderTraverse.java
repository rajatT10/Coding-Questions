package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraverse {
    Node root;

    public static void main(String[] args) {
        LevelOrderTraverse tree = new LevelOrderTraverse();

        tree.root = new Node(3);

        tree.root.left = new Node(5);
        tree.root.left.left = new Node(1);
        tree.root.left.right = new Node(4);

        tree.root.right = new Node(2);
        tree.root.right.left = new Node(6);

        tree.levelOrder(tree.root);
    }

    void levelOrder(Node root) {
        Queue<Node> enq = new LinkedList<>();
        enq.add(root);
        while(!enq.isEmpty()){
            Node node = enq.remove();
            if(node.left!=null)
                enq.add(node.left);
            if(node.right!=null)
                enq.add(node.right);
            System.out.print(node.data);
        }
    }
}
