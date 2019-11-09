import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class SortAlgorythmTest {

    // Length of array
    private Integer[] listUnsorted;
    private Integer[] listSorted;


    @BeforeEach
    void setup(){
        this.listUnsorted = new Integer[]{5, 6, 7, 2, 1, 3, 9, 10, 4, 8};
        this.listSorted = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    }

    private void print(String text, Integer[] list) {
        System.out.println("\n" + text);
        for (int value : list) System.out.print(value + " ");
        System.out.print("\n");
    }

    @Test
    void bubbleSort(){
        BubbleSort bubbleSort = new BubbleSort();
        this.print("List before:", listUnsorted);
        bubbleSort.sort(listUnsorted);
        assertArrayEquals(listSorted, listUnsorted);
        this.print("List after:", listUnsorted);
    }

    @Test
    void insertionSort(){
        InsertionSort insertionSort = new InsertionSort();
        this.print("List before:", listUnsorted);
        insertionSort.sort(listUnsorted);
        assertArrayEquals(listSorted, listUnsorted);
        this.print("List after:", listUnsorted);
    }


}
