package idv.nick.rocketmq_demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import idv.nick.rocketmq_demo.domain.Order;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderMapper extends BaseMapper<Order> {
}
