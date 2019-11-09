import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class PerformenceTest {

    private Integer[] generateList(Integer count) {
        Integer[] list = new Integer[count];
        for (int i = 0; i < list.length; i++) {
            list[i] = (int) (100 * Math.random());
        }
        return list;
    }

    private void clone(Integer[] list, Integer count) {
        for (int i = 0; i < count; i++) {
            Integer[] newList = list.clone();
        }
    }

    @SuppressWarnings("All")
    private void copy(Integer[] list, Integer count) {
        for (int i = 0; i < count; i++) {
            Integer[] newList = new Integer[count + 10];
            for (int j = 0; j < list.length; j++) {
                newList[j] = list[j];
            }
        }
    }

    @Test
    void performenceTest(){
        Integer count = 10_000;
        Integer[] list = this.generateList(count);

        // Clone test
        Long startTime = System.currentTimeMillis();
        this.clone(list, count);
        Long endTime = System.currentTimeMillis();
        System.out.println("Time for clone: " + (endTime - startTime) + " Millisekunden");

        // Copy test
        startTime = System.currentTimeMillis();
        this.copy(list, count);
        endTime = System.currentTimeMillis();
        System.out.println("Time for copy: " + (endTime - startTime) + " Millisekunden");
    }

}
