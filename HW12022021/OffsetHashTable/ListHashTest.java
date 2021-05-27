package OffsetHashTable;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class ListHashTest {

    @Test
    public void ifCreatedSuccess() {
        ListHash LHtable = new ListHash(5);
    }

    @Test
    public void ifInsertedSuccess() {
        ListHash LHtable = new ListHash(5);
        LHtable.insert(5);

        int expected = 5;
        int actual = LHtable.getElement(5).data;
        assertEquals(expected, actual);
    }

    @Test
    public void ifInsertCollSuccess() {
        ListHash LHtable = new ListHash(5);
        LHtable.insert(5);
        LHtable.insert(10);

        int expected = 10;
        int actual = LHtable.getElement(10).data;
        assertEquals(expected, actual);
    }

    @Test
    public void ifGetElementSuccess() {
        ListHash LHtable = new ListHash(5);
        LHtable.insert(5);

        int expected = 5;
        int actual = LHtable.getElement(5).data;
        assertEquals(expected, actual);
    }

    @Test
    public void ifRemoveSuccess() {
        ListHash LHtable = new ListHash(5);
        LHtable.insert(5);
        LHtable.insert(10);

        LHtable.remove(10);

        Object expected = null;
        Object actual = LHtable.getElement(10);
        assertEquals(expected, actual);
    }
}
