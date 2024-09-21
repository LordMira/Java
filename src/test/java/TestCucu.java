import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCucu {
    @Test
    public void testSum() {
        assertEquals(4, result);
    }

    @Test
    public void testDiff() {
        int result = Difference.dif(2, 2);
        assertEquals(0, result);
    }

    @Test
    public void testComp() {
        int result = Difference.dif(2, 2);
        assertEquals(0, result);
    }

    @Test
    public void testDiv() {
        int result = Divan.div(2, 2);
        assertEquals(1, result);
    }
}