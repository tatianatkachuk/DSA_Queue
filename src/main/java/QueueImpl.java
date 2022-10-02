public class QueueImpl<E> implements Queue<E>{
    private int numElems;
    private E[] data;
    public QueueImpl(int i) {
        data = (E[]) new Object[i];
    }

    @Override
    public void push(E e) throws FullQueueException {
        if (numElems>= data.length) throw new FullQueueException();
        data[numElems++] = e;
    }

    @Override
    public E pop() throws EmptyQueueException {
        E e;
        if (numElems!= 0) {
            e = data[0];

            for (int i = 0; i < numElems -1; i++)
                data[i] = data[i + 1];

            data[numElems] = null;
            numElems--;
            return e;
        }
        else
            throw new EmptyQueueException();
    }

    @Override
    public int size() {
        return numElems;
    }
}
