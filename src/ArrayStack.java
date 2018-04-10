import java.util.EmptyStackException;

public class ArrayStack implements DStack{
    private int size;
    private double[] data;

    public ArrayStack(){
        size = 0;
        data = new double[10];
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void push(double d) {
        if (size == data.length){
            extend();
        }
        data[size] = d;
        size++;
    }

    @Override
    public double pop() {
        if (isEmpty()){
            throw new EmptyStackException();
        } else {
            size--;
            return data[size];
        }
    }

    @Override
    public double peek() {
        if (isEmpty()){
            throw new EmptyStackException();
        } else {
            return data[size - 1];
        }
    }

    private void extend(){
        double[] hold = new double[data.length*2];
        for (int i = 0; i <= size-1; i++){
            hold[i] = data[i];
        }
        data = hold;
    }

    public String toString(){
        String out = "[";
        for(int i = 0; i < size-1; i++){
            out += data[i]+", ";
        }
        return out+data[size-1]+"]";
    }
}
