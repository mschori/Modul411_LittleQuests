
public class InsertionSort<T extends Comparable<T>> implements SortAlgorythms<T> {

    @Override
    public void sort(T[] collection) {
        for (int i = 1; i <= collection.length - 1; i++) {
            T value = collection[i];
            int j = i;
            while (j > 0 && collection[j - 1].compareTo(value) > 0) {
                collection[j] = collection[j - 1];
                j = j - 1;
            }
            collection[j] = value;
        }
    }

}
