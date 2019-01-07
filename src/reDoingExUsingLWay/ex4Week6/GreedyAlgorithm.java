package reDoingExUsingLWay.ex4Week6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class GreedyAlgorithm {
    public List<Money> change(Integer amount){
        List<Money> change = new ArrayList<>();
        List<Money> moneys = getMoneys();
        while (amount>0.0){

            Money money = moneys.get(0);
            if (money.isApplicable(amount)){
                change.add(money);
                amount -= money.getAmount();
            }
            else {
                Collections.rotate(moneys,-1);
            }
        }
        return change;

    }

    private List<Money> getMoneys() {
        return new ArrayList<>(Arrays.asList(new Cent50(),
                new Cent20(),new Cent10(),new Cent5(),new Cent2(),new Cent1()));
    }
}