
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ArrayTest {
    List<Integer> arrayList1;
    List<Integer> arrayList2;

    @Before
    public void setUp(){
        arrayList1 = Arrays.asList(1,10,0,2,3);
        arrayList2 = Arrays.asList(100,-1,9,4,11);
    }

    @Test
    public void returnMinAsZeroFromGivenArray() {
        assertEquals(0,CalculatorArray.minValue(arrayList1));
    }

    @Test
    public void returnMinValueMinusOneFromGivenArray() {
        assertEquals(-1,CalculatorArray.minValue(arrayList2));

    }

    @Test
    public void returnHundredAsMaxValueFromGivenArray() {
        assertEquals(100,CalculatorArray.maxValue(arrayList2));
    }
}
