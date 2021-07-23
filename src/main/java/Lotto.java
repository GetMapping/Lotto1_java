import java.util.ArrayList;
import java.util.List;

public abstract class Lotto {
    protected List<Integer> lotto = new ArrayList<>();

    public List<Integer> getLottoNumbers(){
        return lotto;
    }
}
