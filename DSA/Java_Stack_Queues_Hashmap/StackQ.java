package Java_Stack_Queues_Hashmap;

import java.util.Stack;

public class StackQ {
	
	    private Stack<Integer> stack1;
	    private Stack<Integer> stack2;

	    public StackQ() {
	        stack1 = new Stack<>();
	        stack2 = new Stack<>();
	    }

	    public void enqueue(int x) {
	        stack1.push(x);
	    }

	    public int dequeue() {
	        shiftStacks();
	        return stack2.pop();
	    }

	    public int peek() {
	        shiftStacks();
	        return stack2.peek();
	    }

	    public boolean empty() {
	        return stack1.isEmpty() && stack2.isEmpty();
	    }

	    private void shiftStacks() {
	        if (stack2.isEmpty()) {
	            while (!stack1.isEmpty()) {
	                stack2.push(stack1.pop());
	            }
	        }
	    }

	    public static void main(String[] args) {
	        StackQ q = new StackQ
	        		();
	        q.enqueue(10);
	        q.enqueue(20);
	        q.enqueue(30);

	        System.out.println(q.peek());    
	        System.out.println(q.dequeue()); 
	        System.out.println(q.peek());    
	        System.out.println(q.empty());  
	    }
	}


