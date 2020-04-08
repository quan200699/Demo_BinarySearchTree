package com.codegym;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree<Integer> tree = new BinarySearchTree<>();
        tree.insert(60);
        tree.insert(55);
        tree.insert(100);
        tree.insert(45);
        tree.insert(57);
        tree.insert(67);
        tree.insert(107);
        tree.insert(59);
        tree.insert(101);
        System.out.println("Inorder (sorted): ");
        tree.inorder();
        System.out.println();
        System.out.println("PreOrder (sorted): ");
        tree.preOrder();
        System.out.println();
        System.out.println("PostOrder (sorted): ");
        tree.postOrder();
        System.out.println();
        System.out.println("The number of nodes is: " + tree.getSize());
        System.out.println(tree.find(tree.root, 101));
        System.out.println("Before remove 100");
        tree.inorder();
        System.out.println();
        System.out.println(tree.remove(tree.root, 100));
        System.out.println("After remove 100");
        tree.inorder();
        System.out.println();
        System.out.println("Before remove 55");
        tree.inorder();
        System.out.println();
        tree.remove(tree.root, 55);
        System.out.println("After remove 55");
        tree.inorder();
    }
}
