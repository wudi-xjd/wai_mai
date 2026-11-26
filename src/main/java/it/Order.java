package it;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class Order implements Serializable {
    private Long id;
    private String number;
    private Integer status;      // 表里是 tinyint
    private Integer userId;         // user_id → userId 靠驼峰
    private BigDecimal amount;   // 金额必须 BigDecimal
    private String remark;
    private LocalDateTime createTime;  // create_time
    private LocalDateTime updateTime;  // update_time
}