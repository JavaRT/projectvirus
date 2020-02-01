package pakiet2;

public class ApppMain {
    public static void main(String[] args) {

        MyQueue<String> myStringQueque = new MyQueue<>();
        myStringQueque.offer("hello");
        MyQueue<Integer> myIntegerQueque = new MyQueue<>();
        myStringQueque.offer("it is me");
        myStringQueque.offer("you are looking for");
        myStringQueque.offer("no");
        myStringQueque.printAll();
        myStringQueque.pool();
        myStringQueque.pool();
        System.out.println("after removal: ");
        myStringQueque.printAll();



    }
}