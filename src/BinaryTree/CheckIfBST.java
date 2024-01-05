package BinaryTree;

import java.util.ArrayList;

public class CheckIfBST {
    Node root;

    void inOrder(Node root, ArrayList<Integer> list){
        if(root!=null){
            inOrder(root.left,list);
            list.add(root.data);
            inOrder(root.right,list);
        }
    }

    boolean checkBST(Node root){
        ArrayList<Integer> list = new ArrayList<>();
        inOrder(root,list);
        System.out.println("list = " + list);
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) > list.get(i+1)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        CheckIfBST tree = new CheckIfBST();

        tree.root = new Node(3);

        tree.root.left = new Node(5);
        tree.root.left.left = new Node(1);
        tree.root.left.right = new Node(4);

        tree.root.right = new Node(2);
        tree.root.right.left = new Node(6);

        boolean flag = tree.checkBST(tree.root);
        System.out.println("Is it BST ?  = " + flag);
    }
}
