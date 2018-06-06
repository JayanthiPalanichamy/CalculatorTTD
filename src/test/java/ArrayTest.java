import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ArrayTest {
    List<Integer> arrayList1;
    List<Integer> arrayList2;
    List<Integer> arrayList3;

    @Before
    public void setUp() {
        arrayList1 = Arrays.asList(1, 10, 0, 2, 3);
        arrayList2 = Arrays.asList(100, -1, 9, 4, 11);
        arrayList3 = new ArrayList<>();
    }

    @Test
    public void returnMinValueFromGivenArray() {
        assertEquals(0, CalculatorArray.minValue(arrayList1));
    }

    @Test
    public void returnMaxValueFromGivenArray() {
        assertEquals(100, CalculatorArray.maxValue(arrayList2));
    }

    @Test
    public void returnMinusOneAsMinWhenEmptyArrayIsGiven() {
        assertEquals(-1, CalculatorArray.minValue(arrayList3));
    }

    @Test
    public void returnMinusOneAsMaxWhenEmptyArrayIsGiven() {
        assertEquals(-1, CalculatorArray.maxValue(arrayList3));
    }

    @Test
    public void returnAverageFromGivenArray() {
        assertEquals(24.6, CalculatorArray.averageValue(arrayList2), 0.001);
    }
}
