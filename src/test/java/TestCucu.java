import org.example.Calculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCucu {
    @Test
    public void testSum() {
        assertEquals(4, Calculator.add(2,2));
    }

    @Test
    public void testDiff() {
        assertEquals(4, Calculator.difference(6,2));
    }

    @Test
    public void testComp() {
        assertEquals(4, Calculator.multiplication(2,2));
    }

    @Test
    public void testDiv() {
        assertEquals(4, Calculator.div(8,2));
    }
}