
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ArrayTest {

    @Test
    public void returnMinAsZeroFromGivenArray() {
        List<Integer> arrayList = Arrays.asList(1,100,0,2,3);

        assertEquals(0,CalculatorArray.minValue(arrayList));
    }
}
