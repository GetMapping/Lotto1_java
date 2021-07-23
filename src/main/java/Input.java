import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Input {
    private final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public int moneyInput() throws IOException {
        System.out.println("구매 금액을 입력해주세요.");
        return Integer.parseInt(bufferedReader.readLine());
    }

    public int manualQuantityInput() throws IOException{
        System.out.println("수동으로 구매할 로또 수를 입력해 주세요.");
        return Integer.parseInt(bufferedReader.readLine());
    }

    public String manualLottoNumberInput() throws IOException{
        return bufferedReader.readLine();
    }

    public String lastWeek_NumberInput() throws IOException {
        System.out.println("지난 주 당첨 번호를 입력해주세요.");
        return bufferedReader.readLine();
    }

    public int bonusBallInput() throws IOException {
        System.out.println("보너스 볼을 입력해주세요.");
        return Integer.parseInt(bufferedReader.readLine());
    }
}
