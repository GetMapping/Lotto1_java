import java.util.ArrayList;
import java.util.List;

public class Store {

    public static final int LOTTO_AMOUNT = 1000;

    public List<Lotto> buyLotto(int money) {
        List<Lotto> lottos = new ArrayList<>();
        for (int i = 0; i < money / LOTTO_AMOUNT; i++) {
            lottos.add(new Lotto());
        }
        return lottos;
    }
}
