import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GBLinkedListTest {
    @Test
    void addLastTest() {
        GBLinkedList<String> sList = new GBLinkedList<>();
        sList.addLast("asd");
        Assertions.assertEquals("asd", sList.getElement(0));
    }

    @Test
    void addLastNegativeTest() {
        GBLinkedList<String> sList = new GBLinkedList<>();
        sList.addLast("asd");
        Assertions.assertEquals("acd", sList.getElement(0));
    }

    @Test
    void addFirstTest() {
        GBLinkedList<Integer> list = new GBLinkedList<>();
        list.addLast(88);
        Assertions.assertEquals(88, list.getElement(0));
    }

    @Test
    void addFirstNegativeTest() {
        GBLinkedList<Integer> list = new GBLinkedList<>();
        list.addLast(88);
        Assertions.assertEquals(8, list.getElement(0));
    }
}
