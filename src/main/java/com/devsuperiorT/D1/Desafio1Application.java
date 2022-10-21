package com.devsuperiorT.D1;

import com.devsuperiorT.entities.Order;
import com.devsuperiorT.services.OrderService;
import com.devsuperiorT.services.ShippingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.util.Locale;
import java.util.Scanner;

@SpringBootApplication
@ComponentScan({"com.devsuperiorT"})
public class Desafio1Application implements CommandLineRunner {

	@Autowired
	private OrderService orderService;
	@Autowired
	private ShippingService shippingService;

	public static void main(String[] args) {
		SpringApplication.run(Desafio1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("\nExemplo 1 ----------------------------");
		Order order1 = new Order(1034,150.0,20.0);
		shippingService.shipment(order1);
		System.out.println(order1.getCode());
		System.out.println(orderService.total(order1));

		System.out.println("\nExemplo 2 ----------------------------");
		Order order2 = new Order(2282,800.0,10.0);
		shippingService.shipment(order2);
		System.out.println(order2.getCode());
		System.out.println(orderService.total(order2));

		System.out.println("\nExemplo 3 ----------------------------");
		Order order3 = new Order(1309,95.90,0.0);
		shippingService.shipment(order3);
		System.out.println(order3.getCode());
		System.out.println(orderService.total(order3));
	}
}
