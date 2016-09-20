package chapter3.treesandgraphs;

import chapter3.treesandgraphs.graphs.Graph;
import chapter3.treesandgraphs.graphs.Node;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

/**
 * Created by ceejay562 on 9/19/2016.
 */
public class Problem1 {
    Set<Integer> set = new HashSet<>();
    boolean path(Node from, Node to){
        if(from == null || to == null) return false;
        if(from.val == to.val) return true;
        if(from.toNodes != null) {
            for (Node adjacentNode : from.toNodes) {
                if (!set.contains(adjacentNode.val)) {
                    set.add(adjacentNode.val);
                     return false || path(adjacentNode, to);
                }
            }
        }
        return false;
    }

    public static void main(String[] args){
        Problem1 p = new Problem1();
        Node n = new Node(3);
        System.out.println(p.path(Graph.populateSimpleGraph(), n));
    }

}
