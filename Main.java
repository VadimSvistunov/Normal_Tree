package com.company;

public class Main {

    static Tree tree = new Tree();

    public static void main(String[] args) {
        tree.add(4);
        tree.add(0);
        tree.add(-4);
        tree.add(1);
        tree.add(3);
        tree.add(-6);
        tree.add(8);
        tree.add(9);
        tree.forwardTraversal();
        tree.delete(4);
        tree.delete(0);
        tree.delete(-6);
        tree.forwardTraversal();
        tree.simmetricTraversal();
        tree.backwardTraversal();

    }
}
