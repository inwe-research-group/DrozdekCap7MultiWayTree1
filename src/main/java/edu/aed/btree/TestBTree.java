package edu.aed.btree;

public class TestBTree {
    public static void main(String[] args)
    {
        String bstName = "B-Tree";
        boolean added;
        BTree<Integer> bst = new BTree<Integer>(5);
        bst.add(2);
        bst.add(8);
        bst.add(14);
        bst.add(15);
        bst.add(3);
        bst.add(1);
        bst.add(16);
        bst.add(6);
        bst.add(5);
        bst.add(27);
        bst.add(37);
        bst.add(18);
        bst.add(25);
        bst.add(7);
        bst.add(13);
        bst.add(20);
        bst.add(22);
        bst.add(23);
        bst.add(24);
        System.out.println(bst.toString());


    }
}
