import java.util.Comparator;
import java.util.List;

public class CalculatorArray {
    public static int minValue(List<Integer> arrayList) {
        return arrayList.stream().min(Comparator.naturalOrder()).orElse(0);
    }

    public static int maxValue(List<Integer> arrayList2) {
        return arrayList2.stream().max(Comparator.naturalOrder()).orElse(-1);
    }
}
