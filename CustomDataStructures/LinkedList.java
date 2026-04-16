package CustomDataStructures;
/**
 * Custom implementation of a doubly linked list.
 * Similar in behavior to java.util.LinkedList.
 */
public class LinkedList<E>{
    // Pointer to first node
    Node<E> head;
    // Pointer to last node
    Node<E> tail;

    // Number of elements in the list
    // transient because it should not be serialized
    transient int size=0;
    private static class Node<E>{
        E data;
        Node<E> next;
        Node<E> prev;

        /**
         * Node class representing each element in the list.
         * It stores:
         * - data
         * - reference to next node
         * - reference to previous node
         */
        public Node(  Node<E> prev, E data, Node<E> next) {
            this.prev = prev;
            this.next = next;
            this.data = data;
        }
    }
    /**
     * Returns the node at a given index.
     * Uses bidirectional traversal:
     * - from head if index is in first half
     * - from tail if index is in second half
     */    private Node<E> node(int index){
        if(index<size/2){
            Node<E> x = head;
            for(int i=0;i < index;i++){
                x= x.next;
            }
            return x;
        }else{
            Node<E> x = tail;
            for(int i=size-1; i > index;i--){
                x= x.prev;
            }
            return x;
        }
    }
    /**
     * Returns the node that contains the given object.
     * Handles both null and non-null values.
     */
    private Node<E> node(Object o){
        if(o==null){
            for(Node<E> x=head; x==null; x= x.next){
                if(x.data==null){
                    return x;
                }
            }
        }else{
            for(Node<E> x=head; x!=null; x= x.next){
                if(o.equals(x.data)){
                    return x;
                }
            }
        }
        return null;
    }
    /**
     * Links a new node at the end of the list.
     *     // fetches current tail node  : prev
     *     // creates a new node using the contructor :newNode
     *     // assigns newNode as the tail
     *     // if the prev is null (previous tail node is  null)
     *     //      --> head = newNode
     *     // else chains the new tail node to the prev.next
     *     // increases the size
     */
    private void linkLast(E data){
        final Node<E> prev = tail;
        final Node<E> newNode = new Node<>(prev,data,null);
        tail=newNode;
        if(prev==null){
            head =newNode;
        }else{
            prev.next=newNode;
        }
        size++;
    }
    /**
     * Inserts a new node before the given node.
     *     // takes a node and data
     *     // fetches the node's prev in :prev
     *     // creates a newNode with the data .. provided node's prev as prev of newNode and next: node in argument
     *     // node's prev as the newNode
     *     // prev.next=newNode to chain newNode to the previous node
     */
    private void linkBefore(Node<E> currNode ,E data){
        Node<E> prev = currNode.prev;
        Node<E> newNode =  new Node<>(currNode.prev,data,currNode);
        currNode.prev=newNode;
        if(prev==null){
            head = newNode;
        }else{
            prev.next=newNode;
        }
        size++;
    }
    /**
     * Adds an element at the end of the list.
     */
    public boolean add(E data) {
        linkLast(data);
        return true;
    };

    /**
     * Adds an element at the beginning of the list.
     */    public void addFirst(E data){
        final Node<E> h = head;
        final Node<E> newNode = new Node<>(null,data, head);
        head=newNode;
        if(h==null){
            tail=newNode;
        }else{
            h.prev=newNode;
        }
        size++;
    }

    /**
     * Inserts an element at a specific index.
     *     // takes index and value for newNode
     *     // if the index is the last index of the list
     *     //      ---> calls linkLast()    //because only have to replace the last tail node
     *     // else calls the linkBefore()
     */
    public void add(int index,E data){
        checkPositionIndex(index);
        if(index==size){
            linkLast(data);
        }else{
            linkBefore(node(index), data);
        }
    }

    /**
     * Removes the first occurrence of the given value(object).
     */
    public boolean remove(Object o){
        unlink(node(o));
        return true;
    }
    /**
     * Returns the first element of the list.
     */
    public E getFirst(){
        if(head==null){
            throw new RuntimeException("list is empty ");
        }
        return head.data;
    }

//    private void reverseNode(Node<E> node){
//        Node<E> prev = node.prev;
//        Node<E> next = node.next;
//
//        node.prev= next;
//        node.next =prev;
//    }
//    public void reverseList(){
//        Node<E> current=tail;
//        while(current!=null){
//            reverseNode(current);
//            current = current.prev;
//        }
//        Node<E> temp = head;
//        head = tail;
//        tail = temp;
//    }

    /***
     * reverses the list
     ***/
    public void reverseList() {
        Node<E> current = head;
        Node<E> temp = null;

        while (current != null) {
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;

            current = current.prev;
        }
        temp = head;
        head = tail;
        tail = temp;
    }

    /**
     * Removes and returns the first element.
     *      // removes the head and makes head.next as the new head
     *      // head does not exist -> return and throw list is empty
     */
    public E removeFirst(){
        if (head == null) {
            throw new RuntimeException("List is empty");
        }
        Node<E> h = head;
        E e =  head.data;
        Node<E> next = head.next;
        if(next==null){
            tail=null;
        }else{
            next.prev=null;
            head = next;
        }
        // Help GC
        h.next=null;
        h.data=null;
        size--;
        return e;
    }
    /**
     * Unlinks a given node from the list.
     *
     */
    private void unlink (Node<E> node){
        Node<E> prev = node.prev;
        Node<E> next = node.next;
        if(prev==null){
            head=next;
        }else{
            prev.next=next;
            node.prev=null;
        }

        if(next==null){
            tail=prev;
        }else{
            next.prev=prev;
            node.next=null;
        }
        node.data=null;
        size--;
    }
    /**
     * Validates index for insertion.
     */
    private void checkPositionIndex(int index){
        if(!isPositionIndex(index,size)){
            throw new RuntimeException("index out of bounds!");
        }
    }

    /**
     * Returns true if index is valid for insertion.
     */
    private boolean isPositionIndex(int index,int size){
        return index>=0 && index<=size;
    }

    /**
     * Prints all elements of the list.
     */
   public  void printList(){
        Node<E> current=head;
        while(current!=null){
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
    /**
     * Returns number of elements in the list.
     */
   public  int size(){
        return size;
    }
}
