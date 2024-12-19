package idv.nick.rocketmq_demo.service;

import idv.nick.rocketmq_demo.domain.Order;
import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RocketMQMessageListener(topic = "order_topic", consumerGroup = "logistics_group")
public class LogisticsConsumer implements RocketMQListener<Order> {

    @Override
    public void onMessage(Order order) {
        log.info("Logistics received order: {}", order);
    }

}
