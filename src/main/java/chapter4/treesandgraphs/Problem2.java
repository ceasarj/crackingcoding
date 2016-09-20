package chapter4.treesandgraphs;

/**
 * Created by ceejay562 on 9/19/2016.
 */
public class Problem2 {
    static class Node{
        int val = 0;
        Node left;
        Node right;

        public Node(int val){
            this.val = val;
        }
    }

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

    public static void main(String[] args){
        int[] vals = {0,1,2,3,4,5,6,7};
        inOrder(createBinarySearchTree(vals));
    }

}
