import java.io.IOException;
import java.util.List;

public class Application {
    public static void main(String[] args) throws IOException {
        Store store = new Store();
        Input input = new Input();
        Printer printer = new Printer();
        Calculator calculator = new Calculator();

        int money = input.MoneyInput();
        List<Lotto> lottos = store.buyLotto(money);
        printer.printLottoNumbers(lottos);

        String lastWeekNumbers = input.lastWeek_NumberInput();
        int bonusBall = input.bonusBallInput();
        LottoChecker lottoChecker = new LottoChecker(lastWeekNumbers, bonusBall);
        List<Result> results = lottoChecker.checkLottoNumbers(lottos);

        double profitRate = calculator.calculateProfitRate(results);
        printer.printLottoResults(results);
        printer.printProfitRate(profitRate);

    }
}
