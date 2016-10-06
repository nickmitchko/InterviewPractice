package Sorting

/**
 * Created by nicholai on 10/6/16.
 */
class QuicksortTest extends groovy.util.GroovyTestCase {
    void testSort() {
        Quicksort ex = new Quicksort([1, 5, 2, 4, 16, 5, 35, 22]);
        assert ex.sort() == [1, 2, 4, 5, 5, 16, 22, 35];
    }
}
