import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

class QueuImplementationTest {

    // Length of array
    private Integer count = 10;
    private Integer[] array = new Integer[count];

    private QueuImplementation<Integer> queue = new QueuImplementation<Integer>(array);

    @BeforeEach
    void setup(){
        for (int i = 1; i <= count; i++) {
            queue.put(i);
        }
    }

    @Test
    void getFrontElement() {
        Integer expectedNumber = 1;
        assertEquals(expectedNumber, queue.getFrontElement());
    }

    @Test
    void getRearElement() {
        assertEquals(count, queue.getRearElement());
    }

    @Test
    void put() {
        Integer expected = 666;
        queue.put(expected);
        assertEquals(expected, queue.getRearElement());
    }

    @Test
    void remove() {
        Integer expexted = 2;
        queue.remove();
        assertEquals(expexted, queue.getFrontElement());
    }
}