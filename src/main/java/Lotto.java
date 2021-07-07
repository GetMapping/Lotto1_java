import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Lotto {
    private final List<Integer> lottoNumbers;

    public Lotto() {
        this.lottoNumbers = makeRandomNumbers();
    }

    public List<Integer> makeRandomNumbers() {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 45; i++) {
            numbers.add(i);
        }

        Collections.shuffle(numbers);
        List<Integer> randomNumbers = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            randomNumbers.add(numbers.get(i));
        }
        randomNumbers.sort(Comparator.naturalOrder());
        return randomNumbers;
    }

    public List<Integer> getLottoNumbers() {
        return lottoNumbers;
    }
}
