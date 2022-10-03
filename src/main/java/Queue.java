




public interface Queue<E> {
    // Element to add or remove from the queue --> e
    // Declare size of Queue
    // If queue is full --> FullQueueException
    // If queue is empty --> EmptyQueueException
    public int size();
    public void push(E e) throws FullQueueException;
    public E pop() throws EmptyQueueException;

}
