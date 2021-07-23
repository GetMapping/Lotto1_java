import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ManualLotto extends Lotto {
    public ManualLotto(String numbers) {
        super.lotto = makeNumberByList(numbers);
    }

    private List<Integer> makeNumberByList(String numbers){
         return Arrays.stream(numbers.split(", "))
                 .mapToInt(Integer::parseInt)
                 .boxed()
                 .collect(Collectors.toList());
    }

}
