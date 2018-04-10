public class ArrayStack implements DStack{

   private int size;
   private double[] data;
   
   public ArrayStack(){
      size = 0;
      data = new double[10];
   }
   
   public boolean isEmpty(){
      return size == 0;
   }
   
   public void push(double d){
      if(data.length < size){
         data[size] = d;
      }
   }
}