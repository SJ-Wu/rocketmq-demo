package idv.nick.rocketmq_demo.domain;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.time.LocalDateTime;

import static com.baomidou.mybatisplus.annotation.IdType.AUTO;

@Data
@TableName("orders")
public class Order {
    @TableId(value = "id", type = AUTO)
    private Long id;
    private String orderId;
    private String productName;
    private Integer quantity;
    private LocalDateTime createdTime = LocalDateTime.now();

}
