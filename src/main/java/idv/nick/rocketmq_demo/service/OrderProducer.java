package idv.nick.rocketmq_demo.service;

import idv.nick.rocketmq_demo.domain.Order;
import lombok.RequiredArgsConstructor;
import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class OrderProducer {
    private final RocketMQTemplate rocketMQTemplate;

    public void sendOrderNotification(Order order) {
        rocketMQTemplate.convertAndSend("order_topic", order);
    }

}
