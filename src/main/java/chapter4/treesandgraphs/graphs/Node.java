package chapter4.treesandgraphs.graphs;

import java.util.List;

/**
 * Created by ceejay562 on 9/19/2016.
 */
public class Node {
    public int val;
    public List<Node> toNodes;
    public boolean visited = false;
    public Node(int val){
        this.val = val;
    }

}
