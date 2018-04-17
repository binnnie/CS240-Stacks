/*
   Brandon Dixon, Minh Huynh, Carter Schmidt
   04/17/2018
   CS240
   ArrayStack.java
   
   A stack data structure using an linked list implementation.
*/

import java.util.EmptyStackException;

public class ListStack implements DStack{

    private Node last;

    //Constructor: creates an empty stack. Initialize the last field as null.
    public ListStack(){
        last = null;
    }

    //Checks if the stack is empty; returns true if it is, false if it is not.
    @Override
    public boolean isEmpty() {
        return last == null;
    }

    //Accepts a double parameter and adds it to the top of the stack.
    @Override
    public void push(double d) {
        if (isEmpty()){
            last = new Node(null, d);
        } else {
            last.next = new Node(last, d);
            last = last.next;
        }
    }

    //Removes the top value from the stack and returns that value. Throws EmptyStackException if the stack is empty.
    @Override
    public double pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        } else if (last.prev == null) {
            double hold = last.data;
            last = null;
            return hold;
        } else {
            double hold = last.data;
            last = last.prev;
            last.next = null;
            return hold;
        }
    }

    //Returns the top value of the stack without removing it. Throws EmptyStackException if the stack is empty.
    @Override
    public double peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        } else {
            return last.data;
        }
    }

    public String toString(){
        if (isEmpty()) {
            return "[]";
        }else {
            String out = "]";
            Node current = last;
            while (current.prev != null) {
                out = ", " + current.data + out;
                current = current.prev;
            }
            return "[" + current.data + out;
        }
    }
//    //Returns a string representing the data contained in the stack.
//    public String toString(){
//        String out = last.data+"]";
//        return stringIt(last.prev, out);
//    }
//
//    //Private helper method to recurse through the stack. Accepts Node parameter current which is the current node
//    //and a String out which will be returned later.
//    private String stringIt(Node current, String out){
//        if (current.prev == null){
//            return "[" + current.data + ", " + out;
//        } else {
//            return stringIt(current.prev, current.data + ", " + out);
//        }
//    }

    class Node{
        private Node next;
        private Node prev;
        private double data;

        //Constructor for the inner class Node. Accepts Node parameter p and double parameter d and initializes the
        //fields prev, next, and data.
        private Node(Node p, double d){
            prev = p;
            data = d;
            next = null;
        }

        //Returns a string representing the Node's data.
        public String toString(){
            return data+"";
        }
    }
}
