package it;

import com.github.pagehelper.Page;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.Map;
@Mapper
public interface xcMapper {

    /* 查询在 resources/mapper/xcMapper.xml 里，返回值类型必须跟 resultType 对上 */
    Page<Order> pageOrder(pageDTO pageDTO);

    int addOrder(Order order);
}
