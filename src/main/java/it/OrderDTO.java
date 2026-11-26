package it;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class OrderDTO {
    Long id;
    Integer status;
    Integer userId;
    BigDecimal amount;
    String remark;
    LocalDateTime createTime;
    LocalDateTime updateTime;

}
