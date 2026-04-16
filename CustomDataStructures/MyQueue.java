package CustomDataStructures;

public class MyQueue<E> {
    private final LinkedList<E>  list = new LinkedList<>();

    public void enqueue(E e){
        list.add(e);
    }
    public void dequeue(){
        list.removeFirst();
    }
    public E peek(){
        if(list.size()==0){
            throw new RuntimeException("Stack is empty");
        }
        return list.getFirst();
    }
    public boolean isEmpty(){
        return list.size()==0;
    }
}
