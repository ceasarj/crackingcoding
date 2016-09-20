package chapter3.treesandgraphs.graphs;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by ceejay562 on 9/19/2016.
 */
public class Graph {
//    /***
//     * Assume the edges are of the same length.
//     * @return head of the graph
//     */
//    public static Node populateGraph(){
//        Random ran = new Random();
//        Node head = null;
//        for(int i=0; i<10; i++){
//            // size of the adjacent nodes
//            int size = ran.nextInt(3) + 1;
//            Node currNode = new Node();
//            currNode.val = i;
//            currNode.toNodes = new ArrayList<>();
//            int counter = 0;
//            while(counter < size) {
//
//                currNode.toNodes.add(ran.nextInt(10));
//            }
//            if(i ==0) head = currNode;
//        }
//        return head;
//    }

    public static Node populateSimpleGraph(){
        Node head = new Node(0);
        head.val = 0;
        head.toNodes = new ArrayList<>();
        Node children = new Node(0);
        children.val = 1;
        children.toNodes = new ArrayList<>();
        children.toNodes.add(new Node(2));
        head.toNodes.add(children);
        children = new Node(2);
        head.toNodes.add(children);
        return head;

    }

}
