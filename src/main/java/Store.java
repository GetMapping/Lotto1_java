import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Store {
    private static final Input input = new Input();

    public List<Lotto> buyLotto(int money) throws IOException {
        List<Lotto> lottos = new ArrayList<>();

        Calculator calculator = new Calculator();

        int manualLottoQuantity = input.manualQuantityInput();
        int autoLottoQuantity = calculator.autoLottoQuantity(money, manualLottoQuantity);

        publishManualLotto(lottos, manualLottoQuantity);
        publishAutoLotto(lottos, autoLottoQuantity);

        return lottos;
    }

    private void publishManualLotto(List<Lotto> lottos, int manualLottoQuantity) throws IOException {
        System.out.println("수동으로 구매할 번호를 입력해 주세요.");
        for (int i = 0; i < manualLottoQuantity; i++) {
            String manualLottoNumbers = input.manualLottoNumberInput();
            lottos.add(new ManualLotto(manualLottoNumbers));
        }
    }

    private void publishAutoLotto(List<Lotto> lottos, int autoLottoQuantity) {
        for (int i = 0; i < autoLottoQuantity; i++) {
            lottos.add(new AutoLotto());
        }
    }
}
