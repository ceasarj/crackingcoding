package chaoter3.stacksandqueues;

import java.util.Stack;

/**
 * Created by ceejay562 on 9/15/2016.
 */
public class SortStack<E extends Comparable<E>> {
    Stack<E> stack;
    Stack<E> buffer;

    public SortStack(Stack<E> stack){
        this.stack = stack;
        this.buffer = new Stack<>();
        sort();
    }

    public E pop(){
        return stack.pop();
    }

    public E peek(){
        return stack.peek();
    }

    public void push(E item){
        boolean isSorted = false;
        while(!isSorted){
            if(item.compareTo(stack.peek()) <= 0){
                stack.push(item);
                reStack();
                isSorted = true;
            }
            else {
                buffer.push(stack.pop());
            }
        }
    }

    public boolean isEmpty(){
        return stack.isEmpty();
    }

    private void sort(){
        E elementToBeInserted;
        if(!stack.isEmpty()) buffer.push(stack.pop());
        while(!stack.isEmpty()){
            elementToBeInserted = stack.pop();
            if(elementToBeInserted.compareTo(buffer.peek()) >= 0){
                buffer.push(elementToBeInserted);
            }
            else{
                reStack();
                buffer.push(elementToBeInserted);
            }
        }
        reStack();
    }

    /**
     *  Empty out the buffer into main stack
     */
    private void reStack(){
        while(!buffer.isEmpty()){
            stack.push(buffer.pop());
        }
    }

    public static void main(String[] args){
        Stack<Integer> unSortedStack = new Stack<>();
        unSortedStack.push(5);
        unSortedStack.push(4);
        unSortedStack.push(7);
        unSortedStack.push(2);
        unSortedStack.push(0);
        unSortedStack.push(4);
        unSortedStack.push(15);
        unSortedStack.push(3);
        SortStack<Integer> test = new SortStack<>(unSortedStack);
        test.push(10);
        while(!test.isEmpty()){
            System.out.println(test.pop());
        }
    }


}
