import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Input {
    private final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public int MoneyInput() throws IOException {
        System.out.println("구매 금액을 입력해주세요.");
        return Integer.parseInt(bufferedReader.readLine());
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
