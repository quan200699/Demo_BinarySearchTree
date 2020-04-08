package com.codegym;

public interface Tree<E> {
    boolean insert(E e);

    void inorder();

    void preOrder();

    void postOrder();

    int getSize();

    boolean find(TreeNode<E> treeNode, E e);

    boolean remove(TreeNode<E> treeNode, E e);

    E minValue(TreeNode<E> treeNode);
}
