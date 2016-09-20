package chapter4.treesandgraphs.trees;

/**
 * Created by ceejay562 on 9/19/2016.
 */
public class Node<E extends Comparable> {
    Node left;
    Node right;
    E val;

    public Node(E val){
        this.val = val;
    }

}
