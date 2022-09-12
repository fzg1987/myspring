package com.fzg.myspring.entity;

import com.fzg.myspring.Component;
import com.fzg.myspring.Value;
import lombok.Data;

@Data
@Component("myOrder")
public class Order {
    @Value("xx123")
    private String OrderId;
    @Value("123.3")
    private Float price;
}
