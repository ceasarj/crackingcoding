package chapter2.arrayandstrings;

import java.util.HashSet;

/**
 * Created by ceejay562 on 9/19/2016.
 */
public class Problem1 {

    void removeDuplicate(Node head){
        HashSet<Integer> set = new HashSet<>();
        Node prev = null;
        Node curr = head;

        while(curr != null){
            if(set.contains(curr.val)){
                prev.setNext(curr.next());
            }
            else {
                prev = head;
                set.add(curr.val);
            }
            curr.setNext(curr.next());
        }
    }


}
