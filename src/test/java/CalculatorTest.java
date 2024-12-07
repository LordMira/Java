import org.example.Calculator;
import org.junit.Test;
import org.mockito.MockedStatic;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void testAddWithMock() {
        try (MockedStatic<Calculator> mockedStatic = Mockito.mockStatic(Calculator.class)) {
            mockedStatic.when(() -> Calculator.add(2, 3)).thenReturn(5);

            assertEquals(5, Calculator.add(2, 3));
            mockedStatic.verify(() -> Calculator.add(2, 3));
        }
    }

    @Test
    public void testDifferenceWithMock() {
        try (MockedStatic<Calculator> mockedStatic = Mockito.mockStatic(Calculator.class)) {
            mockedStatic.when(() -> Calculator.difference(10, 5)).thenReturn(5);

            assertEquals(5, Calculator.difference(10, 5));
            mockedStatic.verify(() -> Calculator.difference(10, 5));
        }
    }

    @Test
    public void testMultiplicationWithMock() {
        try (MockedStatic<Calculator> mockedStatic = Mockito.mockStatic(Calculator.class)) {
            mockedStatic.when(() -> Calculator.multiplication(3, 4)).thenReturn(12);

            assertEquals(12, Calculator.multiplication(3, 4));
            mockedStatic.verify(() -> Calculator.multiplication(3, 4));
        }
    }

    @Test
    public void testDivWithMock() {
        try (MockedStatic<Calculator> mockedStatic = Mockito.mockStatic(Calculator.class)) {
            mockedStatic.when(() -> Calculator.div(10, 2)).thenReturn(5);

            assertEquals(5, Calculator.div(10, 2));
            mockedStatic.verify(() -> Calculator.div(10, 2));
        }
    }
}
