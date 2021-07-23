import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Random {
    private final List<Integer> numbers = new ArrayList<>();
    private static final List<Integer> tempNumbers = new ArrayList<>();

    public Random() {
        tempNumbers.clear();
        for (int i = 1; i < 45; i++) {
            tempNumbers.add(i);
        }
    }

    public List<Integer> makeSixNumbers() {
        numbers.clear();
        Collections.shuffle(tempNumbers);

        for (int i = 0; i < 6; i++) {
            numbers.add(tempNumbers.get(i));
        }

        return numbers;
    }
}
