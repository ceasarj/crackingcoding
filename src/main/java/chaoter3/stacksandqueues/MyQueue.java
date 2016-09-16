package chaoter3.stacksandqueues;

import java.util.Stack;

/**
 * Implement a queue using two stacks
 */
public class MyQueue<T> {
    Stack<T> queue;
    Stack<T> stack;

    public MyQueue(){
        queue = new Stack<>();
        stack = new Stack<>();
    }

    public void add(T item){
        stack.push(item);
    }

    public T remove(){
        if(queue.empty()) stackQueue();
        return queue.pop();
    }

    public T peek(){
        if(queue.empty()) stackQueue();
        return queue.peek();
    }

    public int size(){
        return queue.size() + stack.size();
    }

    public boolean isEmpty(){
        return stack.isEmpty() && queue.isEmpty();
    }

    private void stackQueue(){
        while(!stack.empty()){
            queue.push(stack.pop());
        }
    }

    public static void main(String[] args){
        MyQueue<Integer> myQueue = new MyQueue<>();
        for(int i=0; i<10; i++){
            myQueue.add(i);
        }
        System.out.println(myQueue.peek());
        while(!myQueue.isEmpty()){
            System.out.println(myQueue.peek());
            System.out.println(myQueue.remove());
        }
    }


}
