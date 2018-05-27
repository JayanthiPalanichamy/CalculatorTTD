
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ArrayTest {
    List<Integer> arrayList;
    @Before
    public void setUp(){
        arrayList = Arrays.asList(1,100,0,2,3);

    }
    @Test
    public void returnMinAsZeroFromGivenArray() {
        assertEquals(0,CalculatorArray.minValue(arrayList));
    }
}
