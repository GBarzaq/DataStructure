public class DoublyLinkedList <E>{
  private static class Node<E>{
    E e;
    Node<E> next;
    Node<E> prev;
    public Node(E e, Node<E> prev, Node<E> next){
      this.e = e;
      this.prev = prev;
      this.next = next;
    }
    public E getElement() { return element; }

    public Node<E> getPrev() { return prev; }
    
    public Node<E> getNext() { return next; }
    
    public void setPrev(Node<E> p) { prev = p; }

    public void setNext(Node<E> n) { next = n; }
  }
}
