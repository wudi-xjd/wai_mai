package it;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.util.Map;

@Service
public class xcServiceImpl implements xcService {
    @Resource
    private xcMapper xcMapper;

    @Override
    public PageResult pageOrder(pageDTO dto) {
        PageHelper.startPage(dto.getPage(), dto.getPageSize());
        Page<Map<String,Object>> page = xcMapper.pageOrder(dto);
        return new PageResult(page.getTotal(), page.getResult());
    }

    @Override
    public void addOrder(OrderDTO orderDTO) {
        if (orderDTO.getStatus() == null) {
            orderDTO.setStatus(0);   // 0 = 待支付
        }
        LocalDateTime now = LocalDateTime.now();
        orderDTO.setCreateTime(now);
        orderDTO.setUpdateTime(now);
        xcMapper.addOrder(orderDTO);
    }


}
