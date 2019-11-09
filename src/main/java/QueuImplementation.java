public class QueuImplementation<T> implements Queue<T> {

    private T[] array;
    private Integer front = 0;
    private Integer rear = 1;

    public QueuImplementation(T[] array) {
        this.array = array;
    }

    @Override
    public boolean isEmpty() {
        Integer tmp = this.rear - 1;
        return (tmp.equals(this.front));
    }

    public boolean isFull(){
        return (this.array.length == this.rear);
    }

    @Override
    public T getFrontElement() {
        if (this.isEmpty()){
            return null;
        }
        return this.array[this.front];
    }

    @Override
    public T getRearElement() {
        return this.array[this.rear-2];
    }

    @Override
    public void put(T payload) {
        if (this.isFull()){
            expand();
        }
        this.array[this.rear-1] = payload;
        this.rear++;
    }

    @Override
    public T remove() {
        if (this.isEmpty()){
            return null;
        }
        this.front++;
        return this.array[this.front -1];
    }

    public void expand(){
        T[] newArray = (T[]) new Object[this.array.length * 2];
        System.arraycopy(this.array, 0, newArray, 0, this.array.length);
        this.array = newArray;
    }

}
