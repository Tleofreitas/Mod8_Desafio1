package com.devsuperiorT.services;

import com.devsuperiorT.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {

    public Double shipment (Order order) {
        Double frete = 0.0;
        Double valorComDesconto = order.getBasic() - (order.getBasic() * (order.getDiscount()/100));
        if (valorComDesconto < 100) {
            frete = 20.0;
        } else if (valorComDesconto < 200) {
            frete = 12.0;
        } else {
            frete = 0.0;
        }
        return frete;
    }
}
