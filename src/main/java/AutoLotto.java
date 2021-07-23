import java.util.Comparator;

public class AutoLotto extends Lotto {

    public AutoLotto() {
        makeRandomNumbers();
    }

    private void makeRandomNumbers() {
        Random random = new Random();
        super.lotto = random.makeSixNumbers();
        super.lotto.sort(Comparator.naturalOrder());
    }
}
