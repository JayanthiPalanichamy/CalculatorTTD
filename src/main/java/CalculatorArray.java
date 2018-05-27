import java.util.Comparator;
import java.util.List;

public class CalculatorArray {
    public static int minValue(List<Integer> arrayList) {
        return arrayList.stream().min(Comparator.naturalOrder()).orElse(0);
    }

    public static int maxValue(List<Integer> arrayList) {
        return arrayList.stream().max(Comparator.naturalOrder()).orElse(-1);
    }

    public static double averageValue(List<Integer> arrayList) {
        return arrayList.stream().mapToDouble(x->x).average().orElse(-1.0);
    }
}
