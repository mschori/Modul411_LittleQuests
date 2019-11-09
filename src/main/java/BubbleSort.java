import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class BubbleSort<T extends Comparable<T>> implements SortAlgorythms<T> {

    @Override
    public void sort(T[] collection) {
        for (int i = 0; i < collection.length; i++){
            for (int j = 0; j < collection.length -1; j++){
                if (collection[j + 1].compareTo(collection[j]) < 0){
                    final T temp = collection[j + 1];
                    collection[j + 1] = collection[j];
                    collection[j] = temp;
                }
            }
        }
    }

}
