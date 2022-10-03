public class QueueImpl<E> implements Queue<E>{
    // Declare size -- numElems
    private int numElems;
    private E[] data;
    public QueueImpl(int i) {
        // Declare queue data of length i
        data = (E[]) new Object[i];
    }

    @Override
    public void push(E e) throws FullQueueException {
        // If queue is not full, it adds he element to the end
        if (numElems>= data.length) throw new FullQueueException();
        data[numElems++] = e;
    }

    @Override
    public E pop() throws EmptyQueueException {
        E e; // Declares element
        // If queue is not empty
        if (numElems!= 0) {
            e = data[0]; // Element to delete --> then return

            for (int i = 0; i < numElems -1; i++)
                data[i] = data[i + 1]; // Moves elements to left

            data[numElems] = null; // Final element is declared as null
            numElems--; // Reduce the num of elements
            return e; // Return the element to delete
        }
        else
            throw new EmptyQueueException();
    }

    @Override
    public int size() {
        return numElems;
    }
}
