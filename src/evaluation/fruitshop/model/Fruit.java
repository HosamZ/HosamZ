package evaluation.fruitshop.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Value;

@Value
@Builder
public class Fruit {
    private String name;
    private int amount;
}