package com.codegym;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree<String> tree = new BinarySearchTree<>();
        tree.insert("George");
        tree.insert("Michael");
        tree.insert("Tom");
        tree.insert("Adam");
        tree.insert("Jones");
        tree.insert("Peter");
        tree.insert("Daniel");
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
        System.out.println(tree.find(tree.root, "George"));
        System.out.println(tree.remove(tree.root, "Tom"));
    }
}
