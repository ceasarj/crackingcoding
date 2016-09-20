package chapter4.treesandgraphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by ceejay562 on 9/19/2016.
 */
public class Problem234 {
    static class Node{
        int val = 0;
        Node left;
        Node right;

        public Node(int val){
            this.val = val;
        }
    }

    /**Problem 2
     * **/
    static Node createBinarySearchTree(int[] vals){
        return createBinarySearchHelper(vals, 0, vals.length-1);

    }

     private static Node createBinarySearchHelper(int[] vals, int min, int max){
         if(min > max) return null;
         int mid = (min + max)/2;
         Node n = new Node(vals[mid]);
         n.left = createBinarySearchHelper(vals, min, mid - 1);
         n.right = createBinarySearchHelper(vals, mid + 1, max);
         return n;
    }

    public static void inOrder(Node n){
        if(n == null) return;
        inOrder(n.left);
        System.out.println(n.val);
        inOrder(n.right);
    }
    /**Problem 3
     *
     * **/
    private static List<LinkedList<Node>> createdepth(Node head){
        List<LinkedList<Node>> list = new ArrayList<>();
        depthHelper(list, head, 0);
        return list;
    }

    private static void depthHelper(List<LinkedList<Node>> list, Node parent,int level){
        if(parent == null) return;
        if(level == list.size()){
            list.add(new LinkedList<>());
        }
        LinkedList<Node> ll = list.get(level);
        ll.add(parent);
        depthHelper(list, parent.left, level + 1);
        depthHelper(list, parent.right, level + 1);
    }

    public static void printDepthList(List<LinkedList<Node>> list){
        list.forEach(ll ->{
            ll.forEach(node ->{
                System.out.print(node.val + " ");
            });
            System.out.println("");
        });
    }

    /***
     * Number 4
     */
    public static int checkHeight(Node root){
        if(root == null) return -1;

        int leftHeight = checkHeight(root.left);
        if(leftHeight == Integer.MAX_VALUE) return Integer.MAX_VALUE;

        int rightHeight = checkHeight(root.right);
        if(rightHeight == Integer.MAX_VALUE) return Integer.MAX_VALUE;

        if(Math.abs(leftHeight - rightHeight) >1) return Integer.MAX_VALUE;

        return Math.max(leftHeight, rightHeight) + 1;

    }


    public static boolean balanced(Node parent){
        return checkHeight(parent) != Integer.MAX_VALUE;
    }

    /***
     * Problem 5 In order variant.
     *
     */
    static Node print = null;
    public static boolean validateBST(Node node){
        if(node == null) return true;
        if(!validateBST(node.left)) return false;

        if(print != null && print.val > node.val){
            return false;
        }

        print = node;

        if(!validateBST(node.right)) return false;

        return false;
    }


    public static void main(String[] args){
        int[] vals = {0,1,2,3,4,64,6,7, 8, 9, 10, 11, 12};
        List<LinkedList<Node>> list = createdepth(createBinarySearchTree(vals));
        printDepthList(list);
        //inOrder(createBinarySearchTree(vals));
        System.out.println(balanced(createBinarySearchTree(vals)));
        System.out.println(validateBST(createBinarySearchTree(vals)));
        Node node = new Node(0);
        Node currNode = new Node(1);
        node.left = currNode;
        node.right = new Node(3);
        currNode.left = new Node(2);
        System.out.println(balanced(node));
    }

}
