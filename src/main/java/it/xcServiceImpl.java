package it;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;


@Service
public class xcServiceImpl implements xcService {
    @Resource
    private xcMapper xcMapper;

    @Override
    public PageResult pageOrder(pageDTO dto) {
        PageHelper.startPage(dto.getPage(), dto.getPageSize());
        Page<Order> page = xcMapper.pageOrder(dto);
        return new PageResult(page.getTotal(), page.getResult());
    }

    @Override
    public Long addOrder(OrderDTO orderDTO) {
        if (orderDTO.getStatus() == null) {
            orderDTO.setStatus(0);   // 0 = 待支付
        }
        LocalDateTime now = LocalDateTime.now();
        orderDTO.setCreateTime(now);
        orderDTO.setUpdateTime(now);
        Order order = new Order();
        BeanUtils.copyProperties(orderDTO, order);
        order.setNumber(String.valueOf(System.currentTimeMillis()));

        xcMapper.addOrder(order);
        return order.getId();
    }


}
