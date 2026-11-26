package it;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class OrderDTO {
    Long id;
    String number;
    Integer status;
    Integer userId;
    BigDecimal amount;
    String remark;
    LocalDateTime createTime;
    LocalDateTime updateTime;
}
