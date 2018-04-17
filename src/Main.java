public class Main {
    public static void main(String[] args){
        ListStack test = new ListStack();
        for (int i = 0; i <= 11; i++){
            test.push(i+.1);
        }
        System.out.println(test.toString());
        System.out.println(test.pop());
        System.out.println(test.peek());
        System.out.println(test);
        for(int i = 0 ; i < 11 ; i++){
            test.pop();
            System.out.println(test);
        }
        System.out.println(test);
    }
}
