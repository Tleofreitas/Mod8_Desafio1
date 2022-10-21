package com.devsuperiorT.services;

import com.devsuperiorT.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private ShippingService shippingService;

    public Double total(Order order) {
        Double freteA = shippingService.shipment(order);
        Double total = order.getBasic() - order.getBasic() * (order.getDiscount()/100) + freteA;
        return total;
    }
}
