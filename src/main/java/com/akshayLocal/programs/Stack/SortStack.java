package com.akshayLocal.programs.Stack;

import java.util.Stack;

public class SortStack {
    public static void main(String args[])
    {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(30);
        stack.push(50);
        stack.push(40);
        System.out.println("Before Sort");
        printStack(stack);
        sortStack(stack);
        System.out.println("After Sort");
        printStack(stack);
    }

    public static void sortStack(Stack fstack)
    {
        System.out.println("Inside sortStack Method");
        Stack<Integer> tempStack = new Stack();

        System.out.println(tempStack.isEmpty());
        System.out.println(fstack.peek());
        System.out.println("temp stack was ||");
        Integer currentData = (Integer) fstack.pop();

        while(!fstack.empty())
        {
            if(!tempStack.empty())
            {
                System.out.println(!tempStack.empty());
                while(tempStack.peek() > currentData)
                {
                    fstack.push(tempStack.pop());
                }
            }
            tempStack.push(currentData);
            printStack(tempStack);
        }

    }
    public static void printStack(Stack stack)
    {
        /*for(int i=0;i<stack.capacity();i++)
        {
            System.out.println(stack.pop());
        }*/
        while(!stack.isEmpty())
        {
            System.out.println(stack.pop());
        }
    }

}
