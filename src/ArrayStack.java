import java.util.EmptyStackException;

public class ArrayStack implements DStack{
    private int size;
    private double[] data;

    //Constructor: Creates an empty stack. Initializes the size field and the data field.
    public ArrayStack(){
        size = 0;
        data = new double[10];
    }

    //Checks if the stack is empty. Returns true if it is empty and false if it isn't.
    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    //Accepts a double parameter d and adds that value to the top of the stack.
    @Override
    public void push(double d) {
        if (size == data.length){
            extend();
        }
        data[size] = d;
        size++;
    }

    //Removes the top value from the stack and returns that value. Throws an EmptyStackException if the stack is empty.
    @Override
    public double pop() {
        if (isEmpty()){
            throw new EmptyStackException();
        } else {
            size--;
            return data[size];
        }
    }

    //Returns the top value of the stack without removing it. Throws an EmptyStackException if the stack is empty.
    @Override
    public double peek() {
        if (isEmpty()){
            throw new EmptyStackException();
        } else {
            return data[size - 1];
        }
    }

    //Private method to extend the length of the data array field by a factor of 2.
    private void extend(){
        double[] hold = new double[size*2];
        for (int i = 0; i <= size-1; i++){
            hold[i] = data[i];
        }
        data = hold;
    }

    //Returns a string to represent the data in the stack.
    public String toString(){
        String out = "[";
        for(int i = 0; i < size-1; i++){
            out += data[i]+", ";
        }
        return out+data[size-1]+"]";
    }
}
