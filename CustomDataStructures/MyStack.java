package CustomDataStructures;

public class MyStack<E> {
        private final LinkedList<E> list = new LinkedList<>();

        public void push(E e){
                list.addFirst(e);
        }
        public E pop(){
                return list.removeFirst();
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
