package Kap4_Beaume;


import static pr.MakeItSimple.*;

public class BinaryTreeImpl implements BinaryTree {
    private TreeNode root;

    @Override
    public boolean insert (int value) {
        TreeNode parent = null;
        TreeNode child = root;

        while (child != null) {  // at least 1 node in tree
            parent = child;
            if (value == child.getValue()) {
                return false;  // element already in tree, value is not inserted
            } else if (value < child.getValue()) {
                child = child.getLeft(); // insert in left tree
            } else {
                child = child.getRight(); // insert in right tree
            }
        }
        // parent node found
        if (parent == null) {   //empty tree -> insert first node
            root = new TreeNode(value);
        } else if (parent.getValue() < 0) {
            parent.setLeft(new TreeNode(value)); // insert left from parent
        } else {
            parent.setRight(new TreeNode(value)); //insert right from parent
        }
        return true;
    }

    @Override
    public void printPreorder() {
        System.out.print("Preorder: ");
        printPreorder(root);
        System.out.println();
    }

    private void printPreorder(TreeNode node) {
        if (node != null) {
            System.out.print(node.getValue() + " ");
            printPreorder(node.getLeft());
            printPreorder(node.getRight());
        }
    }


    @Override
    public void printInorder() {

    }

    @Override
    public void printPostorder() {

    }

    @Override
    public boolean search(int value) {
        return false;
    }
}
