package idv.nick.rocketmq_demo.endpoint;

import idv.nick.rocketmq_demo.domain.Order;
import idv.nick.rocketmq_demo.mapper.OrderMapper;
import idv.nick.rocketmq_demo.service.OrderProducer;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/order")
public class OrderController {
    private final OrderProducer orderProducer;
    private final OrderMapper orderMapper;

    @PostMapping
    public Order createOrder(@RequestBody Order order) {
        orderMapper.insert(order);
        orderProducer.sendOrderNotification(order);
        return order;
    }

    @GetMapping
    public List<Order> getAllOrders() {
        return orderMapper.selectList(null);
    }
}
