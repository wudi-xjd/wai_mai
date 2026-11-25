package it;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
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




}
