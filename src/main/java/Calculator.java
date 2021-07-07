import java.util.List;

public class Calculator {

    public static final int LOTTO_AMOUNT = 1000;

    public double calculateProfitRate(List<Result> results) {
        int sum = results.stream().mapToInt(Result::getPrize).sum();
        double profitRate = (double) sum / (results.size()*1000);
        return Math.round(profitRate * 100)/100.0;
    }
}
