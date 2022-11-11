package fooddelivery.domain;

import fooddelivery.domain.*;
import fooddelivery.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class FoodPicked extends AbstractEvent {

    private Long id;
    private Long orderId;
    private String status;
    private String address;

    public FoodPicked(Delivery aggregate){
        super(aggregate);
    }
    public FoodPicked(){
        super();
    }
}
