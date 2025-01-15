package untitled.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import untitled.domain.*;
import untitled.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class StockDecrease extends AbstractEvent {

    private Long id;
    private String stock;

    public StockDecrease(Inventory aggregate) {
        super(aggregate);
    }

    public StockDecrease() {
        super();
    }
}
//>>> DDD / Domain Event
