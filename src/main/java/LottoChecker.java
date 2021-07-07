import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class LottoChecker {
    List<Integer> lastWeekLottoNumbers;
    int bonusBallNumber;

    public LottoChecker(String lastWeekLottoNumbers, int bonusBallNumber) {
        this.lastWeekLottoNumbers = Arrays.asList(lastWeekLottoNumbers.split(","))
                .stream()
                .map(s -> Integer.parseInt(s.trim()))
                .collect(Collectors.toList());
        this.bonusBallNumber = bonusBallNumber;
    }

    public List<Result> checkLottoNumbers(List<Lotto> lottos) {
        List<Result> results = new ArrayList<>();
        for (Lotto lotto : lottos) {
            List<Integer> lottoNumbers = lotto.getLottoNumbers();
            results.add(makeResult(correctNumberCount(lottoNumbers), isBonusBallCorrect(lottoNumbers)));
        }
        return results;
    }

    public Result makeResult(int correctNumberCount, boolean isBonusBallContain) {
        if (correctNumberCount == 6) {
            return Result.FIRST;
        } else if (correctNumberCount == 5 && isBonusBallContain) {
            return Result.SECOND;
        } else if (correctNumberCount == 5 || correctNumberCount == 4 && isBonusBallContain) {
            return Result.THIRD;
        } else if (correctNumberCount == 4 || correctNumberCount == 3 && isBonusBallContain) {
            return Result.FOURTH;
        } else if (correctNumberCount == 3 || correctNumberCount == 2 && isBonusBallContain) {
            return Result.FIFTH;
        } else {
            return Result.FAIL;
        }
    }

    public int correctNumberCount(List<Integer> lottoNumbers) {
        int sum = 0;
        for(Integer number : lastWeekLottoNumbers){
            sum += Collections.frequency(lottoNumbers, number);
        }
        return sum;
    }

    public boolean isBonusBallCorrect(List<Integer> lottoNumbers) {
        return lottoNumbers.contains(bonusBallNumber);
    }

}
