package Kap4_Beaume;

public interface BinaryTree {
    boolean insert(int value);
    void printPreorder();
    void printInorder();
    void printPostorder();
    boolean search(int value);
}
