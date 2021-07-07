import java.util.Collections;
import java.util.List;

public class Printer {
    public void printLottoNumbers(List<Lotto> lottos) {
        for (Lotto lotto : lottos) {
            System.out.println(lotto.getLottoNumbers());
        }
    }

    public void printLottoResults(List<Result> results) {
        System.out.println("당첨통계");
        System.out.println("--------------------------");
        System.out.println("3개 일치 (5000)원- " + Collections.frequency(results, Result.FIFTH) + "개");
        System.out.println("4개 일치 (50000원)- " + Collections.frequency(results, Result.FOURTH) + "개");
        System.out.println("5개 일치 (1500000원)- " + Collections.frequency(results, Result.THIRD) + "개");
        System.out.println("5개 일치, 보너스 볼 일치(30000000원)- " + Collections.frequency(results, Result.SECOND) + "개");
        System.out.println("6개 일치 (200000000원)- " + Collections.frequency(results, Result.FIRST) + "개");
    }

    public void printProfitRate(double profitRate){
        System.out.print("총 수익률은 " + profitRate + "입니다.");
        if(profitRate >= 1){
            System.out.println("(기준이 1이기 때문에 결과적으로 이득이라는 의미임)");
        } else {
            System.out.println("(기준이 1이기 때문에 결과적으로 손해라는 의미임)");
        }
    }

}
