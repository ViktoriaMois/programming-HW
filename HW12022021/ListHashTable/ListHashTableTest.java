package ListHashTable;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class ListHashTableTest {
    @Test
    public void ifCreatedSuccess() {
        ListHashTable table = new ListHashTable(9);
    }

    @Test
    public void ifInsertedSuccess() {
        ListHashTable table = new ListHashTable(9);
        table.insert(9);

        int expected = 9;
        int actual = table.get(0).getValueByIndex(0).data;
        assertEquals(expected, actual);
    }

    @Test
    public void ifInsertCollSuccess() {
        ListHashTable table = new ListHashTable(9);
        table.insert(9);
        table.insert(18);

        int expected = 18;
        int actual = table.get(0).getValueByIndex(1).data;
        assertEquals(expected, actual);
    }

    @Test
    public void ifGetElementSuccess() {
        ListHashTable table = new ListHashTable(9);
        table.insert(9);

        int expected = 9;
        int actual = table.get(0).getValueByIndex(0).data;
        assertEquals(expected, actual);
    }

    @Test
    public void ifRemoveSuccess() {
        ListHashTable table = new ListHashTable(9);
        table.insert(9);
        table.insert(18);

        table.remove(18);

        boolean expected = false;
        boolean actual = table.get(0).contains(new TableObject(18 % 9, 18));
        assertEquals(expected, actual);
    }
}
