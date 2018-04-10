import java.util.EmptyStackException;

public class ListStack implements DStack{

    private Node last;

    public ListStack(){
        last = null;
    }

    @Override
    public boolean isEmpty() {
        return last == null;
    }

    @Override
    public void push(double d) {
        if (isEmpty()){
            last = new Node(null, d);
        } else {
            last.next = new Node(last, d);
            last = last.next;
        }
    }

    @Override
    public double pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        } else {
            double hold = last.data;
            last = last.prev;
            last.next = null;
            return hold;
        }
    }

    @Override
    public double peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        } else {
            return last.data;
        }
    }

    public String toString(){
        String out = last.data+"]";
        return stringIt(last.prev, out);
    }

    private String stringIt(Node current, String out){
        if (current.prev == null){
            return "["+out;
        } else {
            return stringIt(current.prev, current.data+", "+out);
        }
    }

    class Node{
        private Node next;
        private Node prev;
        private double data;

        private Node(Node p, double d){
            prev = p;
            data = d;
            next = null;
        }

        public String toString(){
            return data+"";
        }
    }
}
