package Collections;

import java.util.*;
class SpecialStack{
    private Stack<Integer> stack;
    private int min;
    public SpecialStack(){
        stack=new Stack();
        min=Integer.MAX_VALUE;
    }
    public void push(int x){
        if(stack.isEmpty()){
            stack.push(x);
            min=x;
        }
        else{
            if(x<=min){
                stack.push(min);
                min=x;
            }
            stack.push(x);
        }
    }

    public int pop(){
        if(stack.isEmpty()){
            throw new IllegalStateException("Stack is empty");
        }

        int element=stack.pop();
        if(element==min){
            min=stack.pop();
        }
        return element;
    }

    public int getMin(){
        if(stack.isEmpty()){
            throw new IllegalStateException("Stack is empty");
        }
        return min;
    }


    public boolean isEmpty(){
        return stack.isEmpty();
    }

    public boolean isFull(int full){
        return stack.size()==full;
    }


}
public class Stack1 {
    public static void main(String args[]) {
        SpecialStack stack = new SpecialStack();
        stack.push(10);
        stack.push(20);
        stack.push(0);
        stack.push(5);
        stack.push(15);
        System.out.println("Minimum element "+stack.getMin());
        stack.pop();
        System.out.println("Minimum element is : "+stack.getMin());
        stack.pop();
        System.out.println("Minimum element is :"+stack.pop());
        stack.push(3);
        System.out.println("Minimum element is :"+stack.getMin());

    }
}

