package lv.nixx.poc.monolith;

import lv.nixx.poc.monolith.orders.OrderService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

//TODO Реализовать пакет eventutils (не модуль)
//TODO Реализовать пример api/internal
//TODO Реализовать пример "неправильного" вызова для падения теста

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

    private final OrderService orderService;
    private final ConfigurableApplicationContext context;

    public DemoApplication(OrderService orderService, ConfigurableApplicationContext context) {
        this.orderService = orderService;
        this.context = context;
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(String... args) {
        orderService.placeOrder(1L, 100L);

        context.close();
    }
}
