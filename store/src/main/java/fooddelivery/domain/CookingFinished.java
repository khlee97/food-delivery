package fooddelivery.domain;

import fooddelivery.domain.*;
import fooddelivery.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class CookingFinished extends AbstractEvent {

    private Long id;
    private Long orderId;
    private String status;

    public CookingFinished(FoodCooking aggregate){
        super(aggregate);
    }
    public CookingFinished(){
        super();
    }
}
